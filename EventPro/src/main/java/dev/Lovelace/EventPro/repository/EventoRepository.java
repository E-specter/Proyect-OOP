package dev.Lovelace.EventPro.repository;

import dev.Lovelace.EventPro.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
    // Métodos de búsqueda personalizados si es necesario
}

