package com.busine.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="contaBancaria")
public class ContaBancaria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CodContaBancaria")
	private Integer codContaBancaria;

	@Column(name="Conta")
	private Integer conta;
	
	@Column(name="DigitoConta")
	private Short digitoConta;

	@Column(name="Agencia")
	private Integer agencia;
	
	@Column(name="DigitoAgencia")
	private Integer digitoAgencia;

	@Column(name="Tipo")
	private String tipo;

	@Column(name="CodBanco")
	private Integer codBanco;

	@Column(name="NomeTitular")
	private String nomeTitular;

	@Column(name="CpfTitular")
	private String cpfTitular;

	public ContaBancaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaBancaria(Integer codContaBancaria, Integer conta, Short digitoConta, Integer agencia,
			Integer digitoAgencia, String tipo, Integer codBanco, String nomeTitular, String cpfTitular) {
		super();
		this.codContaBancaria = codContaBancaria;
		this.conta = conta;
		this.digitoConta = digitoConta;
		this.agencia = agencia;
		this.digitoAgencia = digitoAgencia;
		this.tipo = tipo;
		this.codBanco = codBanco;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
	}

	public Integer getCodContaBancaria() {
		return codContaBancaria;
	}

	public void setCodContaBancaria(Integer codContaBancaria) {
		this.codContaBancaria = codContaBancaria;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(Integer codBanco) {
		this.codBanco = codBanco;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Short getDigitoConta() {
		return digitoConta;
	}

	public void setDigitoConta(Short digitoConta) {
		this.digitoConta = digitoConta;
	}

	public Integer getDigitoAgencia() {
		return digitoAgencia;
	}

	public void setDigitoAgencia(Integer digitoAgencia) {
		this.digitoAgencia = digitoAgencia;
	}

	
	
}
