package com.microservicio.cuenta_movimientos.repository;

import com.microservicio.cuenta_movimientos.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}
