package com.microservicio.cuenta_movimientos.service;

import com.microservicio.cuenta_movimientos.model.Movimiento;
import com.microservicio.cuenta_movimientos.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoService {

    @Autowired
    private MovimientoRepository movimientoRepository;

    public List<Movimiento> getAllMovimientos() {
        return movimientoRepository.findAll();
    }

    public Movimiento createMovimiento(Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public Movimiento updateMovimiento(Long id, Movimiento movimiento) {
        if (movimientoRepository.existsById(id)) {
            movimiento.setId(id);
            return movimientoRepository.save(movimiento);
        }
        return null;
    }

    public void deleteMovimiento(Long id) {
        movimientoRepository.deleteById(id);
    }
}
