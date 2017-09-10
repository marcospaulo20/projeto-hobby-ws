package br.com.projetohobby.ws.midia.model;

import java.util.ArrayList;
import java.util.List;

import br.com.projetohobby.ws.model.Genero;
import br.com.projetohobby.ws.model.Pessoa;
import br.com.projetohobby.ws.model.Roterista;

public class TestMidiaFilme {

	private static List<Filme> testFilmes() {
		List<Filme> filmes = new ArrayList<>();
		
		// pessoas
		Pessoa pessoa1 = new Pessoa(1L, "Richard Donner");
		pessoa1.setSexo("M");
		
		Pessoa pessoa2 = new Pessoa(2L, "Christopher Reeve");
		pessoa2.setSexo("M");
		
		Pessoa pessoa3 = new Pessoa(3L, "Marlon Brando");
		pessoa3.setSexo("M");
		
		Pessoa pessoa4 = new Pessoa(4L, "Gene Hackman");
		pessoa4.setSexo("M");
		
		Pessoa pessoa5 = new Pessoa(5L, "Ned Beatty");
		pessoa5.setSexo("F");
		
		Pessoa pessoa6 = new Pessoa(6L, "Margot Kidder");
		pessoa6.setSexo("F");
		
		Pessoa pessoa7 = new Pessoa(7L, "Mario Puzo");
		pessoa7.setSexo("M");
		
		Pessoa pessoa8 = new Pessoa(8L, "David Newman");
		pessoa8.setSexo("M");
		
		Pessoa pessoa9 = new Pessoa(9L, "Leslie Newman");
		pessoa9.setSexo("M");
		
		Pessoa pessoa10 = new Pessoa(10L, "Robert Benton");
		pessoa10.setSexo("M");		
		
		
		// Filme Superman - O Filme
		Diretor diretor1 = new Diretor(1L, pessoa1);
		
		Ator ator1 = new Ator(1L, pessoa2);
		ator1.setPersonagem("Superman");
		Ator ator2 = new Ator(2L, pessoa3);
		ator2.setPersonagem("Jor-El");
		Ator ator3 = new Ator(3L, pessoa4);
		ator3.setPersonagem("Lex Luntor");
		Ator ator4 = new Ator(4L, pessoa5);
		ator4.setPersonagem("Otis");
		Ator ator5 = new Ator(5L, pessoa6);
		ator5.setPersonagem("Lois Lane");
		
		Roterista roterista1 = new Roterista(1L, pessoa7);
		Roterista roterista2 = new Roterista(2L, pessoa8);
		Roterista roterista3 = new Roterista(3L, pessoa9);
		Roterista roterista4 = new Roterista(4L, pessoa10);

		Filme supermanOFilme = new Filme(1L, "Superman: O Filme");
		supermanOFilme.setAno(1978);
		supermanOFilme.setNomeOriginal("Superman: The Movie");
		supermanOFilme.setClassificacao("12");
		supermanOFilme.setDuracao(143);
		supermanOFilme.addGenero(Genero.ACAO);
		supermanOFilme.addGenero(Genero.AVENTURA);
		supermanOFilme.setSinopse("No planeta Krypton, usando provas fornecidas pelo cientista Jor-El, o Conselho condena tentativas de insurreição do General Zod, Ursa e Non à Zona Fantasma. Por isso, Zod jura vingança sobre Jor-El e sua família. Jor-El, apesar de sua eminência, é incapaz de convencer o Conselho de que Krypton em breve será destruído quando seu supergigante sol vermelho entrar em supernova. Para salvar seu filho, Kal-El, Jor-El lança uma nave espacial que o contém para a Terra, um planeta com uma atmosfera adequada onde a estrutura molecular densa de Kal-El lhe dará poderes sobre-humanos. Pouco depois do lançamento, o sol de Krypton explode, destruindo o planeta.");		
		supermanOFilme.getDiretores().add(diretor1);
		supermanOFilme.setJaAssitir(true);
		supermanOFilme.setTenhoNaColecao(true);
		
		// adicionado elencos
		supermanOFilme.addAtor(ator1);
		supermanOFilme.addAtor(ator2);
		supermanOFilme.addAtor(ator3);
		supermanOFilme.addAtor(ator4);
		supermanOFilme.addAtor(ator5);

		// adicionado roteristas
		supermanOFilme.addRoterista(roterista1);
		supermanOFilme.addRoterista(roterista2);
		supermanOFilme.addRoterista(roterista3);
		supermanOFilme.addRoterista(roterista4);
		
		Filme supermanOFilme2 = new Filme(2L, "Superman II");
		
		supermanOFilme.setCronologia(supermanOFilme2);
		filmes.add(supermanOFilme);
		return filmes;
	}
	
	public static void main(String[] args) {
		for (Filme filme : testFilmes()) {
			System.out.println(filme.toString());
			System.out.println("Descrição do Filme");
			
			System.out.println("------------------------------------------------");
			
			System.out.println("Nome original: " + filme.getNomeOriginal());
			System.out.println("Duração: " + filme.getDuracao());
			System.out.println("Classificação: " + filme.getClassificacao());
			System.out.println("Genero: " + filme.getGenero());
			System.out.println("Já assistir? " + (filme.isJaAssitir() ? "Sim" : "Não"));
			System.out.println("Tenho na minha coleção? " + (filme.isTenhoNaColecao() ? "Sim" : "Não"));
			
			System.out.println("");
			System.out.println("Sinopse");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(filme.getSinopse());
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("");
			
			System.out.print("Diretor(s): ");
			for (Diretor diretor : filme.getDiretores())
				System.out.print(diretor.getPessoa().getNome());

			System.out.println("");
			System.out.print("Elenco(s): ");
			for (Ator ator : filme.getElencos())
				System.out.print(ator.getPessoa().getNome() + " (" + ator.getPersonagem() + ")");
			
			System.out.println("");
			
			System.out.print("Roterista(s): ");
			for (Roterista roterista : filme.getRoteristas())
				System.out.print(roterista.getPessoa().getNome());
			
			System.out.println("");
			System.out.println("");
			
			System.out.println("proximo --|> " + filme.getCronologia());
		}
	}
}
