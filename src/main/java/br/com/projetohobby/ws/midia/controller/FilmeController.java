package br.com.projetohobby.ws.midia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.projetohobby.ws.midia.model.Filme;
import br.com.projetohobby.ws.midia.service.FilmeService;
import br.com.projetohobby.ws.util.CustomErrorType;

@RestController
public class FilmeController {

	@Autowired
	private FilmeService filmeService;

	@RequestMapping(value = "/filmes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Filme>> buscarTodos() {

		List<Filme> filmes = filmeService.findAll();

		if (filmes.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(filmes, HttpStatus.OK);
	}

	@RequestMapping(value = "/filmes/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscarPorId(@PathVariable("id") Long id) {

		Filme filme = filmeService.findById(id);

		if (filme == null)
			return new ResponseEntity<>(new CustomErrorType("O Filme com ID " + id + " não encontrado."),
					HttpStatus.NOT_FOUND);

		return new ResponseEntity<Filme>(filme, HttpStatus.OK);
	}

	@RequestMapping(value = "/filmes", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> criarFilme(@RequestBody Filme filme, UriComponentsBuilder ucBuilder) {

		if (filmeService.isExists(filme))
			return new ResponseEntity<>(
					new CustomErrorType(
							"Não foi possível criar. " + "O filme com nome " + filme.getNome() + " já existe."),
					HttpStatus.CONFLICT);

		filmeService.save(filme);

		HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/filmes/{id}").buildAndExpand(filme.getId()).toUri());
		
		return new ResponseEntity<Filme>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/filmes/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> alterarFilme(@PathVariable("id") Long id, @RequestBody Filme filme) {

		if (!filmeService.isExists(id))
			return new ResponseEntity<>(
					new CustomErrorType("Não foi possível atualizar. " + "Filme com ID " + id + " não encontrado."),
					HttpStatus.NOT_FOUND);

		filmeService.update(filme);
		return new ResponseEntity<Filme>(filme, HttpStatus.OK);
	}

	@RequestMapping(value = "/filmes/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletaFilme(@PathVariable("id") Long id) {

		if (!filmeService.isExists(id))
			return new ResponseEntity<>(
					new CustomErrorType("Não foi possível excluir. " + "Filme com ID " + id + " não encontrado."),
					HttpStatus.NOT_FOUND);

		filmeService.deleteById(id);
		return new ResponseEntity<Filme>(HttpStatus.NO_CONTENT);
	}
}