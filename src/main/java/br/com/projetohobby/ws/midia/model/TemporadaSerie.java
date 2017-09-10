package br.com.projetohobby.ws.midia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "serie_temporada")
public class TemporadaSerie extends Temporada {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<EpisodioSerie> episodios;
	
	public TemporadaSerie() {
		super();
		
		this.episodios = new ArrayList<>();
	}
	
	public TemporadaSerie(Long id) {
		super(id);
		
		this.episodios = new ArrayList<>();
	}
	
	public List<EpisodioSerie> getEpisodios() {
		return episodios;
	}
	
	public void addEpisodio(EpisodioSerie episodio) {
		this.episodios.add(episodio);
	}
	
	public void removeEpisodio(EpisodioSerie episodio) {
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
