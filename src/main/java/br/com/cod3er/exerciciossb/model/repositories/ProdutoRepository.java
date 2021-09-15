package br.com.cod3er.exerciciossb.model.repositories;

import br.com.cod3er.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
