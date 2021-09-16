package br.com.cod3er.exerciciossb.model.repositories;

import br.com.cod3er.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
}
