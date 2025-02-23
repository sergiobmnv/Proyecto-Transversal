package com.CRFLOSKYCASINO.Model;

public class TarjetaDeCredito {
    
    private Long idTarjetaCredito;
    private String numeroTarjeta;
    private String ccv;
    private String mesExpiracion;
    private String yearExpiracion;
    private String usuarioDni;

    public TarjetaDeCredito() {
        
    }

    public Long getIdTarjetaCredito() {
        return idTarjetaCredito;
    }

    public void setIdTarjetaCredito(Long idTarjetaCredito) {
        this.idTarjetaCredito = idTarjetaCredito;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getMesExpiracion() {
        return mesExpiracion;
    }

    public void setMesExpiracion(String mesExpiracion) {
        this.mesExpiracion = mesExpiracion;
    }

    public String getYearExpiracion() {
        return yearExpiracion;
    }

    public void setYearExpiracion(String yearExpiracion) {
        this.yearExpiracion = yearExpiracion;
    }

    public String getUsuarioDni() {
        return usuarioDni;
    }

    public void setUsuarioDni(String usuarioDni) {
        this.usuarioDni = usuarioDni;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito [idTarjetaCredito=" + idTarjetaCredito + ", numeroTarjeta=" + numeroTarjeta + ", ccv="
                + ccv + ", mesExpiracion=" + mesExpiracion + ", yearExpiracion=" + yearExpiracion + ", usuarioDni="
                + usuarioDni + "]";
    }
}