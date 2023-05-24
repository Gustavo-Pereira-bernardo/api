package br.com.api.arcade.maquinas.records.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.api.arcade.maquinas.records.domain.Records;
import br.com.api.arcade.maquinas.records.repositories.RecordsRepository;
import java.util.List;
import java.util.Optional;

@Service
public class RecordsService {

    @Autowired
    private RecordsRepository recordsRepository;

    public void buscarMaquina(long idMaquina) {
        // Implemente a lógica para buscar a máquina pelo ID
    }

    public void novoRecord(Records records) {
        recordsRepository.save(records);
    }

    public Records buscarPorId(Long id) {
        Optional<Records> recordOptional = recordsRepository.findById(id);
        return recordOptional.orElse(null);
    }

    public List<Records> listar() {
        return recordsRepository.findAll();
    }

    public void atualizar(Long id, Records recordAtualizado) {
        Optional<Records> recordOptional = recordsRepository.findById(id);
        if (recordOptional.isPresent()) {
            Records record = recordOptional.get();
            record.setPlayer(recordAtualizado.getPlayer());
            record.setPontuação(recordAtualizado.getPontuação());
            record.setTentativas(recordAtualizado.getTentativas());
            // Atualizar outros campos necessários

            recordsRepository.save(record);
        }
    }

    public void deletar(Long id) {
        recordsRepository.deleteById(id);
    }
}


	
