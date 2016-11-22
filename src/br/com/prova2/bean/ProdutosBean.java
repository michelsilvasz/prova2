package br.com.prova2.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.com.prova2.model.Fabricantes;
import br.com.prova2.model.Produtos;
import br.com.prova2.service.FabricantesService;
import br.com.prova2.service.ProdutosService;

@ManagedBean(name = "produtosbean")
@SessionScoped
public class ProdutosBean implements Serializable {

	private static final long serialVersionUID = -7823908501987992622L;
	@Inject
	Produtos produtos;
	@Inject
	Fabricantes fabricantes;
	@Inject
	ProdutosService produtosService;
	@Inject
	FabricantesService fabricantesService;
	
	private long fabricanteCnpj;
	
	
	
	public long getFabricanteCnpj() {
		return fabricanteCnpj;
	}


	public void setFabricanteCnpj(long fabricanteCnpj) {
		this.fabricanteCnpj = fabricanteCnpj;
	}


	public String salvarProduto() {
		try{
			produtos.setFabricante(fabricantes.getCnpjFabricante());
			produtos.setFabricantes(this.fabricantes);
			
			produtosService.incluir(produtos);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Produto salvo com sucesso"));
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		
		return "/index.xhtml?faces-redirect=true";
	}
	public void buscarPorID() {

		try {
			this.fabricantes = fabricantesService.buscarID(this.fabricanteCnpj);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fabricante Encontrado"));
		} catch (RuntimeException e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fabricante nao Encontrado"));
		}

		System.out.println(this.fabricantes.getNomeFabricante());
	}
	

	public Fabricantes getFabricantes() {
		return fabricantes;
	}


	public void setFabricantes(Fabricantes fabricantes) {
		this.fabricantes = fabricantes;
	}


	public ProdutosService getProdutosService() {
		return produtosService;
	}


	public void setProdutosService(ProdutosService produtosService) {
		this.produtosService = produtosService;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

}
