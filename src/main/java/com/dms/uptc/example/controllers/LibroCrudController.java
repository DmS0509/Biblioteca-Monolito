package com.dms.uptc.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dms.uptc.example.domains.Libro;
import com.dms.uptc.example.services.EditorialService;
import com.dms.uptc.example.services.LibroService;

@Controller
public class LibroCrudController {

    private final EditorialService editorialService;
    private final LibroService libroService;

    public LibroCrudController(EditorialService editorialService, LibroService libroService) {
        this.editorialService = editorialService;
        this.libroService = libroService;

    }

    @RequestMapping("/libros/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("libros", libroService.buscarDestacados()); // Agregado
        model.addAttribute("libro", new Libro());                 // Agregado
        model.addAttribute("editoriales", editorialService.buscarTodos());
        return "listado";
    }

    @PostMapping("/libros/guardar")
    public String guardar(Libro libro) {
        libroService.guardar(libro);
        return "redirect:/";
    }

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("libros", libroService.buscarDestacados());
        model.addAttribute("libro", new Libro());
        model.addAttribute("editoriales", editorialService.buscarTodos());
        return "listado";
    }
}
