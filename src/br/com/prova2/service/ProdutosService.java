package br.com.prova2.service;

import javax.inject.Inject;
import javax.ejb.Stateless;
import br.com.prova2.model.Produtos;
import br.com.prova2.repository.ProdutosRepository;

@Stateless
public class ProdutosService {
	@Inject
	Produtos produtos;

	@Inject
	ProdutosRepository produtosRepository;

	public void incluir(Produtos produtos) {
		produtosRepository.incluir(produtos);
	}
	
}
