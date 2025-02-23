package com.CRFLOSKYCASINO.Model;

import java.sql.Date;

public class LogMinasDTO {
    
    private Long idLogMinas;
    private String usuarioDni;
    private double monto;
    private double premio;
    private Date fecha;
    
    public LogMinasDTO() {

    }

    public Long getIdLogMinas() {
        return idLogMinas;
    }

    public void setIdLogMinas(Long idLogMinas) {
        this.idLogMinas = idLogMinas;
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
        return "LogMinasDTO [idLogMinas=" + idLogMinas + ", usuarioDni=" + usuarioDni + ", monto=" + monto + ", premio="
                + premio + ", fecha=" + fecha + "]";
    }
}