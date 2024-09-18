package com.microservicio.cuenta_movimientos.service;

import com.microservicio.cuenta_movimientos.model.Cuenta;
import com.microservicio.cuenta_movimientos.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    public List<Cuenta> getAllCuentas() {
        return cuentaRepository.findAll();
    }

    public Cuenta createCuenta(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    public Cuenta updateCuenta(Long id, Cuenta cuenta) {
        if (cuentaRepository.existsById(id)) {
            cuenta.setId(id);
            return cuentaRepository.save(cuenta);
        }
        return null;
    }

    public void deleteCuenta(Long id) {
        cuentaRepository.deleteById(id);
    }
}
