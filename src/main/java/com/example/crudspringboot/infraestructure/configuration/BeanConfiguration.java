package com.example.crudspringboot.infraestructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.crudspringboot.domain.Persona;
import com.example.crudspringboot.domain.repository.PersonaRepository;
import com.example.crudspringboot.infraestructure.repository.CrudRepository;
import com.example.crudspringboot.infraestructure.repository.IRepository;

@Configuration
public class BeanConfiguration {

    @Bean
    PersonaRepository personaRepository(IRepository repo){
        return (new CrudRepository(repo));
    }
    
}
