package br.com.prova2.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import br.com.prova2.model.Fabricantes;
import br.com.prova2.service.FabricantesService;

@ManagedBean
@SessionScoped
public class FabricantesBean implements Serializable {

	private static final long serialVersionUID = -7823908501987992622L;
	@Inject
	Fabricantes fabricantes;
	@Inject
	FabricantesService fabricantesService;

	public String salvarFabricante() {

		fabricantesService.incluir(fabricantes);

		return "/pages/index.xhtml?faces-redirect=true";

	}

	public Fabricantes getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(Fabricantes fabricantes) {
		this.fabricantes = fabricantes;
	}

}
