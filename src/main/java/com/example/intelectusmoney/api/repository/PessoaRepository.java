package com.example.intelectusmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.intelectusmoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
