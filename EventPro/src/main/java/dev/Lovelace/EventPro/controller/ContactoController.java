package dev.Lovelace.EventPro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import dev.Lovelace.EventPro.model.Contacto;
import dev.Lovelace.EventPro.service.ContactoService;
import java.util.List;

@RestController
public class ContactoController {
    @Autowired
    private ContactoService contactoService;

    @GetMapping("/contactos")
    public List<Contacto> getContactos() {
        return contactoService.getAllContactos();
    }

    @PostMapping("/contactos")
    public Contacto createContacto(@RequestBody Contacto contacto) {
        return contactoService.saveContacto(contacto);
    }

    @DeleteMapping("/contactos/{id}")
    public void deleteContacto(@PathVariable Long id) {
        contactoService.deleteContacto(id);
    }
}
