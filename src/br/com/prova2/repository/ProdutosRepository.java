package br.com.prova2.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.prova2.model.Produtos;
import br.com.prova2.util.EntityManagerProducer;

public class ProdutosRepository {
	@Inject
	private EntityManager manager;
	@Inject
	Produtos produtos;

	public void incluir(Produtos produtos) {
		this.manager.persist(produtos);
	}
}
