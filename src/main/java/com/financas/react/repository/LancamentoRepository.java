package com.financas.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financas.react.model.Lancamento;
import com.financas.react.model.Usuario;
@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento,Integer>{

}
