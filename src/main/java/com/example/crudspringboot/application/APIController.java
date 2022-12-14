package com.example.crudspringboot.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudspringboot.domain.Persona;
import com.example.crudspringboot.domain.service.IPersonaService;

@RestController
public class APIController {

    private final IPersonaService personaService;

    @Autowired
    public APIController(IPersonaService personaService){
        this.personaService=personaService;
    }

    @GetMapping("/crudAPI/list")
    public List<Persona> listar(){
        return personaService.listar();
    }

    @GetMapping("/crudAPI/new/{id}/{nombre}/{telefono}")
    public String agrgar(@PathVariable int id, @PathVariable String nombre, @PathVariable String telefono){
        Persona p = new Persona(id, nombre, telefono);
        personaService.save(p);
        return "Persona añadida correctamente";
    }

    @GetMapping("/crudAPI/delete/{id}")
    public String agrgar(@PathVariable int id){
        if (personaService.listarPorId(id)== null)
            return "No existe la Persona con id "+id;
        else{
            personaService.delete(id);
            return "Eliminación realizada correctamente";
        }
    }

    
}
