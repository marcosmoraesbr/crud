package br.com.dev.crud.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Venda {

	@Id
	@Column(name = "ID", columnDefinition="NUMERIC(11)")
	private int id;
	@Column(name = "DATA_VENDA", columnDefinition="DATE")
	private LocalDate dataVenda;
	@OneToOne
	@JoinColumn(name = "CLIENTE_ID", columnDefinition="NUMERIC(11)")
	private Cliente cliente;
	@OneToOne
	@JoinColumn(name = "VENDEDOR_ID", columnDefinition="NUMERIC(11)")
	private Vendedor vendedor;
	@Column(name = "TOTAL", columnDefinition="NUMERIC(11,2)")
	private BigDecimal total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
