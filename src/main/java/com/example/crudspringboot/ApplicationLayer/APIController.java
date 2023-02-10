package com.example.crudspringboot.ApplicationLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudspringboot.DomainLayer.IpersonaService;
import com.example.crudspringboot.DomainLayer.Persona;

@RestController
public class APIController {

    @Autowired
    private IpersonaService service;

    @GetMapping("/crudAPI/list")
    public List<Persona> listar(){
        return service.listar();
    }

    @GetMapping("/crudAPI/new/{id}/{nombre}/{telefono}")
    public String agrgar(@PathVariable int id, @PathVariable String nombre, @PathVariable String telefono){
        Persona p = new Persona(id, nombre, telefono);
        int res = service.save(p);
        if (res == 1)
            return "Persona añadida correctamente.";
        else
            return "Fallo al añadir a la persona.";
    }

    @GetMapping("/crudAPI/delete/{id}")
    public String agrgar(@PathVariable int id){
        if (service.listarId(id)== null)
            return "No existe la Persona con id "+id;
        else{
            service.delete(id);
            return "Eliminación realizada correctamente";
        }
    }

    
}
