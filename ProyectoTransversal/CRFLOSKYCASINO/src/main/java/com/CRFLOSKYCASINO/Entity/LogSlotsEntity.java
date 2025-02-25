package com.CRFLOSKYCASINO.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name="log_slots")
public class LogSlotsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOG_SLOTS")
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
}
