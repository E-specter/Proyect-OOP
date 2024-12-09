package dev.Lovelace.EventPro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContacto;
    private String personalID;
    private String fiscalID;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private String detalle;

    // Getters y setters
}
