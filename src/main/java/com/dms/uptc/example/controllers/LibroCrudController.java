package com.dms.uptc.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dms.uptc.example.services.EditorialService;

@Controller
public class LibroCrudController {

    private final EditorialService editorialService;

    public LibroCrudController(EditorialService editorialService) {
        this.editorialService = editorialService;
    }

    @RequestMapping("/libros/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("editoriales", editorialService.buscarTodos());
        return "formlibro";
    }
}
