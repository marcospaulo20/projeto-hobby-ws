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
	
	public Filme findById(Long id) {
		return filmeRepository.findOne(id);
	}
	
	public boolean isExists(Long ID) {
		return filmeRepository.exists(ID);
	}
	
	public boolean isExists(Filme filme) {
		Long ID = filme.getId();
		if (ID == null)
			return false;
		return isExists(ID);
	}
	
	public void save(Filme filme) {
		filmeRepository.save(filme);
	}

	public void update(Filme filmeAtual) {
		save(filmeAtual);
	}
	
	public void deleteById(Long ID) {
		filmeRepository.delete(ID);
	}
}