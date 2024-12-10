package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Proveedor_Contactos")
public class Proveedor_Contactos {
  //llave primaria
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idProveedor_Contactos;
  
  //llaves foráneas
  /*
    declaración como foráneo

  */
  //
  @ManyToOne
  @JoinColumn(name = "idProveedor", nullable = false)
  private Proveedor proveedor;
  //
  @ManyToOne
  @JoinColumn(name = "idContacto", nullable = false)
  private Contacto contacto;
  
  @Column(name = "cargo", nullable = false, unique = true)
  private String cargo; //definido dentro de una lista, ejemplo: gerente, analista, director,... (minúsculas)

  // Getters y Setters
}