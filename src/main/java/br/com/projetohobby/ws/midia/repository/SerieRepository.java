package br.com.projetohobby.ws.midia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import br.com.projetohobby.ws.midia.model.Serie;

public interface SerieRepository extends Repository<Serie, Long> {

	@Query("SELECT s FROM Serie s LEFT JOIN FETCH s.cronologia")
	List<Serie> findAll();

}
