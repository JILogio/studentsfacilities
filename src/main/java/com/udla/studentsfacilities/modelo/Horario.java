package com.udla.studentsfacilities.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Embeddable
public class Horario {

    @Column(length = 20)
    @Required
    private String dia;

    @Column(length = 10)
    @Required
    private String horaInicio;

    @Column(length = 10)
    @Required
    private String horaFin;

    // Getters y Setters
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
}

