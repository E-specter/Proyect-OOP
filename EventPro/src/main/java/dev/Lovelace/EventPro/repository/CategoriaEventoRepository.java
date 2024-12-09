package dev.Lovelace.EventPro.repository;

import dev.Lovelace.EventPro.model.CategoriaEvento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaEventoRepository extends JpaRepository<CategoriaEvento, Long> {
    // Métodos de búsqueda personalizados si es necesario
}
