package br.com.syonet.principal;

import br.com.syonet.dao.LivroDAO;
import br.com.syonet.entidade.Correntista;

public class App {
	public static void main(String[] args) {
		
		Correntista correntista1 = new Correntista();
		
		correntista1.setNome("Augusto Stein");
		correntista1.setCpf("02414185007");

		LivroDAO dao = new LivroDAO();
		dao.salva(correntista1);
		
		
	}

	
	
	/*
	 * Projeto - Camadas:
	 * 
	 * 1. Entidade
	 * 2. Camada Persistencia: Quem vai gerenciar nossa camada (DAO / Repository)
	 * 3. Camada de Regra de Negocio: Service, Business, Facade
	 * 4. Camada API: como vai expor todo resto para outras aplicações, site, interface web etc
	 * 
	 * 4.1 Main - Execução da aplicação
	 * 
	 * Controler, Service, Resource
	 * 
	 */
}
