package dev.Lovelace.EventPro.repository;

import dev.Lovelace.EventPro.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
    // Métodos de búsqueda personalizados si es necesario
}
