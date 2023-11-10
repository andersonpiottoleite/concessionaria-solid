package br.com.cafetecnico.solid.abertofechado.solucao;

import java.math.BigDecimal;

import br.com.cafetecnico.solid.modelo.Compra;
import br.com.cafetecnico.solid.modelo.TipoPagamento;

public class PagamentoCarroAPrazo implements PagamentoCarroCalculavel {

	@Override
	public BigDecimal calculaValor(Compra compra) {
		BigDecimal acrescimo = new BigDecimal(5.000);
		return compra.getCarro().getPreco().add(acrescimo);
	}

}
