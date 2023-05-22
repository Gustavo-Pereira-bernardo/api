package br.com.api.jogo.inventario.itens.repositories;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ItensRepository extends JpaRepository<Item , Long>{
	
}