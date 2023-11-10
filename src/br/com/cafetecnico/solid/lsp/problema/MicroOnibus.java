package br.com.cafetecnico.solid.lsp.problema;

import java.math.BigDecimal;

import br.com.cafetecnico.solid.lsp.problema.VeiculoTripulavel;

public class MicroOnibus implements VeiculoTripulavel{
	

	private Long id;
	
	private String marca;
	
	private String modelo;
	
	private int ano;
	
	private BigDecimal preco;

	private int quantidadePortas;

	private int quantidadeAcentos;

	public MicroOnibus(Long id, String marca, String modelo, int ano, BigDecimal preco, int quantidadePortas, int quantidadeAcentos) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
		this.id = id;
		this.quantidadePortas = quantidadePortas;
		this.quantidadeAcentos = quantidadeAcentos;
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

	@Override
	public int getQuantidadePortas() {
		return this.quantidadePortas;
	}

	@Override
	public int getQuantidadeAcentos() {
		return this.quantidadeAcentos;
	}
}
