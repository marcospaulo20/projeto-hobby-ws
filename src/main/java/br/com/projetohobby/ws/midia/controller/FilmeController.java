package br.com.projetohobby.ws.midia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetohobby.ws.midia.model.Ator;
import br.com.projetohobby.ws.midia.model.Diretor;
import br.com.projetohobby.ws.midia.model.Filme;
import br.com.projetohobby.ws.midia.model.Roterista;

@RestController
public class FilmeController {

	@RequestMapping(value = "/filmes", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Filme>> findAll() {
		List<Filme> filmes = findAllFilmes();
		
		return new ResponseEntity<>(filmes, HttpStatus.OK);
	}
	
	public List<Filme> findAllFilmes() {
		List<Filme> filmes = new ArrayList<>();
		
		// Filme Superman - O Filme
		List<Ator> elencosFilmeSupermanOFilme = new ArrayList<>();
		List<Roterista> roteristasFilmeSupermanOFilme = new ArrayList<>();
		
		Diretor diretor1 = new Diretor(1L, "Richard Donner");
		Ator ator1 = new Ator(1L, "Christopher Reeve");
		ator1.setPersonagem("Superman:");
		Ator ator2 = new Ator(2L, "Marlon Brando");
		ator2.setPersonagem("Jor-El");
		Ator ator3 = new Ator(3L, "Gene Hackman");
		ator3.setPersonagem("Lex Luntor");
		Ator ator4 = new Ator(4L, "Ned Beatty");
		ator4.setPersonagem("Otis");
		Ator ator5 = new Ator(5L, "Margot Kidder");
		ator5.setPersonagem("Lois Lane");
		
		Roterista roterista1 = new Roterista(1L, "Mario Puzo");
		Roterista roterista2 = new Roterista(2L, "David Newman");
		Roterista roterista3 = new Roterista(3L, "Leslie Newman");
		Roterista roterista4 = new Roterista(4L, "Robert Benton");
		
		elencosFilmeSupermanOFilme.add(ator1);
		elencosFilmeSupermanOFilme.add(ator2);
		elencosFilmeSupermanOFilme.add(ator3);
		elencosFilmeSupermanOFilme.add(ator4);
		elencosFilmeSupermanOFilme.add(ator5);
		
		roteristasFilmeSupermanOFilme.add(roterista1);
		roteristasFilmeSupermanOFilme.add(roterista2);
		roteristasFilmeSupermanOFilme.add(roterista3);
		roteristasFilmeSupermanOFilme.add(roterista4);
		
		Filme supermanOFilme = new Filme(1L, "Superman: O Filme");
		supermanOFilme.setAno(1978);
		supermanOFilme.setNomeOriginal("Superman: The Movie");
		supermanOFilme.setClassificacao("12");
		supermanOFilme.setDuracao(143);
		supermanOFilme.setGenero("Ação / Aventura Ficção científica");
		supermanOFilme.setSinopse("No planeta Krypton, usando provas fornecidas pelo cientista Jor-El, o Conselho condena tentativas de insurreição do General Zod, Ursa e Non à Zona Fantasma. Por isso, Zod jura vingança sobre Jor-El e sua família. Jor-El, apesar de sua eminência, é incapaz de convencer o Conselho de que Krypton em breve será destruído quando seu supergigante sol vermelho entrar em supernova. Para salvar seu filho, Kal-El, Jor-El lança uma nave espacial que o contém para a Terra, um planeta com uma atmosfera adequada onde a estrutura molecular densa de Kal-El lhe dará poderes sobre-humanos. Pouco depois do lançamento, o sol de Krypton explode, destruindo o planeta.");		
		supermanOFilme.getDiretores().add(diretor1);
		supermanOFilme.setJaAssitir(true);
		supermanOFilme.setTenhoNaColecao(true);
		supermanOFilme.getElencos().addAll(elencosFilmeSupermanOFilme);
		supermanOFilme.getRoteristas().addAll(roteristasFilmeSupermanOFilme);
		
		Filme supermanOFilme2 = new Filme(2L, "Superman II");
		
		supermanOFilme.setCronologia(supermanOFilme2);

		// setado filme nos elencos e nos roteristas 
		/*ator1.setFilme(supermanOFilme);
		ator2.setFilme(supermanOFilme);
		ator3.setFilme(supermanOFilme);
		ator4.setFilme(supermanOFilme);
		ator5.setFilme(supermanOFilme);
		
		roterista1.setFilme(supermanOFilme);
		roterista2.setFilme(supermanOFilme);
		roterista3.setFilme(supermanOFilme);
		roterista4.setFilme(supermanOFilme); */
		
		
		filmes.add(supermanOFilme);
		return filmes;	
	}
}
