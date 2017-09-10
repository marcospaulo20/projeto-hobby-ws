package br.com.projetohobby.ws.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetohobby.ws.livro.model.Manga;
import br.com.projetohobby.ws.livro.service.MangaService;

@RestController
public class MangaController {

	@Autowired
	private MangaService mangaService;
	
	@RequestMapping(value = "/mangas", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Manga>> findAll() {
		List<Manga> mangas = mangaService.findAll();
		
		return new ResponseEntity<>(mangas, HttpStatus.OK);
	}
}
