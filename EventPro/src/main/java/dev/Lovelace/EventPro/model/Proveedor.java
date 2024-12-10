package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Proveedor")
public class Proveedor {
  //llave primaria
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idProveedor;
  
  @Column(name = "fiscalID", nullable = false, unique = true)
  private String fiscalId;
  
  @Column(name = "nombre", nullable = false, unique = true)
  private String nombre;
  
  @Column(name = "telefono", nullable = true)
  private String telefono;
  
  @Column(name = "correo", nullable = true)
  private String correo;
  
  @Column(name = "direccion", nullable = true)
  private String direccion;
  
  @Column(name = "detalle", nullable = true)
  private String detalle;
  
  @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Proveedor_Categorias> categorias;
  
  

  @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Proveedor_Contactos> representantes;

  @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Evento_Proveedores> patrocinios;


  // Getters y Setters
}