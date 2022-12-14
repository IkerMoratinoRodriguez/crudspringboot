package com.example.crudspringboot.domain.repository;

import java.util.List;
import java.util.Optional;

import com.example.crudspringboot.domain.Persona;

public interface PersonaRepository {

    public List<Persona> findAll();

    public Optional<Persona> findByID(int id);

    public void save(Persona p);

    public void deleteByID(int id);

    
}
