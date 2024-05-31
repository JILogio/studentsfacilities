package com.udla.studentsfacilities.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@SuppressWarnings("hiding")
@Entity
public class Profesor<Materia> extends Usuario {

    @Column(length = 50)
    @Required
    private String especialidad;

    @OneToMany(mappedBy = "profesor")
    @ListProperties("nombre, codigo")
    private Collection<Materia> materias;

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Collection<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Collection<Materia> materias) {
        this.materias = materias;
    }
}

