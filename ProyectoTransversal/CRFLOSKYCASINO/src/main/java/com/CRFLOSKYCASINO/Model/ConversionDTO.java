package com.CRFLOSKYCASINO.Model;

import java.sql.Date;

public class ConversionDTO {
    
    private Long idConversion;
    private double euros;
    private int fichas;
    private String usuarioDni;
    private Date fecha;

    public ConversionDTO() {
        
    }

    public Long getIdConversion() {
        return idConversion;
    }

    public void setIdConversion(Long idConversion) {
        this.idConversion = idConversion;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public String getUsuarioDni() {
        return usuarioDni;
    }

    public void setUsuarioDni(String usuarioDni) {
        this.usuarioDni = usuarioDni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ConversionDTO [idConversion=" + idConversion + ", euros=" + euros + ", fichas=" + fichas
                + ", usuarioDni=" + usuarioDni + ", fecha=" + fecha + "]";
    }
}