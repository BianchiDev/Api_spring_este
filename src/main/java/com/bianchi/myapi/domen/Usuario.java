package com.bianchi.myapi.domen;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;


@Entity()
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty(message = "Campo LOGIN é mandatário")
	@Length(min = 3, max = 100, message = "O Login deve ter entre 3 e 100 caracteres")
	private String login;

	@NotEmpty(message = "Campo NOME é mandatário")
	@Length(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
	private String nome;

	@NotEmpty(message = "Campo SENHA é mandatário")
	@Length(min = 3, max = 100, message = "A senha deve ter entre 3 e 100 caracteres")
	private String senha;

	public Usuario() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario(Integer id, String login, String nome, String senha) {
		super();
		this.id = id;
		this.login = login;
		this.nome = nome;
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}
	

}
