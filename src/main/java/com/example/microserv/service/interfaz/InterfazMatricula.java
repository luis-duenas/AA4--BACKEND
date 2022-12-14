package com.example.microserv.service.interfaz;

import com.example.microserv.entity.EntidadMatricula;
import org.springframework.data.repository.CrudRepository;

public interface InterfazMatricula extends CrudRepository<EntidadMatricula, Integer> {
}
