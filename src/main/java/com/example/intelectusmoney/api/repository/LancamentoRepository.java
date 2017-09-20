package com.example.intelectusmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.intelectusmoney.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
