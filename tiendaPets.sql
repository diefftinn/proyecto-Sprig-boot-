create database tiendaPets;

use tiendaPets;


-- Tabla cliente

CREATE TABLE cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);
-- Tabla producto


CREATE TABLE producto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    precio DOUBLE NOT NULL
);
-- Tabla compra


CREATE TABLE compra (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_id BIGINT NOT NULL,
    fecha TIMESTAMP NOT NULL,
    CONSTRAINT fk_cliente FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);
-- Tabla categoria


CREATE TABLE categoria (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

-- Primero, selecciona la base de datos
USE tiendaPets;

-- Insertar datos en la tabla 'cliente'
INSERT INTO cliente (nombre, email)
VALUES 
('Juan Pérez', 'juan.perez@email.com'),
('María López', 'maria.lopez@email.com'),
('Carlos García', 'carlos.garcia@email.com'),
('Ana Martínez', 'ana.martinez@email.com');

-- Insertar datos en la tabla 'producto'
INSERT INTO producto (nombre, precio)
VALUES 
('Perro Juguete', 12.99),
('Gato Rascador', 24.50),
('Paseo para perros', 50.75),
('Comida para gatos', 19.30);

-- Insertar datos en la tabla 'compra'
-- Primero necesitamos conocer los IDs de los clientes insertados
-- Asumimos que los clientes con id 1, 2, 3 y 4 han sido insertados.

INSERT INTO compra (cliente_id, fecha)
VALUES 
(1, '2024-12-01 10:30:00'),
(2, '2024-12-02 14:45:00'),
(3, '2024-12-03 09:00:00'),
(4, '2024-12-04 16:20:00');

-- Insertar datos en la tabla 'categoria'
INSERT INTO categoria (nombre)
VALUES 
('Juguetes para Mascotas'),
('Alimentos para Mascotas'),
('Accesorios para Mascotas'),
('Ropa para Mascotas');

/*Relaciones
Compra tiene una relación muchos-a-uno con Cliente:
En compra, la columna cliente_id es una clave foránea que referencia cliente(id).
Esta estructura está configurada para funcionar con JPA y H2 (o cualquier otra base de datos relacional). Si necesitas algún ajuste o ejemplo de datos de prueba, házmelo saber. 😊