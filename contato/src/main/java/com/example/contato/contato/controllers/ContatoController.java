package com.example.contato.contato.controllers;

import com.example.contato.contato.dtos.ContatoDTO;
import com.example.contato.contato.models.Contato;
import com.example.contato.contato.services.ContatoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("contato")
public class ContatoController {

    @Autowired
    ContatoService contatoService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/{id}")
    public ResponseEntity<ContatoDTO> findById(@PathVariable Integer id) {
        Contato con = contatoService.findById(id);
        return ResponseEntity.ok().body(modelMapper.map(con, ContatoDTO.class));
    }

    @GetMapping
    public ResponseEntity<List<ContatoDTO>> findAll() {
        List<Contato> list = contatoService.findAll();
        return ResponseEntity.ok().body(list.stream().map(contato -> modelMapper.map(contato, ContatoDTO.class)).collect(Collectors.toList()));
    }
}
