package br.com.senai.supermercadosenai.entity;

import java.math.BigDecimal;

public class Imposto {
	
	private Integer id;//novo comentario
	
	private BigDecimal valor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
}
