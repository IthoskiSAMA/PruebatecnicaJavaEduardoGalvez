package com.microservicio.cliente_persona.service;

import com.microservicio.cliente_persona.model.Cliente;
import com.microservicio.cliente_persona.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> update(Long id, Cliente cliente) {
        if (clienteRepository.existsById(id)) {
            cliente.setClienteId(id);
            return Optional.of(clienteRepository.save(cliente));
        } else {
            return Optional.empty();
        }
    }

    public boolean delete(Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
