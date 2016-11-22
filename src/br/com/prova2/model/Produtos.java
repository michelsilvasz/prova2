package br.com.prova2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "produtos")
public class Produtos {
	@Id
	@GeneratedValue()
	@Column(name = "id_produto")
	private int Codigoproduto;
	@Column(name = "produto_nome")
	private String nomeProduto;
	@Column(name = "fabricante")
	private long fabricante;
	@Column(name = "valor_produto")
	private float valorProduto;

	// Nome do fabricante
	@ManyToOne
	@JoinColumn(name = "cnpjFabricante", nullable = false)
	private Fabricantes fabricantes;

	public long getFabricante() {
		return fabricante;
	}

	public void setFabricante(long fabricante) {
		this.fabricante = fabricante;
	}

	public Fabricantes getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(Fabricantes fabricantes) {
		this.fabricantes = fabricantes;
	}

	public int getCodigoproduto() {
		return Codigoproduto;
	}

	public void setCodigoproduto(int codigoproduto) {
		Codigoproduto = codigoproduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}

}
