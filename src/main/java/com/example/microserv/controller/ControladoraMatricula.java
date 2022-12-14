package com.example.microserv.controller;

import com.example.microserv.entity.EntidadMatricula;
import com.example.microserv.service.interfaz.InterfazMatricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/matricula")
public class ControladoraMatricula {

    @Autowired
    private InterfazMatricula inter;

    @PostMapping
    public void Create(@RequestBody EntidadMatricula pEntidadMatricula) {
        inter.save(pEntidadMatricula);
    }

    @GetMapping
    public List<EntidadMatricula> Read() {
        return (List<EntidadMatricula>) inter.findAll();
    }

    @PutMapping
    public void Update(@RequestBody EntidadMatricula pEntidadMatricula){
        inter.save(pEntidadMatricula);
    }

    @DeleteMapping("/{codigo}")
    public void Delete(@PathVariable("codigo") Integer pId){
        inter.deleteById(pId);
    }
}
