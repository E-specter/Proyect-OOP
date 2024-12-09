package dev.Lovelace.EventPro.controller;

import dev.Lovelace.EventPro.model.EventoCategoriaEvento;
import dev.Lovelace.EventPro.service.EventoCategoriaEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evento-categoria-evento")
public class EventoCategoriaEventoController {

    @Autowired
    private EventoCategoriaEventoService eventoCategoriaEventoService;

    @GetMapping
    public List<EventoCategoriaEvento> getAll() {
        return eventoCategoriaEventoService.findAll();
    }

    @GetMapping("/{id}")
    public EventoCategoriaEvento getById(@PathVariable Long id) {
        return eventoCategoriaEventoService.findById(id);
    }

    @PostMapping
    public EventoCategoriaEvento create(@RequestBody EventoCategoriaEvento eventoCategoriaEvento) {
        return eventoCategoriaEventoService.save(eventoCategoriaEvento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        eventoCategoriaEventoService.deleteById(id);
    }
}
