package dev.Lovelace.EventPro.controller;

import dev.Lovelace.EventPro.model.Evento_Usuarios;
import dev.Lovelace.EventPro.service.EventoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evento-usuario")
public class EventoUsuarioController {

    @Autowired
    private EventoUsuarioService evento_usuarioService;

    @GetMapping
    public List<Evento_Usuarios> getAll() {
        return evento_usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Evento_Usuarios getById(@PathVariable Long id) {
        return evento_usuarioService.findById(id);
    }

    @PostMapping
    public Evento_Usuarios create(@RequestBody Evento_Usuarios eventoUsuario) {
        return evento_usuarioService.save(eventoUsuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        evento_usuarioService.deleteById(id);
    }
}
