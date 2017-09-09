package br.com.projetohobby.ws.midia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetohobby.ws.midia.model.Serie;
import br.com.projetohobby.ws.midia.service.SerieService;

@RestController
public class SerieController {

	@Autowired
	private SerieService serieService;

	@RequestMapping(value = "/series", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Serie>> findAll() {
		List<Serie> series = serieService.findAll();
		
		return new ResponseEntity<>(series, HttpStatus.OK);
	}

}
