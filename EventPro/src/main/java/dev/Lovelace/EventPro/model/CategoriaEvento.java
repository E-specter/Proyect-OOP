package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "CategoriaEvento")
public class CategoriaEvento {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private byte idCategoriaEvento;

  @Column(name = "nombre", nullable = false, unique = true)
  private String nombre;

  @Column(name = "descripcion", nullable = false, unique = true)
  private String descripcion;

  @OneToMany(mappedBy = "categoriaEvento", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Evento_Categorias> evento_categorias = new HashSet<>();

  // Getters y setters
}
