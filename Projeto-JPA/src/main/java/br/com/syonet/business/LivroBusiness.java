package br.com.syonet.business;

import java.util.Objects;
import br.com.syonet.dao.LivroDAO;
import br.com.syonet.entidade.Livro;


public class LivroBusiness {
	
	LivroDAO dao = new LivroDAO();
	
	public void salva( Livro registro ) {
		if ( Objects.isNull( registro.getTitulo() ) ) {
			throw new NullPointerException ( "Titulo não pode ser nulo!");
			
		}
	
		if (Objects.isNull(registro.getNomeAutor())) {
			throw new NullPointerException("Nome do autor não pode ser nulo!");
			
		}
	}

}
