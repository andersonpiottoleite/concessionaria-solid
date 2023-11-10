package br.com.cafetecnico.solid.abertofechado.solucao;

import java.math.BigDecimal;

import br.com.cafetecnico.solid.modelo.Compra;

public class CalculadoraValorCompra {
	
	public BigDecimal calculaValor(Compra compra, PagamentoCarroCalculavel pagamentoCarroCalculavel) {
		return pagamentoCarroCalculavel.calculaValor(compra);
	}

}
