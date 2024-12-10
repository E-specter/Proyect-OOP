package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "CategoriaProveedor")
public class CategoriaProveedor {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private byte idCategoriaProveedor;

  @Column(name = "nombre", nullable = false, unique = true)
  private String nombre;

  @Column(name = "descripcion", nullable = false, unique = true)
  private String descripcion;

  @OneToMany(mappedBy = "categoriaProveedor", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Proveedor_Categorias> proveedor_categorias = new HashSet<>();

  
  // Getters y Setters
  
}