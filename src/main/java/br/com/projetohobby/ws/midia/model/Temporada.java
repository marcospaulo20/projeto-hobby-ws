package br.com.projetohobby.ws.midia.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Temporada implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int numero;
	private int ano;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="serie_id")
	private Serie serie;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="anime_id")
	private Anime anime;
	
	@OneToMany(mappedBy = "episodio")
	private List<Episodio> episodios;
	
	public Temporada() { }
	
	public Temporada(Long id) {
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
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public List<Episodio> getEpisodios() {
		return episodios;
	}
	
	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}
	
	public Integer getQtEpisodios() {
		if (episodios == null)
			return 0;
		else
			return episodios.size();
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Temporada [");
		
		if (this.getId() != null && this.getNome() != null && this.getAno() != 0)
			strBuilder.append("id = ").append(this.getId()).append(", ").append(this.getNome())
				.append(", (").append(this.getAno()).append(")");
		else if (this.getId() != null && this.getNome() != null)
			strBuilder.append("id = ").append(this.getId()).append(", ").append(this.getNome());
		
		strBuilder.append("]");
		return strBuilder.toString();
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
		Temporada other = (Temporada) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
