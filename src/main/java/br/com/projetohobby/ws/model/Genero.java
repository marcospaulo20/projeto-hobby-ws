package br.com.projetohobby.ws.model;

public enum Genero {

	ACAO("Ação"),
	AVENTURA("Aventura"),
	COMEDIA("Comédia"),
	DRAMA_POLICIAL("Drama Policial"),
	TRAGEDIA("Tragédia");
	
	private String descricao;
	
	Genero(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
