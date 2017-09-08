package br.com.projetohobby.ws.midia.model;

import java.util.List;

public interface MidiaCinematografica {

	List<Estudio> getEstudios();
	void addEstudio(Estudio estudio);
	void removeEstudio(Estudio estudio);

	List<Ator> getElencos();
	void addAtor(Ator ator);
	void removeAtor(Ator ator);

	List<Diretor> getDiretores();
	void addDiretor(Diretor diretor);
	void removeDiretor(Diretor diretor);

	List<Roterista> getRoteristas();
	void addRoterista(Roterista roterista);
	void removeRoterista(Roterista roterista);
	
}
