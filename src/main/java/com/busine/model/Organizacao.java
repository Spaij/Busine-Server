package com.busine.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;
//fdsfsdfs
//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="organizacao")
public class Organizacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CodOrganizacao")
	private long codOrganizacao;
	
	@Column(name="NomeDaOrganizacao")
	private String nomeDaOrganizacao;
	
	@Column(name="Descricao")
	private String descricao;
	
	@Column(name="Endereco")
	private String endereco;
	
	@Column(name="Ddd")
	private byte ddd;
	
	@Column(name="TipoDeCNPJ")
	private int tipoDeCNPJ;
	
	@Column(name="Telefone")
	private String telefone;
	
	//mapear
	@Column(name="Oferta")
	private List<Oferta> oferta;	
	
	@OneToMany (cascade = CascadeType.ALL)
	private List<Cartao> cartoes;
	
	//mapear
	@Column(name="CodOrganizacao")
	private List<Anunciante> anunciantesFrequentes;
	
	
	
	public Organizacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organizacao(long codOrganizacao, String nomeDaOrganizacao, String descricao, String endereco, byte ddd,
			int tipoDeCNPJ, String telefone, List<Oferta> oferta, List<Anunciante> anunciantesFrequentes) {
		super();
		this.codOrganizacao = codOrganizacao;
		this.nomeDaOrganizacao = nomeDaOrganizacao;
		this.descricao = descricao;
		this.endereco = endereco;
		this.ddd = ddd;
		this.tipoDeCNPJ = tipoDeCNPJ;
		this.telefone = telefone;
		this.oferta = oferta;
		this.anunciantesFrequentes = anunciantesFrequentes;
	}

	public String getNomeDaOrganizacao() {
		return nomeDaOrganizacao;
	}
	
	public void setNomeDaOrganizacao(String nomeDaOrganizacao) {
		this.nomeDaOrganizacao = nomeDaOrganizacao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public byte getDdd() {
		return ddd;
	}

	public void setDdd(byte ddd) {
		this.ddd = ddd;
	}

	public void setOferta(List<Oferta> oferta) {
		this.oferta = oferta;
	}

	public void setAnunciantesFrequentes(List<Anunciante> anunciantesFrequentes) {
		this.anunciantesFrequentes = anunciantesFrequentes;
	}

	public int getTipoDeCNPJ() {
		return tipoDeCNPJ;
	}
	
	public void setTipoDeCNPJ(int tipoDeCNPJ) {
		this.tipoDeCNPJ = tipoDeCNPJ;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Oferta> getOferta() {
		return oferta;
	}

	public List<Anunciante> getAnunciantesFrequentes() {
		return anunciantesFrequentes;
	}
	
}
