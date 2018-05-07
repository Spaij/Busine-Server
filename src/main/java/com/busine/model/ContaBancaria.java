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
	private long codContaBancaria;

	@Column(name="Conta")
	private String conta;
	
	@Column(name="DigitoConta")
	private String digitoConta;

	@Column(name="Agencia")
	private String agencia;
	
	@Column(name="DigitoAgencia")
	private String digitoAgencia;

	@Column(name="Tipo")
	private String tipo;

	@Column(name="CodBanco")
	private String codBanco;

	@Column(name="NomeTitular")
	private String nomeTitular;

	@Column(name="CpfTitular")
	private String cpfTitular;

	public ContaBancaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaBancaria(long codContaBancaria, String conta, String digitoConta, String agencia, String digitoAgencia,
			String tipo, String codBanco, String nomeTitular, String cpfTitular) {
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

	public long getCodContaBancaria() {
		return codContaBancaria;
	}

	public void setCodContaBancaria(long codContaBancaria) {
		this.codContaBancaria = codContaBancaria;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDigitoConta() {
		return digitoConta;
	}

	public void setDigitoConta(String digitoConta) {
		this.digitoConta = digitoConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDigitoAgencia() {
		return digitoAgencia;
	}

	public void setDigitoAgencia(String digitoAgencia) {
		this.digitoAgencia = digitoAgencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(String codBanco) {
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

	
	
}