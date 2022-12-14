package com.example.crudspringboot.domain.service;

import java.util.List;
import java.util.Optional;

import com.example.crudspringboot.domain.Persona;

public interface IpersonaService {
    public List<Persona> listar();
    public Optional<Persona>listarPorId(int id);
    public void save(Persona p);
    public void delete(int id);
}
