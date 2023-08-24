package dw.backend.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dw.backend.api.model.Entity.Usuario;
import dw.backend.api.service.UsuarioService;

@RequestMapping("/api/usuarios")
@RestController
public class UsuarioController {
	@Autowired
	public UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> buscaTodosUsuarios()
	{
		return usuarioService.buscaTodosUsuarios();
	}
	
	@GetMapping("/{id}")
	public Usuario buscaUsuarioPorId(@PathVariable long id)
	{
		return usuarioService.buscaUsuarioPorId(id);
	}
	
	@PostMapping("/inserir")
	public Usuario inserirUsuario(@RequestBody Usuario usuario)
	{
		return usuarioService.inserirUsuario(usuario);
	}

	@PutMapping("/atualizar")
	public Usuario atualizarUsuario(@RequestBody Usuario usuario)
	{
		return usuarioService.atualizarUsuario(usuario);
	}
}