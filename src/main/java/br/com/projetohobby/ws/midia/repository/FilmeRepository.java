package br.com.projetohobby.ws.midia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.projetohobby.ws.midia.model.Filme;

public interface FilmeRepository extends CrudRepository<Filme, Long> {

	@Query("SELECT f FROM Filme f LEFT JOIN FETCH f.cronologia")
	List<Filme> findAll();
}
