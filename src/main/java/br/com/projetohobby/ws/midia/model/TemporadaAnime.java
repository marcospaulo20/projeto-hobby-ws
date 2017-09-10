package br.com.projetohobby.ws.midia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "anime_temporada")
public class TemporadaAnime extends Temporada {

	private static final long serialVersionUID = 1L;

	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<EpisodioAnime> episodios;
	
	public TemporadaAnime() {
		super();
		
		this.episodios = new ArrayList<>();
	}
	
	public TemporadaAnime(Long id) {
		super(id);
		
		this.episodios = new ArrayList<>();
	}
	
	public List<EpisodioAnime> getEpisodios() {
		return episodios;
	}
	
	public void addEpisodio(EpisodioAnime episodio) {
		this.episodios.add(episodio);
	}
	
	public void removeEpisodio(EpisodioAnime episodio) {
		this.episodios.remove(episodio);
	}

	@Override
	public Integer getQtEpisodios() {
		if (episodios == null)
			return 0;
		else
			return episodios.size();
	}

}
