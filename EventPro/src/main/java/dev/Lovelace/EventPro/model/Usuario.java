package dev.Lovelace.EventPro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String personalID;
    private String fiscalID;
    private String nombres;
    private String apellidos;
    private String cargo;
    private String telefono;
    private String correo;
    private String contrasenia;

    // Getters y setters
}

