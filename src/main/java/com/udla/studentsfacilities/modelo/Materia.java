package com.udla.studentsfacilities.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    @Required
    private String nombre;

    @Column(length = 10)
    @Required
    private String codigo;

    @ManyToOne
    @DescriptionsList
    private Profesor<?> profesor;

    @ManyToMany
    @ListProperties("nombre, matricula")
    private Collection<Estudiante> estudiantes;

    @OneToOne
    @DescriptionsList
    private Aula aula;

    @Embedded
    private Horario horario;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profesor<?> getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor<?> profesor) {
        this.profesor = profesor;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}


