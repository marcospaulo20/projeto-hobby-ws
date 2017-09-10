package br.com.projetohobby.ws.midia.model;

import java.util.ArrayList;
import java.util.List;

import br.com.projetohobby.ws.model.Genero;
import br.com.projetohobby.ws.model.Pessoa;
import br.com.projetohobby.ws.model.Roterista;

public class TestMidiaSerie {

	private static List<Serie> testSeries() {
		List<Serie> series = new ArrayList<>();
		
		// pessoas
		Pessoa pessoa1 = new Pessoa(1L, "Anna Torv");
		pessoa1.setSexo("F");
		
		Pessoa pessoa2 = new Pessoa(2L, "Joshua Jackson");
		pessoa2.setSexo("M");

		Pessoa pessoa3 = new Pessoa(3L, "John Noble");
		pessoa3.setSexo("M");

		Pessoa pessoa4 = new Pessoa(4L, "Lance Reddick");
		pessoa4.setSexo("M");

		Pessoa pessoa5 = new Pessoa(5L, "Blair Brown");
		pessoa5.setSexo("M");

		Pessoa pessoa6 = new Pessoa(6L, "Alex Graves");
		pessoa6.setSexo("M");

		Pessoa pessoa7 = new Pessoa(7L, "J. J. Abrams");
		pessoa7.setSexo("M");
		
		Pessoa pessoa8 = new Pessoa(8L, "Alex Kurtzman");
		pessoa8.setSexo("M");
		
		Pessoa pessoa9 = new Pessoa(9L, "Roberto Orci");
		pessoa9.setSexo("M");
		
		Pessoa pessoa10 = new Pessoa(10L, "Paul Edwards");
		pessoa10.setSexo("M");
		
		Pessoa pessoa11 = new Pessoa(11L, "Jeff Pinkner");
		pessoa11.setSexo("M");
		
		// elencos
		
		Ator ator1 = new Ator(1L, pessoa1);
		ator1.setPersonagem("Olivia Dunham");
		
		Ator ator2 = new Ator(2L, pessoa2);
		ator2.setPersonagem("Peter Bishop");
		
		Ator ator3 = new Ator(3L, pessoa3);
		ator3.setPersonagem("Dr. Walter Bishop");

		Ator ator4 = new Ator(4L, pessoa4);
		ator4.setPersonagem("Phillip Broyles");
		
		Ator ator5 = new Ator(5L, pessoa5);
		ator5.setPersonagem("Nina Sharp");
				
		// estudios
		Estudio estudio = new Estudio(1L);
		estudio.setNome("Warner Bros. Television");	
		
		// serie 
		Serie fringe = new Serie(1L, "Fringe");
		fringe.setAno(2008);
		fringe.setClassificacao("10");
		fringe.setDuracao(43);
		fringe.setNomeOriginal("Fringe");
		fringe.addGenero(Genero.TRAGEDIA);
		fringe.setSinopse("Fringe follows the casework of the Fringe Division, a Joint Federal Task Force supported primarily by the Federal Bureau of Investigation, which includes Agent Olivia Dunham; Dr. Walter Bishop, the archetypal mad scientist; and Peter Bishop, Walter's estranged son and jack-of-all-trades. They are supported by Phillip Broyles (Lance Reddick), the force's director, and Agent Astrid Farnsworth (Jasika Nicole), who assists Walter in laboratory research. The Fringe Division investigates cases relating to fringe science, ranging from transhumanist experiments gone wrong to the prospect of a destructive technological singularity to a possible collision of two parallel universes. The Fringe Division's work often intersects with advanced biotechnology developed by a company called Massive Dynamic, founded by Walter's former partner, Dr. William Bell (Leonard Nimoy), and run by their common friend, Nina Sharp (Blair Brown). The team is also watched silently by a group of bald, pale men who are called 'Observers'.");

		// elencos
		fringe.addAtor(ator1);
		fringe.addAtor(ator2);
		fringe.addAtor(ator3);
		fringe.addAtor(ator4);
		fringe.addAtor(ator5);
		
		// estudio
		fringe.addEstudio(estudio);
		
		// Temporadas
		TemporadaSerie temp1 = new TemporadaSerie(1L);
		temp1.setAno(2008);
		temp1.setNome("Season 1");
		temp1.setNumero(1);
		
		// Episodios
		EpisodioSerie episodio1 = new EpisodioSerie(1L);
		episodio1.setNome("Pilot");
		episodio1.setNumero(1);
		
		Diretor diretor1 = new Diretor(1L, pessoa6);
		episodio1.setDiretor(diretor1);
		
		Roterista roterista1 = new Roterista(1L, pessoa7);
		Roterista roterista2 = new Roterista(2L, pessoa8);
		Roterista roterista3 = new Roterista(3L, pessoa9);
		episodio1.addRoterista(roterista1);
		episodio1.addRoterista(roterista2);
		episodio1.addRoterista(roterista3);
		
		episodio1.setJaAssitir(true);
		episodio1.setTenhoNaColecao(false);		
		
		EpisodioSerie episodio2 = new EpisodioSerie(2L);
		episodio2.setNome("The Same Old Story");
		episodio2.setNumero(2);
		
		Diretor diretor2 = new Diretor(2L, pessoa10);
		episodio2.setDiretor(diretor2);
		
		Roterista roterista4 = new Roterista(4L, pessoa11);
		Roterista roterista5 = new Roterista(5L, pessoa7);
		Roterista roterista6 = new Roterista(6L, pessoa8);
		Roterista roterista7 = new Roterista(7L, pessoa9);
		episodio2.addRoterista(roterista4);
		episodio2.addRoterista(roterista5);
		episodio2.addRoterista(roterista6);
		episodio2.addRoterista(roterista7);
		
		episodio2.setJaAssitir(true);
		episodio2.setTenhoNaColecao(false);
		
		// adicionado episodios na temporada
		temp1.addEpisodio(episodio1);
		temp1.addEpisodio(episodio2);
		
		// adicionado tempórada na serie
		fringe.addTemporada(temp1);
		
		series.add(fringe);
		
		return series;
	}
	
	public static void main(String[] args) {
		for (Serie serie : testSeries()) {
			System.out.println(serie);
			System.out.println("Descrição da serie");
			
			System.out.println("--------------------------------------------------");
			System.out.println("Ano: " + serie.getAno());
			System.out.println("Classificação: " + serie.getClassificacao());
			System.out.println("Genero: " + serie.getGenero());
			System.out.println("Duração: " + serie.getDuracao());

			System.out.println("");
			System.out.println("Sinopse: ");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(serie.getSinopse());
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("");
			
			System.out.println("Qt. Temporadas: " + serie.getQtTemporadas());
			System.out.println("Qt. Episodios: " + serie.getQtEpisodios());
			System.out.println("");
			
			for (Ator ator: serie.getElencos())
				System.out.println(ator);
			
			System.out.println("");
			
			for (Estudio estudio : serie.getEstudios())
				System.out.println("Estudio: " + estudio.getNome());
			
			for (TemporadaSerie temporada : serie.getTemporadas()) {
				System.out.println(temporada);
				System.out.println("");
				for (EpisodioSerie epS : temporada.getEpisodios()) {
					System.out.println(epS);
					System.out.println("Diretor: " + epS.getDiretor());
					for (Roterista roterista : epS.getRoterista())
						System.out.println(roterista);
					
					System.out.println("");
					System.out.println("Resumo: ");
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println(epS.getResumo() == null ? "" : epS.getResumo());
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("");
				}
			}
		}
	}
}