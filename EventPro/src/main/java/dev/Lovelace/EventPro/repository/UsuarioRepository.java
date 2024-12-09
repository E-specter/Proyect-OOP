package dev.Lovelace.EventPro.repository;

import java.sql.SQLException;
import dev.Lovelace.EventPro.model.Usuario;
import dev.Lovelace.EventPro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
  
}
