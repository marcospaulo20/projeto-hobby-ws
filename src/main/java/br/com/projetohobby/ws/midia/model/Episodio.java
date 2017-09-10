package br.com.projetohobby.ws.midia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;

@MappedSuperclass
public abstract class Episodio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(name = "nome_original")
	private String nomeOriginal;
	private int numero;
	@Lob
	@Type(type = "org.hibernate.type.TextType")
	private String resumo;

	@Column(name = "tenho_colecao")
	private boolean tenhoNaColecao;
	@Column(name = "assistir")
	private boolean jaAssitir;
	
	public Episodio() {	}
	
	public Episodio(Long id) {		
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeOriginal() {
		return nomeOriginal;
	}

	public void setNomeOriginal(String nomeOriginal) {
		this.nomeOriginal = nomeOriginal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public boolean isTenhoNaColecao() {
		return tenhoNaColecao;
	}
	
	public void setTenhoNaColecao(boolean is) {
		this.tenhoNaColecao = is;
	}
	
	public boolean isJaAssitir() {
		return jaAssitir;
	}
	
	public void setJaAssitir(boolean jaAssitir) {
		this.jaAssitir = jaAssitir;
	}

	@Override
	public abstract String toString();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Episodio other = (Episodio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
