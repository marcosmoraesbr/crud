package br.com.dev.crud.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.dev.crud.entities.Venda;
import br.com.dev.crud.repositories.VendaRepository;

@Service
public class VendaService {
	
	private VendaRepository vendaRepository;

	public VendaService(VendaRepository vendaRepository) {
		super();
		this.vendaRepository = vendaRepository;
	}
	
	public List<Venda> list() {
		List<Venda> vendas = new ArrayList<>();
		Iterator<Venda> iterator = vendaRepository.findAll().iterator();
		while (iterator.hasNext()) {
			vendas.add(iterator.next());
		}
		return vendas;
	}

	public void save(Venda venda) {
		vendaRepository.save(venda);	
	}

	public void delete(int vendaId) {
		vendaRepository.deleteById(vendaId);	
	}
	
	public Venda findById(int id) {
		return vendaRepository.findById(id).orElseGet(null);
	}

}
