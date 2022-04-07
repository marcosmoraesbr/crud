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

import br.com.dev.crud.entities.Venda;
import br.com.dev.crud.service.VendaService;

@RestController
public class VendaController {
	
	private VendaService vendaService;

	public VendaController(VendaService vendaService) {
		super();
		this.vendaService = vendaService;
	}
	
	@GetMapping("/venda/listar")
	public List<Venda> list(){
		return vendaService.list();
	}
	
	@GetMapping("/venda/ler/{id}")
	public @ResponseBody Venda findById(@PathVariable int id) {
		return vendaService.findById(id);
	}
	
	@PostMapping("/venda/criar")
	public void create(@RequestBody Venda venda) {
		vendaService.save(venda);
	}
	
	@PutMapping("/venda/atualizar")
	public void update(@RequestBody Venda venda) {
		vendaService.save(venda);
	}
	
	@DeleteMapping("/venda/excluir/{id}")
	public void delete(@PathVariable int id) {
		vendaService.delete(id);
	}

}
