package br.com.projetohobby.ws.midia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.projetohobby.ws.model.Pessoa;

@Entity
public class Ator implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Pessoa pessoa;
	
	private String personagem;
	
	public Ator() {
		super();
		
		this.pessoa = new Pessoa();		
	}
	
	public Ator(Long id) {
		this.id = id;
		this.pessoa = new Pessoa();
	}
	
	public Ator(Long id, Pessoa pessoa) {
		this.id = id;
		this.pessoa = pessoa;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String getPersonagem() {
		return personagem;
	}
	
	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Ator: ");
		
		if (this.pessoa.getNome() != null && this.personagem != null)
			strBuilder.append(this.pessoa.getNome()).append(", (").append(this.personagem).append(")");
		else if (this.id != null && this.pessoa != null && this.pessoa.getNome() != null)
			strBuilder.append("id = ").append(this.id).append(", ").append(this.pessoa.getNome());
		
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
		Ator other = (Ator) obj;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}
	
}