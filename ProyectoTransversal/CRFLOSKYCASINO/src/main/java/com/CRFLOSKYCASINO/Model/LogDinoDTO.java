package com.CRFLOSKYCASINO.Model;

import java.sql.Date;

public class LogDinoDTO {
    
    private Long idLogDino;
    private String usuarioDni;
    private double monto;
    private double multiplicador;
    private Date fecha;
    
    public LogDinoDTO() {

    }

    public Long getIdLogDino() {
        return idLogDino;
    }

    public void setIdLogDino(Long idLogDino) {
        this.idLogDino = idLogDino;
    }

    public String getUsuarioDni() {
        return usuarioDni;
    }

    public void setUsuarioDni(String usuarioDni) {
        this.usuarioDni = usuarioDni;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "LogDinoDTO [idLogDino=" + idLogDino + ", usuarioDni=" + usuarioDni + ", monto=" + monto
                + ", multiplicador=" + multiplicador + ", fecha=" + fecha + "]";
    }
}