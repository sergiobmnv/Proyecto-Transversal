package com.CRFLOSKYCASINO.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="USUARIO")
public class UsuarioEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name="USERNAME")
    private String username;

    @Column(name="PWD")
    private String pwd;

    @Column(name="EMAIL")
    private String email;

    @Column(name="NOMBRE")
    private String nombre;

    @Column(name="APELLIDO")
    private String apellido;

    @Id
	@Column(name="DNI")
	private String dni;
	
	@Column(name="FECHA_NACIMIENTO")
	private Date fechaNacimiento;

    @Column(name="MONEDERO")
    private double monedero;

    @Column(name="SALDO")
    private double saldo;

    @Column(name="IS_VIP")
    private boolean isVip;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<TarjetaCreditoEntity> tarjetas;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<ConversionEntity> conversiones;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<LogSlotsEntity> logSlots;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<LogDinoEntity> logDino;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<LogMinasEntity> logMinas;

    //GETTERS Y SETTERS
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

    public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFecha_nacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

    public double getMonedero() {
		return monedero;
	}

	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    public boolean isVip() {
		return isVip;
	}

	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}
	
}
