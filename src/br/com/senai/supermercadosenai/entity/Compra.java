package br.com.senai.supermercadosenai.entity;

import java.time.LocalDate;

public class Compra {

	private Integer id;
	
	private LocalDate dataDeMovimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataDeMovimento() {
		return dataDeMovimento;
	}

	public void setDataDeMovimento(LocalDate dataDeMovimento) {
		this.dataDeMovimento = dataDeMovimento;
	}
	
	
}
