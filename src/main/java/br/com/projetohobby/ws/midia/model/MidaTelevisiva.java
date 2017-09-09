package br.com.projetohobby.ws.midia.model;

import java.util.List;

public interface MidaTelevisiva {

	List<Temporada> getTemporadas();
	void addTemporada(Temporada temporada);
	void removeTemporada(Temporada temporada);
	
	Integer getQtTemporadas();
}
