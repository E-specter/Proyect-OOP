package dev.Lovelace.EventPro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.Lovelace.EventPro.model.Usuario;
import dev.Lovelace.EventPro.service.UsuarioService;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioService.getAllUsuarios();
    }
}