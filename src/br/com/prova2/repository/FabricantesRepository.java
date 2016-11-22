package br.com.prova2.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;



import br.com.prova2.model.Fabricantes;


public class FabricantesRepository {
	@Inject
	private EntityManager manager;
	@Inject
	Fabricantes fabricantes;
		
	public Fabricantes buscarID(long id){
		return this.manager.find(Fabricantes.class,id);
	}
	
	public void incluir(Fabricantes fabricantes) {
		this.manager.persist(fabricantes);
	}
}
