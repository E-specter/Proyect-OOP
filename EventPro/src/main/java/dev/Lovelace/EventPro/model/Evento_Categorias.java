package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Evento_Categorias")
public class Evento_Categorias {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idEvento_Categorias;

  @ManyToOne
  @JoinColumn(name = "idEvento", nullable = false)
  private Evento evento;

  @ManyToOne
  @JoinColumn(name = "idCategoriaEvento", nullable = false)
  private CategoriaEvento categoriaEvento;

  // Getters y setters
}
