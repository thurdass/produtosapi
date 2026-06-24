package com.thurdass.produtosapi.controller;

import com.thurdass.produtosapi.model.Produto;
import com.thurdass.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
    this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
   produtoRepository.save(produto);
    return produto;

}
@GetMapping("/{id}")
 public Produto obterporId(@PathVariable("id") String id) {
     Optional<Produto> produto = produtoRepository.findById(id);
     return produto.isPresent() ? produto.get() : null;

 }
 @DeleteMapping("/{id}")
 public void deletarporId(@PathVariable("id") String id) {
     produtoRepository.deleteById(id);
 }

}
