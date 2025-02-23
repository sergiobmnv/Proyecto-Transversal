package com.CRFLOSKYCASINO.Entity;

import java.io.Serializable;

import jakarta.persistence.*;

public class JuegoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_JUEGO")
    private Long id;

    @Column(name = "NOMBRE", length = 20, nullable = false, unique = true)
    private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
