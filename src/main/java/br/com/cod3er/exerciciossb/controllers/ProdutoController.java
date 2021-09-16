package br.com.cod3er.exerciciossb.controllers;

import br.com.cod3er.exerciciossb.model.entities.Produto;
import br.com.cod3er.exerciciossb.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody  Produto novoProduto(Produto produto){
        produtoRepository.save(produto);
        return produto;
    }
}
