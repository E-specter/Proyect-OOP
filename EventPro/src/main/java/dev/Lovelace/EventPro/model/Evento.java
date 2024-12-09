package dev.Lovelace.EventPro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvento;
    private String nombre;
    private Integer estado;
    private Integer capacidad;
    private String ubicacion;
    private String fechaHora;
    private Double duracion;
    private String detalle;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "evento")
    private List<EventoCategoriaEvento> eventoCategoriaEventos;

    @OneToMany(mappedBy = "evento")
    private List<EventoProveedor> eventoProveedores;

    @OneToMany(mappedBy = "evento")
    private List<EventoUsuario> eventoUsuarios;

    // Getters y setters
}

