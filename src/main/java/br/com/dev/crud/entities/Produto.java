package br.com.dev.crud.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
@SequenceGenerator(name="PRODUTO_SEQ", initialValue=1, allocationSize=1)
public class Produto {
	
	@Id
	@Column(name = "ID", columnDefinition="NUMERIC(11)")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUTO_SEQ")
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
