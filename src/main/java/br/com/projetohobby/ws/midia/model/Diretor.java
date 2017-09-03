package br.com.projetohobby.ws.midia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.projetohobby.ws.model.Pessoa;

@Entity
public class Diretor extends ProfissionalMidias implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Pessoa pessoa;
	
	public Diretor() {
		super();
		
		this.pessoa = new Pessoa();
	}

	public Diretor(Long id, String nome) {
		super(id);
		
		this.pessoa = new Pessoa();
		this.pessoa.setNome(nome);
	}

	public Diretor(Long id, String nome, String pais) {
		super(id);
		
		this.pessoa = new Pessoa();
		this.pessoa.setNome(nome);
		this.pessoa.setPais(pais);
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Diretor [");

		if (this.pessoa != null && this.pessoa.getId() != null && this.pessoa.getNome() != null && this.pessoa.getPais() != null)
			strBuilder.append("id = ").append(this.pessoa.getId()).append(", ").append(this.pessoa.getNome()).append(", país (")
					.append(this.pessoa.getPais()).append(")");
		else if (this.pessoa != null && this.pessoa.getId() != null && this.pessoa.getNome() != null)
			strBuilder.append("id = ").append(this.pessoa.getId()).append(", ").append(this.pessoa.getNome());

		strBuilder.append("]");
		return strBuilder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}
	
}
