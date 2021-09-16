package br.com.cod3er.exerciciossb.controllers;

import br.com.cod3er.exerciciossb.model.entities.Produto;
import br.com.cod3er.exerciciossb.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    //@PostMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody  Produto novoProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProduto(){
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }

    /*
    @PutMapping
    public Produto alterarProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

     */

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}
