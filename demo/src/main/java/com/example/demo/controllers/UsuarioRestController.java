package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.EmpleadosDTO;
import com.example.demo.model.Empleados;



@RestController
@RequestMapping("/api")

public class UsuarioRestController {

    @GetMapping("/detalles_info")

    public Map<String, Object> info() {
        Map<String, Object> respuesta = new HashMap<>();

        respuesta.put("nombre", "Ernesto");
        respuesta.put("apellido", "Paz");
        respuesta.put("edad", 23);

        return respuesta;

    }

    @GetMapping("/info_empleado")
    public Map<String, Object> detalle_empleado() {

        Empleados empleado1 = new Empleados("Ernesto", "Paz", "Calle1", "Gerente", 23, 482353, 1);

        Map<String, Object> respuesta = new HashMap<>();

        respuesta.put("Empleado", empleado1);

        return respuesta;
    }

    @PostMapping("path")
    public EmpleadosDTO postMethodName(@RequestBody EmpleadosDTO empleadosDTO) {
    
        return empleadosDTO;
    }
    

}
