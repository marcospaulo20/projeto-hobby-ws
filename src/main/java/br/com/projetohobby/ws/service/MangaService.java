package br.com.projetohobby.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetohobby.ws.model.Manga;
import br.com.projetohobby.ws.repository.MangaRepository;

@Service
public class MangaService {

	@Autowired
	private MangaRepository mangaRepository;
	
	public List<Manga> findAll() {
		return mangaRepository.findAll();
	}
}
