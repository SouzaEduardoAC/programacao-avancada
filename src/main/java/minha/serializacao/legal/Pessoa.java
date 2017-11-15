package minha.serializacao.legal;

import java.io.Serializable;
import java.util.Date;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Date nascimento;
	private Long idade;
	
	public Pessoa(int id, String nome, Date dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		nascimento = dataNascimento;
		idade = 30L;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public long getTempoDeVida() {
		return idade;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome
				+ ", dataNascimento=" + nascimento + ", tempoDeVida="
				+ idade + "]";
	}
	
}
