package br.com.prova2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.prova2.model.Produtos;

@Entity
@Table(name = "fabricantes")
public class Fabricantes {
	@Id
	@Column(name = "idfabricante")
	private long cnpjFabricante;
	@Column(name = "nome_fabricante")
	private String nomeFabricante;
		
	@OneToMany(mappedBy="fabricantes")
	private List<Produtos> produtos;
	
	public long getCnpjFabricante() {
		return cnpjFabricante;
	}

	public void setCnpjFabricante(long cnpjFabricante) {
		this.cnpjFabricante = cnpjFabricante;
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}

}
