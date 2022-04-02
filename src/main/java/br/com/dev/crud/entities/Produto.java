package br.com.dev.crud.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {
	
	@Id
	@Column(name = "ID", columnDefinition="NUMERIC(11)")
	private int id;
	@Column(name = "NOME", columnDefinition="VARCHAR(30)")
	private String nome;
	@Column(name = "VALOR", columnDefinition="NUMERIC(11,2)")
	private BigDecimal valor;
		
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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	

}
