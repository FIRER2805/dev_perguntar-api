package dw.backend.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import dw.backend.api.model.Entity.Usuario;
import dw.backend.api.model.repository.UsuarioRepository;
import dw.backend.api.model.seletor.UsuarioSeletor;
import dw.backend.api.model.specification.UsuarioSpecifications;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarComSeletor(UsuarioSeletor seletor) {
		Specification<Usuario> specification = UsuarioSpecifications.comFiltros(seletor);
		return usuarioRepository.findAll(specification);
	}
	
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
	
	public void deletarUsuario(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
}
