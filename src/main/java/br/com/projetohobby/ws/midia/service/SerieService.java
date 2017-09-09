package br.com.projetohobby.ws.midia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetohobby.ws.midia.model.Serie;
import br.com.projetohobby.ws.midia.repository.SerieRepository;

@Service
public class SerieService {
	@Autowired
	private SerieRepository serieRepository;
	
	public List<Serie> findAll() {
		return serieRepository.findAll();
	}

}
