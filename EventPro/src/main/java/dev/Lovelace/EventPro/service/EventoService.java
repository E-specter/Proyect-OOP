package dev.Lovelace.EventPro.service;

import dev.Lovelace.EventPro.model.Evento;
import dev.Lovelace.EventPro.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import dev.Lovelace.EventPro.exception.ResourceNotFoundException;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }

    public Evento getEventoById(Long id) {
        return eventoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Evento no encontrado"));
    }

    public Evento saveEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public void deleteEvento(Long id) {
        eventoRepository.deleteById(id);
    }
}

