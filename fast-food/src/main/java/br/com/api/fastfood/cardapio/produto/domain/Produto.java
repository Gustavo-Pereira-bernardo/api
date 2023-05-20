package br.com.api.fastfood.cardapio.produto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "prod_cd_id")
private Long id;
@Column(name = "prod_tx_nome", nullable = false)
private String nome;
@Column(name = "prod_nm_valor", nullable = false)
private Double valor;
@Column(name = "prod_tx_categoria", nullable = false)
private String categoria;

Produto(){
	
}

public Produto(Long id, String nome, Double valor, String categoria) {
	this.id = id;
	this.nome = nome;
	this.valor = valor;
	this.categoria = categoria;
	
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Double getValor() {
	return valor;
}

public void setValor(Double valor) {
	this.valor = valor;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}


}
