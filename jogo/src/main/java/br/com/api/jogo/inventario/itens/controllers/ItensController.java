package br.com.api.jogo.inventario.itens.controllers;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.api.jogo.inventario.itens.service.ItensService;

@RestController
@RequestMapping("/produtos")
public class ItensController {
@Autowired
ItensService itemService;

@PostMapping
public void novoProduto(@RequestBody Item item){
	itemService.novoItem(item);
	
}
@GetMapping("/{id}")
public Item buscarPorId(@PathVariable Long id) {
    return itemService.buscarPorId(id);
}

@GetMapping
public List<Item> listar() {
    return itemService.listar();
}

@PutMapping("/{id}")
public void atualizar(@PathVariable Long id, @RequestBody Item item) {
    itemService.atualizar(id, item);
    // Você pode retornar um código de status HTTP 204 (No Content) ou qualquer outro adequado
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    itemService.deletar(id);
    // Você pode retornar um código de status HTTP 204 (No Content) ou qualquer outro adequado
}
}
