package com.example.crudspringboot.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crudspringboot.modelo.Persona;

@Repository
public interface IRepository extends CrudRepository<Persona, Integer>{
    
}
