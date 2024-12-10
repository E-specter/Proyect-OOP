package dev.Lovelace.EventPro.service;

import dev.Lovelace.EventPro.model.Evento_Proveedores;
import dev.Lovelace.EventPro.repository.EventoProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoProveedorService {

    @Autowired
    private EventoProveedorRepository evento_ProveedoresRepository;

    public List<Evento_Proveedores> findAll() {
        return evento_ProveedoresRepository.findAll();
    }

    public Evento_Proveedores findById(Long id) {
        return (Evento_Proveedores) evento_ProveedoresRepository.findById(id);
    }

    public Evento_Proveedores save(Evento_Proveedores evento_proveedores) {
        return evento_ProveedoresRepository.save(evento_proveedores);
    }

    public void deleteById(Long id) {
        evento_ProveedoresRepository.deleteById(id);
    }
}
