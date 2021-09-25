package com.financas.react.services;

import com.financas.react.model.Usuario;

public interface UsuarioServices {

	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(String usuario);
	
	void ValidarEmail(String email);
}
