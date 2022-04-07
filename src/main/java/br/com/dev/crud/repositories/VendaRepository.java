package br.com.dev.crud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dev.crud.entities.Venda;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Integer>{

}
