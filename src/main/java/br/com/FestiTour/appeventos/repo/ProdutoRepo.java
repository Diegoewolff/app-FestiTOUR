package br.com.FestiTour.appeventos.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.FestiTour.appeventos.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{

}
