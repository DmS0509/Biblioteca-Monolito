package com.dms.uptc.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dms.uptc.example.domains.Libro;;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

    @Override
    @Query("from Libro v order by v.name")
    List<Libro> findAll();

    @Query("select Libro v where v.editorial.id = ?1 order by v.name")
    List<Libro> findByEditorialId(Integer editorialId);

    @Query("from libro l where l.name like %?1%")
    List<Libro> find(String consulta);
}
