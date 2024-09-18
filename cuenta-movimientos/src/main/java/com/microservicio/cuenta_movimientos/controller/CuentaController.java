package com.microservicio.cuenta_movimientos.controller;

import com.microservicio.cuenta_movimientos.model.Cuenta;
import com.microservicio.cuenta_movimientos.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping
    public List<Cuenta> getAllCuentas() {
        return cuentaService.getAllCuentas();
    }

    @PostMapping
    public ResponseEntity<Cuenta> createCuenta(@RequestBody Cuenta cuenta) {
        try {
            Cuenta nuevaCuenta = cuentaService.createCuenta(cuenta);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevaCuenta);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public Cuenta updateCuenta(@PathVariable Long id, @RequestBody Cuenta cuenta) {
        return cuentaService.updateCuenta(id, cuenta);
    }

    @DeleteMapping("/{id}")
    public void deleteCuenta(@PathVariable Long id) {
        cuentaService.deleteCuenta(id);
    }
}
