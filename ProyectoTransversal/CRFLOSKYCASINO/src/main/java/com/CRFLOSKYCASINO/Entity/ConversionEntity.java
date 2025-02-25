package com.CRFLOSKYCASINO.Entity;
import java.io.Serializable;
import java.sql.Timestamp;


import jakarta.persistence.*;

@Entity
@Table(name = "conversion")
public class ConversionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONVERSION")
    private Long id;

    @Column(name = "EUROS", nullable = false)
    private double euros;

    @Column(name = "FICHAS", nullable = false)
    private int fichas;

    @ManyToOne
    @JoinColumn(name = "USUARIO", nullable = false)
    private UsuarioEntity usuario;

    @Column(name = "FECHA", nullable = false)
    private Timestamp fecha;

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

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}
}
