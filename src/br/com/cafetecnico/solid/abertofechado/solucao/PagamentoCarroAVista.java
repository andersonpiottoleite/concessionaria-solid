package br.com.cafetecnico.solid.abertofechado.solucao;

import java.math.BigDecimal;

import br.com.cafetecnico.solid.modelo.Compra;

public class PagamentoCarroAVista implements PagamentoCarroCalculavel {

	@Override
	public BigDecimal calculaValor(Compra compra) {
		BigDecimal desconto = new BigDecimal(1.000);
		return compra.getCarro().getPreco().subtract(desconto);
	}

}
