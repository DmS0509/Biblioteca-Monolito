package com.dms.uptc.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dms.uptc.example.domains.Editorial;

public interface EditorialRepository extends JpaRepository<Editorial, Integer> {

}
