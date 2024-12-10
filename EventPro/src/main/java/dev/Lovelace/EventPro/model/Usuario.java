package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(nullable = false)
    private String correo;
    
    @Column(nullable = false)
    private String contrasenia; //Este es el campo de contraseña, quiero que sea segura

    @OneToMany(mappedBy = "usuario")
    private Set<Evento_Usuarios> usuarios;

    // Getters y Setters
}