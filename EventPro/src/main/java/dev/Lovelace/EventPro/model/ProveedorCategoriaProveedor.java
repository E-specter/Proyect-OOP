package dev.Lovelace.EventPro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "Proveedor_CategoriaProveedor")
public class ProveedorCategoriaProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedorCategoriaProveedor;
    
    @ManyToOne
    @JoinColumn(name = "idProveedor", nullable = false)
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "idCategoriaProveedor", nullable = false)
    private CategoriaProveedor categoriaProveedor;

    // Getters y setters
}
