package com.CRFLOSKYCASINO.Model;

public class JuegoDTO {
    
    private Long idJuego;
    private String nombre;
    
    public JuegoDTO() {
    }

    public Long getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Long idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        
        return "JuegoDTO [idJuego=" + idJuego + ", nombre=" + nombre + "]";
    }
}
