package br.com.projetohobby.ws.midia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Serie extends Midia implements MidaTelevisiva, MidiaCinematografica, Serializable {

	private static final long serialVersionUID = 1L;
		
	@OneToMany(
		mappedBy = "serie",
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<Temporada> temporadas;
	
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
	
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<Diretor> diretores;
	
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<Roterista> roteristas;
	
	@OneToOne
	private Serie cronologia;
	
	public Serie() {
		this.estudios = new ArrayList<>();
		this.elencos = new ArrayList<>();
		this.diretores = new ArrayList<>();
		this.roteristas = new ArrayList<>();
	}
	
	public Serie(Long id, String nome) {		
		super(id, nome);
		
		this.estudios = new ArrayList<>();
		this.elencos = new ArrayList<>();
		this.diretores = new ArrayList<>();
		this.roteristas = new ArrayList<>();
	}
	
	@Override
	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	@Override
	public void setTemporada(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	@Override
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
	
	public Serie getCronologia() {
		return cronologia;
	}

	public void setCronologia(Serie cronologia) {
		this.cronologia = cronologia;
	}
	
	@Override
	public List<Estudio> getEstudios() {
		return estudios;
	}

	@Override
	public List<Ator> getElencos() {
		return elencos;
	}

	@Override
	public List<Diretor> getDiretores() {
		return diretores;
	}

	@Override
	public List<Roterista> getRoteristas() {
		return roteristas;
	}
	

	@Override
	public void addEstudio(Estudio estudio) {
		estudios.add(estudio);
	}

	@Override
	public void removeEstudio(Estudio estudio) {
		estudios.remove(estudio);
	}

	@Override
	public void addAtor(Ator ator) {
		elencos.add(ator);
	}

	@Override
	public void removeAtor(Ator ator) {
		elencos.remove(ator);
	}

	@Override
	public void addDiretor(Diretor diretor) {
		diretores.add(diretor);
	}

	@Override
	public void removeDiretor(Diretor diretor) {
		diretores.remove(diretor);
	}

	@Override
	public void addRoterista(Roterista roterista) {
		roteristas.add(roterista);
	}

	@Override
	public void removeRoterista(Roterista roterista) {
		roteristas.remove(roterista);
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