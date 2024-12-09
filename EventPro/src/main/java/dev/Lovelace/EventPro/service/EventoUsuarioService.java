package dev.Lovelace.EventPro.service;

import dev.Lovelace.EventPro.model.EventoUsuario;
import dev.Lovelace.EventPro.repository.EventoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoUsuarioService {

    @Autowired
    private EventoUsuarioRepository eventoUsuarioRepository;

    public List<EventoUsuario> findAll() {
        return eventoUsuarioRepository.findAll();
    }

    public EventoUsuario findById(Long id) {
        return (EventoUsuario) eventoUsuarioRepository.findById(id);
    }

    public EventoUsuario save(EventoUsuario eventoUsuario) {
        return eventoUsuarioRepository.save(eventoUsuario);
    }

    public void deleteById(Long id) {
        eventoUsuarioRepository.deleteById(id);
    }
}
