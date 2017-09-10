package br.com.projetohobby.ws.midia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.projetohobby.ws.model.Genero;

@Entity
public class Anime extends Midia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<TemporadaAnime> temporadas;
	
	@OneToOne
	private Anime cronologia;
	
	@ElementCollection(targetClass = Genero.class)
	@Enumerated(EnumType.STRING)
	@CollectionTable(name="anime_genero")
	@Column(name = "genero")
	private List<Genero> generos;
	
	public Anime() {
		super();
		
		this.generos = new ArrayList<>();
		this.temporadas = new ArrayList<>();
	}
	
	public Anime(Long id, String nome) {
		super(id, nome);
		
		this.generos = new ArrayList<>();
		this.temporadas = new ArrayList<>();
	}

	public List<TemporadaAnime> getTemporadas() {
		return temporadas;
	}

	public void addTemporada(TemporadaAnime temporada) {
		this.temporadas.add(temporada);
	}

	public void removeTemporada(TemporadaAnime temporada) {
		this.temporadas.remove(temporada);
	}
	
	public Anime getCronologia() {
		return cronologia;
	}

	public void setCronologia(Anime cronologia) {
		this.cronologia = cronologia;
	}
	
	public List<Genero> getGenero() {
		return generos;
	}

	public void addGenero(Genero genero) {
		generos.add(genero);
	}
	
	public void removeGenero(Genero genero) {
		generos.remove(genero);
	}

	public Integer getQtTemporadas() {
		if (temporadas == null)
			return 0;
		else
			return temporadas.size();
	}
	
	public Integer getQtEpisodios() {
		if (temporadas == null)
			return 0;
		else {
			Integer qtEpisodios = 0;
			for (Temporada temporada : temporadas) {
				qtEpisodios += temporada.getQtEpisodios();
			}
			return qtEpisodios;
		}
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Anime [");
		
		if (super.getId() != null && super.getNome() != null && super.getAno() != 0)
			strBuilder.append("id = ").append(super.getId()).append(", ").append(super.getNome())
				.append(", (").append(super.getAno()).append(")");
		else if (super.getId() != null && super.getNome() != null)
			strBuilder.append("id = ").append(super.getId()).append(", ").append(super.getNome());
		
		strBuilder.append("]");
		return strBuilder.toString();
	}

}
