package br.com.prova2.service;

import javax.inject.Inject;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.prova2.model.Fabricantes;
import br.com.prova2.repository.FabricantesRepository;

@Stateless
public class FabricantesService {
	@Inject
	Fabricantes fabricantes;

	@Inject
	FabricantesRepository fabricantesRepository;

	public void incluir(Fabricantes fabricantes) {
		fabricantesRepository.incluir(fabricantes);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public Fabricantes buscarID(long id) {

		return fabricantesRepository.buscarID(id);

	}
}
