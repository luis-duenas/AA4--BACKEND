package com.example.microserv.controller;

import com.example.microserv.entity.EntidadClase;
import com.example.microserv.service.interfaz.InterfazClase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/clase")

public class ControladoraClase{

    @Autowired
    private InterfazClase repo;

    @PostMapping
    public void Create(@RequestBody EntidadClase pEntidadClase){
        repo.save(pEntidadClase);
    }

    @GetMapping
    public List<EntidadClase> Read(){ return (List<EntidadClase>) repo.findAll();}

    @PutMapping
    public void Update(@RequestBody EntidadClase pEntidadClase) {
        repo.save(pEntidadClase);
    }

    @DeleteMapping(value = "/{codigo}")
    public void Delete(@PathVariable("codigo") Integer pId){
        repo.deleteById(pId);
    }

}
