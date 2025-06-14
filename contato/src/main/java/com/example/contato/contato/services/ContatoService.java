package com.example.contato.contato.services;

import com.example.contato.contato.models.Contato;
import com.example.contato.contato.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    ContatoRepository contatoRepository;


    public Contato findById(Integer id) {

    }

    public List<Contato> findAll() {
        return contatoRepository.findAll();
    }
}
