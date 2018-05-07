package com.busine.model;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.*;

@Entity
@Table(name="cartao")

public class Cartao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CodCartao")
	private long codCartao;

	@Column(name="Numero")
	private Integer numero;

	@Column(name="Tipo")
	private String tipo;

	@Temporal(TemporalType.DATE)
	@Column(name="DataValidade")
	private Date dataValidade;
	
	@Column(name="CodSegurança")
	private Integer codSegurança;

	@Column(name="NomeTitular")
	private String nomeTitular;
	
	public Cartao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cartao(Integer codCartao, Integer numero, String tipo, Date dataValidade, Integer codSegurança,
			String nomeTitular) {
		super();
		this.codCartao = codCartao;
		this.numero = numero;
		this.tipo = tipo;
		this.dataValidade = dataValidade;
		this.codSegurança = codSegurança;
		this.nomeTitular = nomeTitular;
	}

	public long getCodCartao() {
		return codCartao;
	}

	public void setCodCartao(Integer codCartao) {
		this.codCartao = codCartao;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Integer getCodSegurança() {
		return codSegurança;
	}

	public void setCodSegurança(Integer codSegurança) {
		this.codSegurança = codSegurança;
	}
	
}
