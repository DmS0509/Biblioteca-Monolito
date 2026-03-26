package com.dms.uptc.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dms.uptc.example.domains.Libro;
import com.dms.uptc.example.repositories.LibroRepository;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> buscarDestacados(){
       return libroRepository.findAll();
    }

}
