package br.com.api.jogo.inventario.itens.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "item_cd_id")
private Long id;
@Column(name = "item_tx_nome", nullable = false)
private String nome;
@Column(name = "item_tx_rank", nullable = false)
private String rank;
@Column(name = "item_tx_categoria", nullable = false)
private String categoria;
public Item(Long id, String nome, String rank, String categoria) {
	this.id = id;
	this.nome = nome;
	this.rank = rank;
	this.categoria = categoria;
}
Item(){
	
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
public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
}





