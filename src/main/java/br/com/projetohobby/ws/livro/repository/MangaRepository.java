package br.com.projetohobby.ws.livro.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projetohobby.ws.livro.model.Manga;

public interface MangaRepository extends CrudRepository<Manga, Long> {

	List<Manga> findAll();
}
