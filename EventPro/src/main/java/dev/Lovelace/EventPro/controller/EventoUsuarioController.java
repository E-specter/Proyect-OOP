package dev.Lovelace.EventPro.controller;

import dev.Lovelace.EventPro.model.EventoUsuario;
import dev.Lovelace.EventPro.service.EventoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evento-usuario")
public class EventoUsuarioController {

    @Autowired
    private EventoUsuarioService eventoUsuarioService;

    @GetMapping
    public List<EventoUsuario> getAll() {
        return eventoUsuarioService.findAll();
    }

    @GetMapping("/{id}")
    public EventoUsuario getById(@PathVariable Long id) {
        return eventoUsuarioService.findById(id);
    }

    @PostMapping
    public EventoUsuario create(@RequestBody EventoUsuario eventoUsuario) {
        return eventoUsuarioService.save(eventoUsuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        eventoUsuarioService.deleteById(id);
    }
}
