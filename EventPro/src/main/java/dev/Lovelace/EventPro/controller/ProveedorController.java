
package dev.Lovelace.EventPro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import dev.Lovelace.EventPro.model.Proveedor;
import dev.Lovelace.EventPro.service.ProveedorService;
import java.util.List;

@RestController
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/proveedores")
    public List<Proveedor> getProveedores() {
        return proveedorService.getAllProveedores();
    }

    @PostMapping("/proveedores")
    public Proveedor createProveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.saveProveedor(proveedor);
    }

    @DeleteMapping("/proveedores/{id}")
    public void deleteProveedor(@PathVariable Long id) {
        proveedorService.deleteProveedor(id);
    }
}
