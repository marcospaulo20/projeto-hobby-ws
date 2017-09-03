package br.com.projetohobby.ws.midia.model;

import java.util.List;

public interface MidiaCinematografica {

	List<Estudio> getEstudios();

	List<Ator> getElencos();

	List<Diretor> getDiretores();

	List<Roterista> getRoteristas();
	
}
