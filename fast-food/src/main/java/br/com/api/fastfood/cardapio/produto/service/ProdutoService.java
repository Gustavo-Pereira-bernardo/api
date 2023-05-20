package br.com.api.fastfood.cardapio.produto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.api.fastfood.cardapio.produto.domain.Produto;
import br.com.api.fastfood.cardapio.produto.repositories.ProdutoRepository;
import java.util.List;
import java.util.Optional;

@Service

public class ProdutoService {
	@Autowired
	
	ProdutoRepository produtoRepository;
	
	
	public void buscarCardapio(long idCardapio) {
		
	}

	public void novoProduto(Produto produto) {
		
		produtoRepository.save(produto);
	}

    public Produto buscarPorId(Long id) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        return produtoOptional.orElse(null);
    }

    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    public void atualizar(Long id, Produto produtoAtualizado) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        if (produtoOptional.isPresent()) {
            Produto produto = produtoOptional.get();
            produto.setNome(produtoAtualizado.getNome());
            produto.setValor(produtoAtualizado.getValor());
            // Atualizar outros campos necessários

            produtoRepository.save(produto);
        }
    }

    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}
	


