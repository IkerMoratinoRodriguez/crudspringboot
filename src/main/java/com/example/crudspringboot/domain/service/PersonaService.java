package com.example.crudspringboot.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crudspringboot.domain.Persona;
import com.example.crudspringboot.domain.repository.PersonaRepository;


@Service
public class PersonaService implements IPersonaService{

    private final PersonaRepository personaRepository;

    public PersonaService(final PersonaRepository personaRepository){
        this.personaRepository=personaRepository;
    }

    @Override
    public List<Persona> listar() {
        return this.personaRepository.findAll();
    }

    @Override
    public Optional<Persona> listarPorId(int id) {
        return this.personaRepository.findByID(id);
    }

    @Override
    public void save(Persona p) {
        this.personaRepository.save(p); 
    }

    @Override
    public void delete(int id) {
        this.personaRepository.deleteByID(id);
    }
    
}
