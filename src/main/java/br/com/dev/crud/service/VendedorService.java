package br.com.dev.crud.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.dev.crud.entities.Vendedor;
import br.com.dev.crud.repositories.VendedorRepository;

@Service
public class VendedorService {
	
	private VendedorRepository vendedorRepository;

	public VendedorService(VendedorRepository vendedorRepository) {
		super();
		this.vendedorRepository = vendedorRepository;
	}

	public List<Vendedor> list() {
		List<Vendedor> vendedor = new ArrayList<>();
		Iterator<Vendedor> iterator = vendedorRepository.findAll().iterator();
		while (iterator.hasNext()) {
			vendedor.add(iterator.next());
		}
		return vendedor;
	}

	public Vendedor findById(int id) {
		return vendedorRepository.findById(id).orElseGet(null);
	}

	public void save(Vendedor vendedor) {
		vendedorRepository.save(vendedor);
		
	}

	public void delete(int vendedorId) {
		vendedorRepository.deleteById(vendedorId);
		
	}
	
}
