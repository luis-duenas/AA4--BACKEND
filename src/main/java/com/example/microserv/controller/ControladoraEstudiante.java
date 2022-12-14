package com.example.microserv.controller;

import com.example.microserv.entity.EntidadEstudiante;
import com.example.microserv.service.interfaz.InterfazEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/estudiante")
public class ControladoraEstudiante{

    @Autowired
    private InterfazEstudiante repo;

    @PostMapping
    public void Create(@RequestBody EntidadEstudiante pEntidadEstudiante){
        repo.save(pEntidadEstudiante);
    }

    @GetMapping
    public List<EntidadEstudiante> Read(){ return (List<EntidadEstudiante>) repo.findAll();}

    @PutMapping
    public void Update(@RequestBody EntidadEstudiante pEntidadEstudiante) {
        repo.save(pEntidadEstudiante);
    }

    @DeleteMapping(value = "/{codigo}")
    public void Delete(@PathVariable("codigo") Integer pId){
        repo.deleteById(pId);
    }

    @PutMapping(value = "/{codigo}")
    public void Update2(@PathVariable("codigo") Integer pId, @RequestBody EntidadEstudiante json){
        EntidadEstudiante rescate = repo.findById(pId).orElseThrow();

        if(!(json.getaEstudiante() ==null)){
            rescate.setaEstudiante(json.getaEstudiante());
        }

        repo.save(rescate);
    }
}
