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
public class Serie extends Midia implements Serializable {

	private static final long serialVersionUID = 1L;
		
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<TemporadaSerie> temporadas;
	
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<Estudio> estudios;
	
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<Ator> elencos;		
	
	@ElementCollection(targetClass = Genero.class)
	@Enumerated(EnumType.STRING)
	@CollectionTable(name="serie_genero")
	@Column(name = "genero")
	private List<Genero> generos;
	
	@OneToOne
	private Serie cronologia;
	
	public Serie() {
		super();
		
		this.temporadas = new ArrayList<>();
		this.estudios = new ArrayList<>();
		this.elencos = new ArrayList<>();
		this.generos = new ArrayList<>();
	}
	
	public Serie(Long id, String nome) {		
		super(id, nome);

		this.temporadas = new ArrayList<>();
		this.estudios = new ArrayList<>();
		this.elencos = new ArrayList<>();
		this.generos = new ArrayList<>();
	}
	
	public List<TemporadaSerie> getTemporadas() {
		return temporadas;
	}

	public void addTemporada(TemporadaSerie temporada) {
		this.temporadas.add(temporada);
	}

	public void removeTemporada(TemporadaSerie temporada) {
		this.temporadas.remove(temporada);
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
	
	public List<Genero> getGenero() {
		return generos;
	}

	public void addGenero(Genero genero) {
		generos.add(genero);
	}
	
	public void removeGenero(Genero genero) {
		generos.remove(genero);
	}
	
	public Serie getCronologia() {
		return cronologia;
	}

	public void setCronologia(Serie cronologia) {
		this.cronologia = cronologia;
	}
	
	public List<Estudio> getEstudios() {
		return estudios;
	}

	public List<Ator> getElencos() {
		return elencos;
	}
	
	public void addEstudio(Estudio estudio) {
		estudios.add(estudio);
	}

	public void removeEstudio(Estudio estudio) {
		estudios.remove(estudio);
	}

	public void addAtor(Ator ator) {
		elencos.add(ator);
	}

	public void removeAtor(Ator ator) {
		elencos.remove(ator);
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Serie [");
		
		if (super.getId() != null && super.getNome() != null && super.getAno() != 0)
			strBuilder.append("id = ").append(super.getId()).append(", ").append(super.getNome())
				.append(", (").append(super.getAno()).append(")");
		else if (super.getId() != null && super.getNome() != null)
			strBuilder.append("id = ").append(super.getId()).append(", ").append(super.getNome());
		
		strBuilder.append("]");
		return strBuilder.toString();
	}

}