package br.com.projetohobby.ws.livro.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Livro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	private String editora;

	private String idioma;

	@Column(name = "tipo_capa")
	// comum, dura, 
	private String tipoCapa;

	@Column(name = "ano_publicacao")
	private Integer anoPublicacao;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getTipoCapa() {
		return tipoCapa;
	}

	public void setTipoCapa(String tipoCapa) {
		this.tipoCapa = tipoCapa;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public abstract Integer quantosJaLeu();
	
}
