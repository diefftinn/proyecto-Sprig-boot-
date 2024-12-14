package com.ejercio2.Ejerci2.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;  // Asegúrate de usar la anotación correcta

@Entity  // Marca la clase como una entidad de JPA
public class Categoria {

    @Id  // Marca el campo como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Autoincremento de la clave primaria
    private Long id;  // Este será el ID de la categoría

    private String nombre;  // Nombre de la categoría

    // Getters y Setters para los campos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
