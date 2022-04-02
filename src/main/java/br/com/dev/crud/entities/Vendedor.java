package br.com.dev.crud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendedor {

	@Id
	@Column(name = "ID", columnDefinition="NUMERIC(11)")
	private int id;
	@Column(name = "NOME", columnDefinition="VARCHAR(30)")
	private String nome;
	@Column(name = "TELEFONE", columnDefinition="VARCHAR(30)")
	private String telefone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
