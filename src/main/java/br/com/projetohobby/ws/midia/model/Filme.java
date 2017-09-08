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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.projetohobby.ws.model.Genero;

@Entity
@Table(name = "filme")
public class Filme extends Midia implements MidiaCinematografica, Serializable {

	private static final long serialVersionUID = 1L;

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
	
	@ElementCollection(targetClass = Genero.class)
	@Enumerated(EnumType.STRING)
	@CollectionTable(name="filme_genero")
	@Column(name = "genero")
	private List<Genero> generos;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "cronologia_id")
	private Filme cronologia;

	private boolean tenhoNaColecao;
	private boolean jaAssitir;

	public Filme() {
		super();
		this.estudios = new ArrayList<>();
		this.elencos = new ArrayList<>();
		this.diretores = new ArrayList<>();
		this.roteristas = new ArrayList<>();
	}

	public Filme(Long id, String nome) {
		super(id, nome);

		this.estudios = new ArrayList<>();
		this.elencos = new ArrayList<>();
		this.diretores = new ArrayList<>();
		this.roteristas = new ArrayList<>();
	}

	public Filme getCronologia() {
		return cronologia;
	}

	public void setCronologia(Filme cronologia) {
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
		strBuilder.append("Filme [");

		if (super.getId() != null && super.getNome() != null && super.getAno() != 0)
			strBuilder.append("id = ").append(super.getId()).append(", ").append(super.getNome()).append(", (")
					.append(super.getAno()).append(")");
		else if (super.getId() != null && super.getNome() != null)
			strBuilder.append("id = ").append(super.getId()).append(", ").append(super.getNome());

		strBuilder.append("]");
		return strBuilder.toString();
	}

}