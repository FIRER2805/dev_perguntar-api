package dw.backend.api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dw.backend.api.model.Entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	
}
