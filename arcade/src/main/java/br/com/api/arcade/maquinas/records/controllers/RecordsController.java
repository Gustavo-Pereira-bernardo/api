package br.com.api.arcade.maquinas.records.controllers;

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
import br.com.api.arcade.maquinas.records.domain.Records;
import br.com.api.arcade.maquinas.records.service.RecordsService;

@RestController
@RequestMapping("/records")
public class RecordsController {
    @Autowired
    private RecordsService recordsService;

    @PostMapping
    public void novoRecord(@RequestBody Records records) {
        recordsService.novoRecord(records);
    }

    @GetMapping("/{id}")
    public Records buscarPorId(@PathVariable Long id) {
        return recordsService.buscarPorId(id);
    }

    @GetMapping
    public List<Records> listar() {
        return recordsService.listar();
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @RequestBody Records records) {
        recordsService.atualizar(id, records);
        // Você pode retornar um código de status HTTP 204 (No Content) ou qualquer outro adequado
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        recordsService.deletar(id);
        // Você pode retornar um código de status HTTP 204 (No Content) ou qualquer outro adequado
    }
}

