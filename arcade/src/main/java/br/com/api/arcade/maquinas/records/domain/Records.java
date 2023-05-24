package br.com.api.arcade.maquinas.records.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "records")

public class Records {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rec_cd_id")
	private long id;
	@Column(name = "rec_tx_player")
	private String player;
	@Column(name = "rec_int_pontuacao")
	private int pontuação;
	@Column(name = "rec_int_tentativas")
	private int tentativas;

	Records(){
		
	}

	public Records(long id, String player, int pontuação, int tentativas) {
		super();
		this.id = id;
		this.player = player;
		this.pontuação = pontuação;
		this.tentativas = tentativas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public int getPontuação() {
		return pontuação;
	}

	public void setPontuação(int pontuação) {
		this.pontuação = pontuação;
	}

	public int getTentativas() {
		return tentativas;
	}

	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}
	
}
