package com.financas.react.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financas.react.model.Lancamento;
import com.financas.react.model.enun.StatusLancamento;
import com.financas.react.repository.LancamentoRepository;
import com.financas.react.services.LancamentoServices;
@Service
public class LancamentoServicesImpl implements LancamentoServices{

	
	@Autowired
	private LancamentoRepository repo;
	
	@Override
	public Lancamento salvar(Lancamento lancamento) {
		
		return null;
	}

	@Override
	public Lancamento atualizar(Lancamento lancamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Lancamento lancamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Lancamento> buscar(Lancamento lancamentoFiltro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarStatus(Lancamento lancamento, StatusLancamento status) {
		// TODO Auto-generated method stub
		
	}

}
