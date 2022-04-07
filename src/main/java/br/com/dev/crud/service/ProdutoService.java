package br.com.dev.crud.service;

import java.util.ArrayList;
import java.util.Iterator;
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
		Iterator<Produto> iterator = produtoRepository.findAll().iterator();	
		while (iterator.hasNext()) {
			produtos.add(iterator.next());
		}		
		return produtos;
	}

	public void save(Produto produto) {
		produtoRepository.save(produto);		
	}

	public void delete(int produtoId) {
		produtoRepository.deleteById(produtoId);		
	}

	public Produto findById(int id) {		
		return produtoRepository.findById(id).orElseGet(null);
	}

}
