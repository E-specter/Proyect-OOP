package dev.Lovelace.EventPro.service;

import dev.Lovelace.EventPro.exception.ResourceNotFoundException;
import dev.Lovelace.EventPro.model.Contacto;
import dev.Lovelace.EventPro.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactoService {
    @Autowired
    private ContactoRepository contactoRepository;

    public List<Contacto> getAllContactos() {
        return contactoRepository.findAll();
    }

    public Contacto getContactoById(Long id) {
        return contactoRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Contacto no encontrado con id: " + id));
    }

    public Contacto saveContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    public void deleteContacto(Long id) {
        contactoRepository.deleteById(id);
    }
}
