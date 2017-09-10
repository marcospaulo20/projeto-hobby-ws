package br.com.projetohobby.ws.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetohobby.ws.livro.model.Manga;
import br.com.projetohobby.ws.livro.repository.MangaRepository;

@Service
public class MangaService {

	@Autowired
	private MangaRepository mangaRepository;
	
	public List<Manga> findAll() {
		return mangaRepository.findAll();
	}
}
