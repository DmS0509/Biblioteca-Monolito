package com.dms.uptc.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dms.uptc.example.domains.Editorial;
import com.dms.uptc.example.repositories.EditorialRepository;

@Service
public class EditorialService {

    private final EditorialRepository editorialRepository;

    public EditorialService(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    public List<Editorial> buscarTodos() {
        return editorialRepository.findAll();
    }
}
