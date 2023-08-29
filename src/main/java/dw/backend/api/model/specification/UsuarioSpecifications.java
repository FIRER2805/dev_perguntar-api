package dw.backend.api.model.specification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import dw.backend.api.model.Entity.Usuario;
import dw.backend.api.model.seletor.UsuarioSeletor;
import jakarta.persistence.criteria.Predicate;

public class UsuarioSpecifications {
	public static Specification<Usuario> comFiltros(UsuarioSeletor seletor)
	{
		return (root, query, cb) ->{
			List<Predicate> predicates = new ArrayList<>();
            if (seletor.getNome() != null) {
                predicates.add(cb.like(cb.lower(root.get("nome")), "%" 
                		+ seletor.getNome().toLowerCase() + "%"));
            }
            
            if (seletor.geteMail() != null) {
                predicates.add(cb.like(cb.lower(root.get("eMail")), "%" 
                		+ seletor.geteMail().toLowerCase() + "%"));
            }
            
            if (seletor.getSenha() != null) {
                predicates.add(cb.like(cb.lower(root.get("senha")), "%" 
                		+ seletor.getSenha().toLowerCase() + "%"));
            }
            
            return cb.and(predicates.toArray(new Predicate[0]));
		};
	}
}
