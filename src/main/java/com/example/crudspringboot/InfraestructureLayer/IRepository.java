package com.example.crudspringboot.InfraestructureLayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crudspringboot.DomainLayer.Persona;

@Repository
public interface IRepository extends CrudRepository<Persona, Integer>{
    
}
