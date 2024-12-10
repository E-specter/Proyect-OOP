package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Evento_Proveedores")
public class Evento_Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "idEvento", nullable = false)
    private Evento evento;
    
    @ManyToOne
    @JoinColumn(name = "idProveedor", nullable = false)
    private Proveedor proveedor;
    
    // Getters y Setters
}

