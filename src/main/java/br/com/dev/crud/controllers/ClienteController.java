package br.com.dev.crud.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.crud.entities.Cliente;
import br.com.dev.crud.entities.Produto;
import br.com.dev.crud.service.ClienteService;

@RestController
public class ClienteController {
	
	private ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		super();
		this.clienteService = clienteService;
	}
	
	@GetMapping("/cliente/listar")
	public List<Cliente> list(){
		return clienteService.list();
	}
	
	@GetMapping("/cliente/ler/{id}")
	public @ResponseBody Cliente findById(@PathVariable int id) {
		return clienteService.findById(id);
	}
	
	@PostMapping("/cliente/criar")
	public void create(@RequestBody Cliente cliente) {
		clienteService.save(cliente);
	}
	
	@PutMapping("/cliente/atualizar")
	public void update(@RequestBody Cliente cliente) {
		clienteService.save(cliente);
	}
	
	@DeleteMapping("/cliente/excluir/{id}")
	public void delete(@PathVariable int id) {
		clienteService.delete(id);
	}

}
