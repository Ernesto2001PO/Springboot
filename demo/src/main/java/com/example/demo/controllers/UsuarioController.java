package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Empleados;

@Controller
public class UsuarioController {

    @GetMapping("/detalles_info2")
    public String info(Model model) {
        Empleados empleado1 = new Empleados("Ernesto", "Paz", "Calle1", "Gerente", 23, 482353, 1);
        model.addAttribute("Titulo", "Información del Empleado"); 

        model.addAttribute("Empleado", empleado1);
        return "detalles_info2";

    }

}
