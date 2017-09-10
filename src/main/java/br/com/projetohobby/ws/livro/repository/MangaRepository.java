package br.com.projetohobby.ws.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.com.projetohobby.ws.model.Manga;

public interface MangaRepository extends Repository<Manga, Long> {

	List<Manga> findAll();
}
