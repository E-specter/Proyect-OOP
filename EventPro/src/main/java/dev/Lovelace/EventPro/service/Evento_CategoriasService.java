package dev.Lovelace.EventPro.service;

import dev.Lovelace.EventPro.model.Evento_Categorias;
import dev.Lovelace.EventPro.repository.EventoCategoriaEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Evento_CategoriasService {

    @Autowired
    private EventoCategoriaEventoRepository evento_categoriasRepository;

    public List<Evento_Categorias> findAll() {
        return evento_categoriasRepository.findAll();
    }

    public Evento_Categorias findById(Long id) {
        return (Evento_Categorias) evento_categoriasRepository.findById(id);
    }

    public Evento_Categorias save(Evento_Categorias eventoCategoriaEvento) {
        return evento_categoriasRepository.save(eventoCategoriaEvento);
    }

    public void deleteById(Long id) {
        evento_categoriasRepository.deleteById(id);
    }
}
