package br.com.cafetecnico.solid.modelo;

import java.math.BigDecimal;

public class Carro {
	
	private Long id;
	
	private String marca;oi(
	
	private String modelo;
	
	private int ano;
	
	private BigDecimal preco;

	public Carro(Long id, String marca, String modelo, int ano, BigDecimal preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
