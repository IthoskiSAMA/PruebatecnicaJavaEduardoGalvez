-- BaseDatos.sql

-- Creación de la tabla Persona
CREATE TABLE Persona (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    fecha_nacimiento DATE,
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    email VARCHAR(100),
    tipo_documento VARCHAR(50),
    numero_documento VARCHAR(50) UNIQUE
);

-- Creación de la tabla Cliente (relacionada con Persona)
CREATE TABLE Cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_persona BIGINT NOT NULL,
    fecha_registro DATE,
    estado_cliente VARCHAR(50),
    FOREIGN KEY (id_persona) REFERENCES Persona(id) ON DELETE CASCADE
);

-- Creación de la tabla Cuenta (relacionada con Cliente)
CREATE TABLE Cuenta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_cliente BIGINT NOT NULL,
    numero_cuenta VARCHAR(20) UNIQUE NOT NULL,
    tipo_cuenta VARCHAR(50),
    saldo DECIMAL(15,2) DEFAULT 0,
    fecha_apertura DATE,
    estado_cuenta VARCHAR(50),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id) ON DELETE CASCADE
);

-- Creación de la tabla Movimiento (relacionada con Cuenta)
CREATE TABLE Movimiento (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_cuenta BIGINT NOT NULL,
    tipo_movimiento VARCHAR(50),
    monto DECIMAL(15,2) NOT NULL,
    fecha_movimiento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    saldo_actual DECIMAL(15,2),
    FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id) ON DELETE CASCADE
);

-- Índices para optimizar consultas
CREATE INDEX idx_cliente_persona ON Cliente(id_persona);
CREATE INDEX idx_cuenta_cliente ON Cuenta(id_cliente);
CREATE INDEX idx_movimiento_cuenta ON Movimiento(id_cuenta);
