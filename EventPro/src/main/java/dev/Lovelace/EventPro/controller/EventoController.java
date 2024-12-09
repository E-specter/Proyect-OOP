package dev.Lovelace.EventPro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import dev.Lovelace.EventPro.model.Evento;
import dev.Lovelace.EventPro.service.EventoService;
import java.util.List;

@RestController
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @GetMapping("/eventos")
    public List<Evento> getEventos() {
        return eventoService.getAllEventos();
    }

    @PostMapping("/eventos")
    public Evento createEvento(@RequestBody Evento evento) {
        return eventoService.saveEvento(evento);
    }

    @DeleteMapping("/eventos/{id}")
    public void deleteEvento(@PathVariable Long id) {
        eventoService.deleteEvento(id);
    }
}
