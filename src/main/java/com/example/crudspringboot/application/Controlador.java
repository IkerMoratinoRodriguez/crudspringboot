package com.example.crudspringboot.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crudspringboot.domain.Persona;
import com.example.crudspringboot.domain.service.IPersonaService;

@Controller
@RequestMapping
public class Controlador {
    
    private final IPersonaService personaService;

    @Autowired
    public Controlador(IPersonaService personaService){
        this.personaService=personaService;
    }


    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona> personas = personaService.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/new")
    public String agrgar(Model model){
        model.addAttribute("persona", new Persona());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Persona p, Model model){
        personaService.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> persona = personaService.listarPorId(id);
        model.addAttribute("persona", persona);
        return "form"; //para guardar también usa el método save de arriba, igual que new
    }

    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        personaService.delete(id);
        return "redirect:/listar";
    }

}
