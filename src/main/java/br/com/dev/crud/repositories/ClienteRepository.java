package br.com.dev.crud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dev.crud.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
