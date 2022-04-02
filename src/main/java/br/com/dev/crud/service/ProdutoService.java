package br.com.dev.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.dev.crud.entities.Produto;
import br.com.dev.crud.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}

	public List<Produto> list() {
		List<Produto> produtos = new ArrayList<>();

		while (produtoRepository.findAll().iterator().hasNext()) {
			produtos.add(produtoRepository.findAll().iterator().next());
		}

		return produtos;
	}
}
