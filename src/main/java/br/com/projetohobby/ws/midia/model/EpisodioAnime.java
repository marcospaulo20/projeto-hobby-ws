package br.com.projetohobby.ws.midia.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "anime_episodio")
public class EpisodioAnime extends Episodio {

	private static final long serialVersionUID = 1L;
	
	
	public EpisodioAnime() {
		super();
	}
	
	public EpisodioAnime(Long id) {
		super(id);
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Episodio: ");
		
		if (this.getNumero() != 0 && this.getNome() != null)
			strBuilder.append(this.getNumero()).append(" - ").append(this.getNome()).append(")");		
		
		return strBuilder.toString();
	}

}
