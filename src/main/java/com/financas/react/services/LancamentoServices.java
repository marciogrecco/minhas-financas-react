package com.financas.react.services;

import java.util.List;

import com.financas.react.model.Lancamento;
import com.financas.react.model.enun.StatusLancamento;

public interface LancamentoServices {

	
	Lancamento salvar(Lancamento lancamento);
	
	Lancamento atualizar(Lancamento lancamento);
	
	void deletar(Lancamento lancamento);
	
	List<Lancamento>buscar(Lancamento lancamentoFiltro);

    void atualizarStatus(Lancamento lancamento,StatusLancamento status);

}
