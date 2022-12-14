package com.example.microserv.entity;
import javax.persistence.*;

@Entity
@Table(name = "clase")
public class EntidadClase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clase")
    private Integer aIdClase;

    public Integer getaIdClase() {
        return aIdClase;
    }

    public void setaIdClase(Integer aIdClase) {
        this.aIdClase = aIdClase;
    }

    public String getaIdTitulo() {
        return aIdTitulo;
    }

    public void setaIdTitulo(String aIdTitulo) {
        this.aIdTitulo = aIdTitulo;
    }

    public String getaDescripcion() {
        return aDescripcion;
    }

    public void setaDescripcion(String aDescripcion) {
        this.aDescripcion = aDescripcion;
    }

    @Column(name = "titulo")
    private String aIdTitulo;

    @Column(name = "descripcion")
    private String aDescripcion;

}
