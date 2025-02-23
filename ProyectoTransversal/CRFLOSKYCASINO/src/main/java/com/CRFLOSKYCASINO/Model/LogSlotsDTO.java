package com.CRFLOSKYCASINO.Model;

import java.sql.Date;

public class LogSlotsDTO {
    
    private Long idLogSlots;
    private String usuarioDni;
    private double monto;
    private double premio;
    private Date fecha;

    public LogSlotsDTO() {

    }

    public Long getIdLogSlots() {
        return idLogSlots;
    }

    public void setIdLogSlots(Long idLogSlots) {
        this.idLogSlots = idLogSlots;
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

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "LogSlotsDTO [idLogSlots=" + idLogSlots + ", usuarioDni=" + usuarioDni + ", monto=" + monto + ", premio="
                + premio + ", fecha=" + fecha + "]";
    }
}