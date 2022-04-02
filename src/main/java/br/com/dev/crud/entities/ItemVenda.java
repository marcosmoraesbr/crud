package br.com.dev.crud.entities;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ItemVenda {
	
	@Id
	@Column(name = "ID", columnDefinition="NUMERIC(11)")
	private int id;
	@ManyToOne
	@JoinColumn(name = "VENDA_ID", columnDefinition="NUMERIC(11)")
	private Venda venda;
	@OneToOne
	@JoinColumn(name = "PRODUTO_ID", columnDefinition="NUMERIC(11)")
	private Produto produto;
	@Column(name = "QUANTIDADE", columnDefinition="NUMERIC(11)")
	private BigInteger quantidade;
	@Column(name = "VALOR_UN", columnDefinition="NUMERIC(11,2)")
	private BigDecimal valorUnitario;
	@Column(name = "TOTAL", columnDefinition="NUMERIC(11,2)")
	private BigDecimal total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public BigInteger getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigInteger quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	

}
