package com.CRFLOSKYCASINO.Entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tarjeta_credito")
public class TarjetaCreditoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TARJETA_CREDITO")
    private Long id;

    @Column(name = "NUMERO_TARJETA", length = 19, nullable = false, unique = true)
    private String numeroTarjeta;

    @Column(name = "CCV", length = 3, nullable = false)
    private String ccv;

    @Column(name = "MES_EXPIRACION", length = 2, nullable = false)
    private String mesExpiracion;

    @Column(name = "YEAR_EXPIRACION", length = 4, nullable = false)
    private String yearExpiracion;

    @ManyToOne
    @JoinColumn(name = "USUARIO", nullable = false)
    private UsuarioEntity usuario;

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

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
}
