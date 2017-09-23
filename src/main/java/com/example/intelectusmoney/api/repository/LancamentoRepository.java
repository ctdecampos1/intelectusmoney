package com.example.intelectusmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.intelectusmoney.api.model.Lancamento;
import com.example.intelectusmoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
