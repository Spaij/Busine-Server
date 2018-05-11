package busine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IdUsuario")
	private Long idUsuario;
	
	@Column(name = "Login")
	private String login;
	
	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Senha")
	private String senha;

	 public Usuario() {
	    
	 }

	    public Usuario(long id, String login, String senha) {
	        this.idUsuario = id;
	    	this.login = login;
	        this.senha = senha;
	    }
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
