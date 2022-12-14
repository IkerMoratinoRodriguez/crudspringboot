package com.example.crudspringboot.infraestructure;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.crudspringboot.domain.Persona;
import com.example.crudspringboot.domain.repository.PersonaRepository;

public class CrudRepository implements PersonaRepository{

    private final IRepository repo;

    @Autowired
    public CrudRepository(final IRepository repo){
        this.repo = repo;
    }

    @Override
    public List<Persona> findAll(){
        return (List<Persona>)repo.findAll();
    }

    @Override
    public Optional<Persona> findByID(int id){
        return repo.findById(id);
    }

    @Override
    public void save(Persona p){
        repo.save(p);
    }

    @Override
    public void deleteByID(int id){
        repo.deleteById(id);
    }
    
}
