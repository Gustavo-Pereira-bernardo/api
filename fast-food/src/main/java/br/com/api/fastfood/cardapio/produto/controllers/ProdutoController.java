package br.com.api.fastfood.cardapio.produto.controllers;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.api.fastfood.cardapio.produto.domain.Produto;
import br.com.api.fastfood.cardapio.produto.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
@Autowired
ProdutoService produtoService;

@PostMapping
public void novoProduto(@RequestBody Produto produto){
	produtoService.novoProduto(produto);
	
}
@GetMapping("/{id}")
public Produto buscarPorId(@PathVariable Long id) {
    return produtoService.buscarPorId(id);
}

@GetMapping
public List<Produto> listar() {
    return produtoService.listar();
}

@PutMapping("/{id}")
public void atualizar(@PathVariable Long id, @RequestBody Produto produto) {
    produtoService.atualizar(id, produto);
    // Você pode retornar um código de status HTTP 204 (No Content) ou qualquer outro adequado
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    produtoService.deletar(id);
    // Você pode retornar um código de status HTTP 204 (No Content) ou qualquer outro adequado
}
}
