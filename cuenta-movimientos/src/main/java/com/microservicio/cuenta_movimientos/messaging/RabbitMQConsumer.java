package com.microservicio.cuenta_movimientos.messaging;

import com.microservicio.cuenta_movimientos.model.Movimiento;
import com.microservicio.cuenta_movimientos.service.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @Autowired
    private MovimientoService movimientoService;

    @RabbitListener(queues = "movimientos_queue")
    public void receiveMessage(Movimiento movimiento) {
        movimientoService.createMovimiento(movimiento);
    }
}
