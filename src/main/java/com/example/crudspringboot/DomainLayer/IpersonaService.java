package com.example.crudspringboot.DomainLayer;

import java.util.List;
import java.util.Optional;

public interface IpersonaService {
    public List<Persona> listar();
    public Optional<Persona>listarId(int id);
    public int save(Persona p);
    public void delete(int id);
}
