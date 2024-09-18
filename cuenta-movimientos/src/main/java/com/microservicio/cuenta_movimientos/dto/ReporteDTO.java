package com.microservicio.cuenta_movimientos.dto;

import lombok.Data;

@Data
public class ReporteDTO {
    private String fecha;
    private String cliente;
    private String numeroCuenta;
    private String tipo;
    private Double saldoInicial;
    private Boolean estado;
    private Double movimiento;
    private Double saldoDisponible;
}
