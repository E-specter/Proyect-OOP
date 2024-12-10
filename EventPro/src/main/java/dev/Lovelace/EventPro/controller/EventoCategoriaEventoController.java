package dev.Lovelace.EventPro.controller;

import dev.Lovelace.EventPro.model.Evento_Categorias;
import dev.Lovelace.EventPro.service.Evento_CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evento-categoria-evento")
public class EventoCategoriaEventoController {

    @Autowired
    private Evento_CategoriasService eventoCategoriaEventoService;

    @GetMapping
    public List<Evento_Categorias> getAll() {
        return eventoCategoriaEventoService.findAll();
    }

    @GetMapping("/{id}")
    public Evento_Categorias getById(@PathVariable Long id) {
        return eventoCategoriaEventoService.findById(id);
    }

    @PostMapping
    public Evento_Categorias create(@RequestBody Evento_Categorias eventoCategoriaEvento) {
        return eventoCategoriaEventoService.save(eventoCategoriaEvento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        eventoCategoriaEventoService.deleteById(id);
    }
}
