package dev.Lovelace.EventPro.service;

import dev.Lovelace.EventPro.model.EventoCategoriaEvento;
import dev.Lovelace.EventPro.repository.EventoCategoriaEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoCategoriaEventoService {

    @Autowired
    private EventoCategoriaEventoRepository eventoCategoriaEventoRepository;

    public List<EventoCategoriaEvento> findAll() {
        return eventoCategoriaEventoRepository.findAll();
    }

    public EventoCategoriaEvento findById(Long id) {
        return (EventoCategoriaEvento) eventoCategoriaEventoRepository.findById(id);
    }

    public EventoCategoriaEvento save(EventoCategoriaEvento eventoCategoriaEvento) {
        return eventoCategoriaEventoRepository.save(eventoCategoriaEvento);
    }

    public void deleteById(Long id) {
        eventoCategoriaEventoRepository.deleteById(id);
    }
}
