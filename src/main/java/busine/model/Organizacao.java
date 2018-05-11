package busine.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="organizacao")
public class Organizacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CodOrganizacao")
	private long codOrganizacao;

	@Column(name="NomeDaOrganizacao", nullable=false)
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
	
	@JsonIgnore
	@OneToMany(mappedBy="organizacao")
	private List<Oferta> ofertas;	
	
	/*
	//mapear
	@Column(name="CodOrganizacao")
	private List<Anunciante> anunciantesFrequentes;
	*/
	
	
	public Organizacao() {
		
	}

	public Organizacao(long codOrganizacao, String nomeDaOrganizacao, String descricao, String endereco, byte ddd,
		int tipoDeCNPJ, String telefone) {
		this.codOrganizacao = codOrganizacao;
		this.nomeDaOrganizacao = nomeDaOrganizacao;
		this.descricao = descricao;
		this.endereco = endereco;
		this.ddd = ddd;
		this.tipoDeCNPJ = tipoDeCNPJ;
		this.telefone = telefone;
	}

	
	public long getCodOrganizacao() {
		return codOrganizacao;
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

	public void setOferta(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	/*public void setAnunciantesFrequentes(List<Anunciante> anunciantesFrequentes) {
		this.anunciantesFrequentes = anunciantesFrequentes;
	}*/

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

	public List<Oferta> getOfertas() {
		return ofertas;
	}

	/*public List<Anunciante> getAnunciantesFrequentes() {
		return anunciantesFrequentes;
	}*/
	
}
