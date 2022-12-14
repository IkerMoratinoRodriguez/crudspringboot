package com.example.crudspringboot.infraestructure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crudspringboot.domain.Persona;

@Repository
public interface IRepository extends CrudRepository<Persona, Integer>{
    
}
