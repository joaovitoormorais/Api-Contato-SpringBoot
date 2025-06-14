package com.example.contato.contato.services;

import com.example.contato.contato.models.Contato;
import com.example.contato.contato.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    ContatoRepository contatoRepository;

    public Contato findById(Integer id) {
        Optional<Contato> con = contatoRepository.findById(id);
        if(con.isPresent()) {
            return con.get();
        }
            throw new IllegalArgumentException("Contato não encontrado.");
    }

    public List<Contato> findAll() {
        return contatoRepository.findAll();
    }

    public Contato save(Contato contato) {

    }

    public Contato update(Contato map) {

    }

    public void delete(Integer id) {

    }
}
