package com.busine.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="oferta_tb")
public class Oferta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="CodOferta")
	private long codOferta;
	
	@Column(name="Descricao")
	private String descricao;
	
	@Column(name="Preco")
	private BigDecimal preco; 
	
	@Column(name="ComissaoVenda")
	private float comissaoVenda;
	
	@Column(name="UnidDisponiveis")
	private int unidDisponiveis;
	
	@Column(name="UnidVendidas")
	private int unidVendidas;
	
	@Column(name="NumVendedores")
	private int numVendedores;
	
	private Organizacao organizacao;
	
	private Anunciante anunciante;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public int getUnidDisponiveis() {
		return unidDisponiveis;
	}
	
	public void setUnidDisponiveis(int unidDisponiveis) {
		this.unidDisponiveis = unidDisponiveis;
	}
	
	public int getUnidVendidas() {
		return unidVendidas;
	}
	
	public void setUnidVendidas(int unidVendidas) {
		this.unidVendidas = unidVendidas;
	}
	
	public float getComissaoVenda() {
		return comissaoVenda;
	}
	
	public void setComissaoVenda(float comissaoVenda) {
		this.comissaoVenda = comissaoVenda;
	}
	
	public int getnVendedores() {
		return numVendedores;
	}
	
	public void setnVendedores(int nVendedores) {
		this.numVendedores = nVendedores;
	}
	
	public long getCodOferta() {
		return codOferta;
	}
	
}
