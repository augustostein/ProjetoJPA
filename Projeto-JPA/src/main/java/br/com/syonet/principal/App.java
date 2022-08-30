package br.com.syonet.principal;

import br.com.syonet.dao.LivroDAO;
import br.com.syonet.entidade.Livro;

public class App {
	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		
		livro1.setTitulo("Dois carecas brigando por um pente");
		livro1.setNomeAutor("Jorgisney");

		LivroDAO dao = new LivroDAO();
		dao.salva(livro1);
		
		dao.buscaLivroId(1);
		
	}

}
