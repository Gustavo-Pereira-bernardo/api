package br.com.api.jogo.inventario.itens.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.api.jogo.inventario.itens.repositories.ItensRepository;
import java.util.List;
import java.util.Optional;
import br.com.api.jogo.inventario.itens.domain.Item;

@Service

public class ItensService {
	@Autowired
	
	ItensRepository itensRepository;
	
	
	public void buscarItem(long idItem) {
		
	}

	public void novoItem(Item item) {
		
		itensRepository.save(item);
	}

    public Item buscarPorId(Long id) {
        Optional<Item> produtoOptional = itensRepository.findById(id);
        return produtoOptional.orElse(null);
    }

    public List<Item> listar() {
        return itensRepository.findAll();
    }

    public void atualizar(Long id, Item itemAtualizado) {
        Optional<Item> itemOptional = itensRepository.findById(id);
        if (itemOptional.isPresent()) {
            Item item = itemOptional.ge();
            item.setNome(itemAtualizado.getValue().
            // Atualizar outros campos necessários

            // Atualizar outros campos necessários

            itensRepository.save(item);
        }
    }

    public void deletar(Long id) {
        itensRepository.deleteById(id);
    }
}
