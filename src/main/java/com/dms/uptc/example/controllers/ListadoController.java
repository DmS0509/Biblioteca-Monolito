package com.dms.uptc.example.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dms.uptc.example.domains.Libro;
import com.dms.uptc.example.services.LibroService;

@Controller
public class ListadoController {

    private final LibroService libroService;

    public ListadoController(LibroService libroService) {
        this.libroService = libroService;
    }

    @RequestMapping("/")
    public String listarLibros(Model model){
        List<Libro> destacados = libroService.buscarDestacados();
        model.addAttribute("libros", destacados);
        return "listado";
    }
}
