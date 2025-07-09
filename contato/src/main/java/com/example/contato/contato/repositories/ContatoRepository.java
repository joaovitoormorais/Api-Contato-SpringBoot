package com.example.contato.contato.repositories;

import com.example.contato.contato.models.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

    Optional<Contato> findByNome(String nome);

}
