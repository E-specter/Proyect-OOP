package dev.Lovelace.EventPro.service;

import dev.Lovelace.EventPro.model.EventoProveedor;
import dev.Lovelace.EventPro.repository.EventoProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoProveedorService {

    @Autowired
    private EventoProveedorRepository eventoProveedorRepository;

    public List<EventoProveedor> findAll() {
        return eventoProveedorRepository.findAll();
    }

    public EventoProveedor findById(Long id) {
        return (EventoProveedor) eventoProveedorRepository.findById(id);
    }

    public EventoProveedor save(EventoProveedor eventoProveedor) {
        return eventoProveedorRepository.save(eventoProveedor);
    }

    public void deleteById(Long id) {
        eventoProveedorRepository.deleteById(id);
    }
}
