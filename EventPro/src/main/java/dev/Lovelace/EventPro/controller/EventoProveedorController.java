package dev.Lovelace.EventPro.controller;

import dev.Lovelace.EventPro.model.Evento_Proveedores;
import dev.Lovelace.EventPro.service.EventoProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evento-proveedor")
public class EventoProveedorController {

    @Autowired
    private EventoProveedorService evento_proveedoresService;

    @GetMapping
    public List<Evento_Proveedores> getAll() {
        return evento_proveedoresService.findAll();
    }

    @GetMapping("/{id}")
    public Evento_Proveedores getById(@PathVariable Long id) {
        return evento_proveedoresService.findById(id);
    }

    @PostMapping
    public Evento_Proveedores create(@RequestBody Evento_Proveedores eventoProveedor) {
        return evento_proveedoresService.save(eventoProveedor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        evento_proveedoresService.deleteById(id);
    }
}
