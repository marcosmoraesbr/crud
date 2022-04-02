package br.com.dev.crud.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/produto/list")
	public List<Produto> list(){
		return produtoService.list();
	}

}
