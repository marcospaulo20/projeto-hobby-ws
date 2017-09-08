package br.com.projetohobby.ws.midia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetohobby.ws.midia.model.Filme;
import br.com.projetohobby.ws.midia.service.FilmeService;

@RestController
public class FilmeController {
	
	@Autowired
	private FilmeService filmeService;

	@RequestMapping(value = "/filmes", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Filme>> findAll() {
		List<Filme> filmes = filmeService.findAll();
		
		return new ResponseEntity<>(filmes, HttpStatus.OK);
	}
}
