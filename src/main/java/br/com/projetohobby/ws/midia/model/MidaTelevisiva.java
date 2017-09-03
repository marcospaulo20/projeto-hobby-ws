package br.com.projetohobby.ws.midia.model;

import java.util.List;

public interface MidaTelevisiva {

	List<Temporada> getTemporadas();
	void setTemporada(List<Temporada> temporadas);
	
	Integer getQtTemporadas();
}
