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
import br.com.dev.crud.service.ProdutoService;

@RestController
public class ProdutoController {
	
	private ProdutoService produtoService;
	
	
	public ProdutoController(ProdutoService produtoService) {
		super();
		this.produtoService = produtoService;
	}

	@GetMapping("/produto/listar")
	public List<Produto> list(){
		return produtoService.list();
	}
	
	@GetMapping("/produto/ler/{id}")
	public @ResponseBody Produto findById(@PathVariable int id) {
		return produtoService.findById(id);
	}
	
	@PostMapping("/produto/criar")
	public void create(@RequestBody Produto produto) {
		produtoService.save(produto);
	}
	
	@PutMapping("/produto/atualizar")
	public void update(@RequestBody Produto produto) {
		produtoService.save(produto);
	}
	
	@DeleteMapping("/produto/excluir/{id}")
	public void delete(@PathVariable int id) {
		produtoService.delete(id);
	}

}
