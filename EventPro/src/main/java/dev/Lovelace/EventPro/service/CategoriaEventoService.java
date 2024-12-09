package dev.Lovelace.EventPro.service;

import dev.Lovelace.EventPro.exception.ResourceNotFoundException;
import dev.Lovelace.EventPro.model.CategoriaEvento;
import dev.Lovelace.EventPro.repository.CategoriaEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaEventoService {
    @Autowired
    private CategoriaEventoRepository categoriaEventoRepository;

    public List<CategoriaEvento> getAllCategorias() {
        return categoriaEventoRepository.findAll();
    }

    public CategoriaEvento getCategoriaById(Long id) {
        return categoriaEventoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Categoría de evento no encontrada"));
    }

    public CategoriaEvento saveCategoria(CategoriaEvento categoriaEvento) {
        return categoriaEventoRepository.save(categoriaEvento);
    }

    public void deleteCategoria(Long id) {
        categoriaEventoRepository.deleteById(id);
    }
}
