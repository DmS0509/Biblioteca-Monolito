package com.dms.uptc.example.controllers;

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

    @RequestMapping("/librosPorEditorial")
    public String listarLibrosPorEditorial(int editorialId, Model model) {
        model.addAttribute("libros", libroService.buscarPorEditorial(editorialId));
        model.addAttribute("libro", new Libro());                 // Agregado
        model.addAttribute("editoriales", libroService.buscarDestacados()); // Agregado
        return "listado";
    }

    @RequestMapping("/buscar")
    public String buscar(String consulta, Model model) {
        model.addAttribute("libros", libroService.buscar(consulta));
        model.addAttribute("libro", new Libro());                 // Agregado
        model.addAttribute("editoriales", libroService.buscarDestacados()); // Agregado
        return "listado";
    }
}
