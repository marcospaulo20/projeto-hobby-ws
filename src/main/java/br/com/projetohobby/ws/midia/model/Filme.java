package br.com.projetohobby.ws.midia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Filme extends Midia implements MidiaCinematografica, Serializable {

	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "filme")
	private List<Estudio> estudios;

	@OneToMany(mappedBy = "filme")
	private List<Ator> elencos;

	@OneToMany(mappedBy = "filme")
	private List<Diretor> diretores;

	@OneToMany(mappedBy = "filme")
	private List<Roterista> roteristas;

	@OneToOne
	private Midia cronologia;

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
	public Midia getCronologia() {
		return cronologia;
	}

	@Override
	public void setCronologia(Midia cronologia) {
		this.cronologia = cronologia;
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