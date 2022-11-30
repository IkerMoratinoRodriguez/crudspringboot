package com.example.crudspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudspringboot.interfaceService.IpersonaService;
import com.example.crudspringboot.interfaces.IPersona;
import com.example.crudspringboot.modelo.Persona;

@Service
public class PersonaService implements IpersonaService{

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Persona p) {
        int res = 0;
        Persona persona = data.save(p); //Persona persona es la que se ha guardado en la base de datos
        if(!persona.equals(null))
            res=1;
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
}
