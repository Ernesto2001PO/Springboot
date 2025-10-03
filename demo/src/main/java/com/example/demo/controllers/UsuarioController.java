package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.model.Empleados;

@Controller
public class UsuarioController {

    @GetMapping("/detalles_info2")
    public String info(Model model) {
        Empleados empleado1 = new Empleados(null, "Paz", null, "Gerente", 23, 482353, 1);
        model.addAttribute("Titulo", "Información del Empleado");
        model.addAttribute("Empleado", empleado1);
        return "detalles_info2";

    }

    @ModelAttribute("Empleados")
    public List<Empleados> listaEmpleados() {
        return Arrays.asList(
                new Empleados("Juan",
                        "perez",
                        "calle 1",
                        "gerente",
                        0,
                        0,
                        0),
                new Empleados("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
                new Empleados("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
                new Empleados("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
                new Empleados("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05));
    }

}
