package com.financas.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financas.react.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

	
	//Usuario findByEmail(String email);


boolean existsByemail(String email);
}
