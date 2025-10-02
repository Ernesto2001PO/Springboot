package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmpleadosDTO {

    private String nombre, apellido;
    int edad;

    public EmpleadosDTO() {

    }

    public EmpleadosDTO setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EmpleadosDTO setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public EmpleadosDTO setEdad(int edad) {
        this.edad = edad;
        return  this;
    }



    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

}
