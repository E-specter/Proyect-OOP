package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "Proveedor_Categorias")
public class Proveedor_Categorias {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idProveedor_Categorias;

  @ManyToOne
  @JoinColumn(name = "idProveedor", referencedColumnName= "idProveedor", nullable = false)
  private Proveedor proveedor;
  
  @ManyToOne
  @JoinColumn(name = "idCategoriaProveedor", referencedColumnName= "idCategoriaProveedor", nullable = false)
  private CategoriaProveedor categoriaProveedor;
  

  // Getters y setters
}
