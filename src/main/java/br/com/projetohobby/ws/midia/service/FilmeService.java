package br.com.projetohobby.ws.midia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetohobby.ws.midia.model.Filme;
import br.com.projetohobby.ws.midia.repository.FilmeRepository;

@Service
public class FilmeService {

	@Autowired
	private FilmeRepository filmeRepository;
	
	public List<Filme> findAll() {
		return filmeRepository.findAll();
	}

	
}
