package br.com.projetohobby.ws.midia.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Anime extends Midia implements MidaTelevisiva, Serializable {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "anime")
	private List<Temporada> temporadas;
	
	@OneToOne
	private Midia cronologia;
	
	public Anime(Long id, String nome) {
		super(id, nome);
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
	public Midia getCronologia() {
		return cronologia;
	}

	@Override
	public void setCronologia(Midia cronologia) {
		this.cronologia = cronologia;
	}

	@Override
	public Integer getQtTemporadas() {
		if (temporadas == null)
			return null;
		else
			return temporadas.size();
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
