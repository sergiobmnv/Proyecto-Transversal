package com.CRFLOSKYCASINO.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "log_minas")
public class LogMinasEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOG_MINAS")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USUARIO", nullable = false)
    private UsuarioEntity usuario;

    @Column(name = "MONTO", nullable = false)
    private double monto;

    @Column(name = "PREMIO", nullable = false)
    private double premio;

    @Column(name = "FECHA", nullable = false)
    private LocalDateTime fecha;

    public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
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

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
