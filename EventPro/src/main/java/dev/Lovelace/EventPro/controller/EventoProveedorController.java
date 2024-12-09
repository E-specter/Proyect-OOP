package dev.Lovelace.EventPro.controller;

import dev.Lovelace.EventPro.model.EventoProveedor;
import dev.Lovelace.EventPro.service.EventoProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evento-proveedor")
public class EventoProveedorController {

    @Autowired
    private EventoProveedorService eventoProveedorService;

    @GetMapping
    public List<EventoProveedor> getAll() {
        return eventoProveedorService.findAll();
    }

    @GetMapping("/{id}")
    public EventoProveedor getById(@PathVariable Long id) {
        return eventoProveedorService.findById(id);
    }

    @PostMapping
    public EventoProveedor create(@RequestBody EventoProveedor eventoProveedor) {
        return eventoProveedorService.save(eventoProveedor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        eventoProveedorService.deleteById(id);
    }
}
