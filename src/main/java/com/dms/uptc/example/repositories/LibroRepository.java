package com.dms.uptc.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dms.uptc.example.domains.Libro;;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
