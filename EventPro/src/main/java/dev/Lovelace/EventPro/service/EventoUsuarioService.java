package dev.Lovelace.EventPro.service;

import dev.Lovelace.EventPro.model.Evento_Usuarios;
import dev.Lovelace.EventPro.repository.EventoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoUsuarioService {

    @Autowired
    private EventoUsuarioRepository eventoUsuarioRepository;

    public List<Evento_Usuarios> findAll() {
        return eventoUsuarioRepository.findAll();
    }

    public Evento_Usuarios findById(Long id) {
        return (Evento_Usuarios) eventoUsuarioRepository.findById(id);
    }

    public Evento_Usuarios save(Evento_Usuarios eventoUsuario) {
        return eventoUsuarioRepository.save(eventoUsuario);
    }

    public void deleteById(Long id) {
        eventoUsuarioRepository.deleteById(id);
    }
}
