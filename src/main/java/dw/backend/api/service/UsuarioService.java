package dw.backend.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dw.backend.api.model.Entity.Usuario;
import dw.backend.api.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> buscaTodosUsuarios(){
		return usuarioRepository.findAll();
	}
	
	public Usuario buscaUsuarioPorId(long id) {
		return usuarioRepository.findById(id).get();
	}

	public Usuario inserirUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario atualizarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
