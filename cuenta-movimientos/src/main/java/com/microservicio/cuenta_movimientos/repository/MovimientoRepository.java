package com.microservicio.cuenta_movimientos.repository;

import com.microservicio.cuenta_movimientos.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
}