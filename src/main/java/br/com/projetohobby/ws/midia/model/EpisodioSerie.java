package br.com.projetohobby.ws.midia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.projetohobby.ws.model.Roterista;

@Entity
@Table(name = "serie_episodio")
public class EpisodioSerie extends Episodio {

	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Diretor diretor;
	
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<Roterista> roteristas;
	
	public EpisodioSerie() {
		super();
		
		this.roteristas = new ArrayList<>();
	}
	
	public EpisodioSerie(Long id) {
		super(id);
		
		this.roteristas = new ArrayList<>();
	}
	
	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public List<Roterista> getRoterista() {
		return roteristas;
	}

	public void addRoterista(Roterista roterista) {
		this.roteristas.add(roterista);
	}
	
	public void removeRoterista(Roterista roterista) {
		this.roteristas.remove(roterista);
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Episodio: ");
		
		if (this.getNumero() != 0 && this.getNome() != null)
			strBuilder.append(this.getNumero()).append(" - ").append("(").append(this.getNome()).append(")");		
		
		return strBuilder.toString();
	}

}
