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

import br.com.dev.crud.entities.Produto;
import br.com.dev.crud.entities.Vendedor;
import br.com.dev.crud.service.VendedorService;

@RestController
public class VendedorController {
	
	private VendedorService vendedorService;

	public VendedorController(VendedorService vendedorService) {
		super();
		this.vendedorService = vendedorService;
	}
	
	@GetMapping("/vendedor/listar")
	public List<Vendedor> list(){
		return vendedorService.list();
	}
	
	@GetMapping("/vendedor/ler/{id}")
	public @ResponseBody Vendedor findById(@PathVariable int id) {
		return vendedorService.findById(id);
	}
	
	@PostMapping("/vendedor/criar")
	public void create(@RequestBody Vendedor vendedor) {
		vendedorService.save(vendedor);
	}

	@PutMapping("/vendedor/atualizar")
	public void update(@RequestBody Vendedor vendedor) {
		vendedorService.save(vendedor);
	}
	
	@DeleteMapping("/vendedor/excluir/{id}")
	public void delete(@PathVariable int id) {
		vendedorService.delete(id);
	}
}
