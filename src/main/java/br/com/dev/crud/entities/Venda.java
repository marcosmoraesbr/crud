package br.com.dev.crud.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VENDA")
@SequenceGenerator(name="VENDA_SEQ", initialValue=1, allocationSize=1)
public class Venda {

	@Id
	@Column(name = "ID", columnDefinition="NUMERIC(11)")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VENDA_SEQ")
	private int id;
	@Column(name = "DATA_VENDA", columnDefinition="DATE")
	private LocalDate dataVenda;
	@OneToOne
	@JoinColumn(name = "CLIENTE_ID", columnDefinition="NUMERIC(11)")
	private Cliente cliente;
	@OneToOne
	@JoinColumn(name = "VENDEDOR_ID", columnDefinition="NUMERIC(11)")
	private Vendedor vendedor;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<ItemVenda> itens;
	
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

	public List<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	
}
