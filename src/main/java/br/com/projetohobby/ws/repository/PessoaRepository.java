package br.com.projetohobby.ws.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projetohobby.ws.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
