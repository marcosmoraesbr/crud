package br.com.dev.crud.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.dev.crud.entities.Cliente;
import br.com.dev.crud.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	private ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> list() {
		List<Cliente> clientes = new ArrayList<>();
		Iterator<Cliente> iterator = clienteRepository.findAll().iterator();	
		while (iterator.hasNext()) {
			clientes.add(iterator.next());
		}		
		return clientes;
	}

	public void save(Cliente cliente) {
		clienteRepository.save(cliente);		
	}

	public Cliente findById(int id) {
		return clienteRepository.findById(id).orElseGet(null);
	}

	public void delete(int clienteId) {
		clienteRepository.deleteById(clienteId);
	}
	
	

}
