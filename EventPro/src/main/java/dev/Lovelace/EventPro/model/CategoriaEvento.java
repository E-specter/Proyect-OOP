package dev.Lovelace.EventPro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "CategoriaEvento")
public class CategoriaEvento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoriaEvento;
    private String nombre;

    // Getters y setters
}
