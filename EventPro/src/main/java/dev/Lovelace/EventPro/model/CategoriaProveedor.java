package dev.Lovelace.EventPro.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CategoriaProveedor")
public class CategoriaProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoriaProveedor;
    private String nombre;

    // Getters y setters
}
