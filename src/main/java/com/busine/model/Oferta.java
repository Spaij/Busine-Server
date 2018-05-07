package com.busine.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="oferta")
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CodOferta")
	private long codOferta;
	
	@Column(name="Titulo")
	private String titulo;
	
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
	
	@Column(name="NumAnunciantes")
	private int numAnunciantes;
	
	@Column(name="Organizacao")
	private Organizacao organizacao;
	
	@Column(name="Anunciante")
	private Anunciante anunciante;
	
	public Oferta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oferta(long codOferta, String titulo, String descricao, BigDecimal preco, float comissaoVenda,
			int unidDisponiveis, int unidVendidas, int numAnunciantes, Organizacao organizacao, Anunciante anunciante) {
		super();
		this.codOferta = codOferta;
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
		this.comissaoVenda = comissaoVenda;
		this.unidDisponiveis = unidDisponiveis;
		this.unidVendidas = unidVendidas;
		this.numAnunciantes = numAnunciantes;
		this.organizacao = organizacao;
		this.anunciante = anunciante;
	}

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
	
	public int getnAnunciantes() {
		return numAnunciantes;
	}
	
	public void setnAnunciantes(int nAnunciantes) {
		this.numAnunciantes = nAnunciantes;
	}
	
	public long getCodOferta() {
		return codOferta;
	}
	
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}
	
	public Anunciante getAnunciante() {
		return anunciante;
	}
	
	public void setAnunciante(Anunciante anunciante) {
		this.anunciante = anunciante;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
