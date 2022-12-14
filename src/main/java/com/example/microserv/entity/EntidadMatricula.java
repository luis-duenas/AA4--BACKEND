package com.example.microserv.entity;
import javax.persistence.*;

@Entity
@Table(name = "matricula")
public class EntidadMatricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private Integer aIdMatricula;

    @Column(name = "id_clase")
    private Integer aIdClase;

    @Column(name = "id_estudiante")
    private Integer aIdEstudiante;

    public Integer getaIdMatricula() {
        return aIdMatricula;
    }

    public void setaIdMatricula(Integer aIdMatricula) {
        this.aIdMatricula = aIdMatricula;
    }

    public Integer getaIdClase() {
        return aIdClase;
    }

    public void setaIdClase(Integer aIdClase) {
        this.aIdClase = aIdClase;
    }

    public Integer getaIdEstudiante() {
        return aIdEstudiante;
    }

    public void setaIdEstudiante(Integer aIdEstudiante) {
        this.aIdEstudiante = aIdEstudiante;
    }
}

