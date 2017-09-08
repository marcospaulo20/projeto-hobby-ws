package br.com.projetohobby.ws.model;

public enum Genero {

	ACAO("Ação"),
	AVENTURA("Aventura"),
	DRAMA_POLICIAL("Drama Policial");
	
	private String descricao;
	
	Genero(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
