package br.com.projetohobby.ws.livro.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Manga extends Livro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Manga() {
		
	}
	
	@Override
	public Integer quantosJaLeu() {
		return null;
	}

}
