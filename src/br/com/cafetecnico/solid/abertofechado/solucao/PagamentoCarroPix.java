package br.com.cafetecnico.solid.abertofechado.solucao;

import java.math.BigDecimal;

import br.com.cafetecnico.solid.modelo.Compra;

public class PagamentoCarroPix implements PagamentoCarroCalculavel{

	@Override
	public BigDecimal calculaValor(Compra compra) {
		BigDecimal descontoPix = new BigDecimal(2.000);
		return compra.getCarro().getPreco().subtract(descontoPix);
	}

}
