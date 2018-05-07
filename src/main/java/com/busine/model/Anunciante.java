package com.busine.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="anunciante")

public class Anunciante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CodAnunciante")
	private long codAnunciante;
	
	//analisar JsonIgnore
	@JsonIgnore
	//bi-directional many-to-one association to Pedido
	@ManyToMany(mappedBy="anuciante")
	private List<Oferta> ofertasAceitas;
	
	//experimental
	@Column(name="Saldo")
	private String saldo;
	
	@Column(name="Usuario")
	private String usuario;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Sobrenome")
	private String sobrenome;

	//experimental
	@Column(name="Senha")
	private String senha;
	
	@Column(name="Genero")
	private Integer genero;
	
	//experimental
	@Column(name="Foto")
	private Integer foto;

	@Temporal(TemporalType.DATE)
	@Column(name="DataNascimento")
	private Date dataNascimento;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Telefone")
	private Integer telefone;

	@Column(name="Endereço")
	private String endereco;

	@Column(name="Cnpj")
	private Integer cnpj;
	
	@Column(name="TipoCnpj")
	private String tipoCnpj;

	@Column(name="Cpf")
	private Integer cpf;

	@Column(name="Pis")
	private Integer pis;

	@Column(name="Inss")
	private Integer inss;

	public Anunciante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Anunciante(Integer codAnunciante, List<Oferta> ofertasAceitas, String saldo, String usuario, String nome,
			String sobrenome, String senha, Integer genero, Integer foto, Date dataNascimento, String email,
			Integer telefone, String endereco, Integer cnpj, String tipoCnpj, Integer cpf, Integer pis, Integer inss) {
		super();
		this.codAnunciante = codAnunciante;
		this.ofertasAceitas = ofertasAceitas;
		this.saldo = saldo;
		this.usuario = usuario;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.senha = senha;
		this.genero = genero;
		this.foto = foto;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.tipoCnpj = tipoCnpj;
		this.cpf = cpf;
		this.pis = pis;
		this.inss = inss;
	}

	public long getCodAnunciante() {
		return codAnunciante;
	}

	public void setCodAnunciante(Integer codAnunciante) {
		this.codAnunciante = codAnunciante;
	}

	public List<Oferta> getOfertasAceitas() {
		return ofertasAceitas;
	}

	public void setOfertasAceitas(List<Oferta> ofertasAceitas) {
		this.ofertasAceitas = ofertasAceitas;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getGenero() {
		return genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}

	public Integer getFoto() {
		return foto;
	}

	public void setFoto(Integer foto) {
		this.foto = foto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoCnpj() {
		return tipoCnpj;
	}

	public void setTipoCnpj(String tipoCnpj) {
		this.tipoCnpj = tipoCnpj;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getPis() {
		return pis;
	}

	public void setPis(Integer pis) {
		this.pis = pis;
	}

	public Integer getInss() {
		return inss;
	}

	public void setInss(Integer inss) {
		this.inss = inss;
	}
	
	/*public Oferta addOferta(Oferta oferta) {
		getOfertasAceitas().add(oferta);
		oferta.setAnunciante(this);

		return oferta;
	}

	public Oferta removeOferta(Oferta oferta) {
		getOfertasAceitas().remove(oferta);
		oferta.setAnunciante(null);

		return oferta;
	}*/

}

