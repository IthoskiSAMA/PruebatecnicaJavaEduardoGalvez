package com.microservicio.cuenta_movimientos.service;

import com.microservicio.cuenta_movimientos.dto.ReporteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteService {

    public List<ReporteDTO> getReporte(String fecha, String cliente) {
        // Implementar lógica para generar reportes
        return List.of(); // Placeholder
    }
}
