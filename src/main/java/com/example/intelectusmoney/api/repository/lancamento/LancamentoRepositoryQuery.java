package com.example.intelectusmoney.api.repository.lancamento;

import java.util.List;

import com.example.intelectusmoney.api.model.Lancamento;
import com.example.intelectusmoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter );
}
