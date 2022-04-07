package br.com.dev.crud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VENDEDOR")
@SequenceGenerator(name="VENDEDOR_SEQ", initialValue=1, allocationSize=1)
public class Vendedor {

	@Id
	@Column(name = "ID", columnDefinition="NUMERIC(11)")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VENDEDOR_SEQ")
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
