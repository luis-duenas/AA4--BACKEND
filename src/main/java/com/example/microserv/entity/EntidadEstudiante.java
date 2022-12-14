package com.example.microserv.entity;

import javax.persistence.*;;

@Entity
@Table(name = "estudiante")
public class EntidadEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "IdEstudiante")
    private Integer aIdEstudiante;
    @Column(name = "nombres")
    private String aEstudiante;

    public Integer getaIdEstudiante() {
        return aIdEstudiante;
    }

    public void setaIdEstudiante(Integer aIdEstudiante) {
        this.aIdEstudiante = aIdEstudiante;
    }

    public String getaEstudiante() {
        return aEstudiante;
    }

    public void setaEstudiante(String aEstudiante) {
        this.aEstudiante = aEstudiante;
    }

    public String getaApellidos() {
        return aApellidos;
    }

    public void setaApellidos(String aApellidos) {
        this.aApellidos = aApellidos;
    }

    @Column(name = "apellidos")
    private String aApellidos;


}

