package br.com.projetohobby.ws.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Roterista implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private Pessoa pessoa;

	public Roterista() {
		this.pessoa = new Pessoa();
	}

	public Roterista(Long id, Pessoa pessoa) {
		this.id = id;
		this.pessoa = pessoa;
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
		strBuilder.append("Roterista [");

		if (this.id != null && this.pessoa != null && this.pessoa.getNome() != null && this.pessoa.getPais() != null)
			strBuilder.append("id = ").append(this.id).append(", ").append(this.pessoa.getNome()).append(", país (")
					.append(this.pessoa.getPais()).append(")");
		else if (this.id != null && this.pessoa != null && this.pessoa.getNome() != null)
			strBuilder.append("id = ").append(this.id).append(", ").append(this.pessoa.getNome());

		strBuilder.append("]");
		return strBuilder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Roterista other = (Roterista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}

}
