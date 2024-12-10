package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "Contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContacto;
    
    @Column(name = "personalID", nullable = false, unique = true)
    private String personalID;
    
    @Column(name = "fiscalID", nullable = false, unique = true)
    private String fiscalID;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "apellidos", nullable = false)
    private String apellidos;
    
    @Column(name = "cargo", nullable = true)
    private String cargo; //Cargo del contacto en la empresa Proveedora
    
    @Column(name = "telefono", nullable = false, unique = true)
    private String telefono;
    
    @Column(name = "correo", nullable = false, unique = true)
    private String correo;
    
    @Column(name = "detalle", nullable = true)
    private String detalle;
    
    /*
    Referencia como foráneo
    @OneToMany: Relación Uno:Muchos
    Indica que una entidad Contacto, implícito, está relacionada con muchas instancias de la entidad Proveedor_Contactos
    PARÁMETROS:
    mappedBy = "contacto", Indica que la relación está mapeada en el atributo contacto de la tabla Proveedor_Contactos
    Set<> se utiliza para almacenar las entindades relacionadas y evitar duplicados en las relaciones
    
    */
    @OneToMany(mappedBy = "contacto", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Proveedor_Contactos> proveedor_contactos = new HashSet<>();
    
    
    // Getters y Setters
    
}
