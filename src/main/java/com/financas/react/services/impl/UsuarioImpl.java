package com.financas.react.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financas.react.model.Usuario;
import com.financas.react.repository.UsuarioRepository;
import com.financas.react.services.UsuarioServices;
@Service
public class UsuarioImpl implements UsuarioServices{

	
	@Autowired
	private UsuarioRepository userRepo;
	@Override
	public Usuario autenticar(String email, String senha) {
		
		return null;
	}

	@Override
	public Usuario salvarUsuario(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ValidarEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	
	
}
