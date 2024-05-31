package com.udla.studentsfacilities.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Estudiante extends Usuario {

    @Column(length = 20)
    @Required
    private String matricula;

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
