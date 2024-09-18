package com.microservicio.cuenta_movimientos.controller;

import com.microservicio.cuenta_movimientos.service.ReporteService;
import com.microservicio.cuenta_movimientos.dto.ReporteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportes")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @GetMapping
    public List<ReporteDTO> getReporte(@RequestParam String fecha, @RequestParam String cliente) {
        return reporteService.getReporte(fecha, cliente);
    }
}
