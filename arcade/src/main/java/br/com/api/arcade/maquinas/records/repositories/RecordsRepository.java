package br.com.api.arcade.maquinas.records.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.arcade.maquinas.records.domain.Records;

@Repository

public interface RecordsRepository extends JpaRepository<Records , Long>{
	
}
