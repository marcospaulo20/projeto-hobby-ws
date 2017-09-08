package br.com.projetohobby.ws.midia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Episodio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(name = "nome_original")
	private String nomeOriginal;
	private int numero;
	private String resumo;

	@OneToOne
	private Diretor diretor;
	@OneToOne
	private Roterista roterista;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="temporada_id")
	private Temporada temporada;
	
	private boolean tenhoNaColecao;
	private boolean jaAssitir;
	
	public Episodio() {		}
	
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

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public Roterista getRoterista() {
		return roterista;
	}

	public void setRoterista(Roterista roterista) {
		this.roterista = roterista;
	}
	
	public Temporada getTemporada() {
		return temporada;
	}
	
	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
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
	public String toString() {
		return super.toString();
	}

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
