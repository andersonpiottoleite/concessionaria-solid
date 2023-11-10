package br.com.cafetecnico.solid.abertofechado.problema;

import java.math.BigDecimal;

import br.com.cafetecnico.solid.modelo.Compra;
import br.com.cafetecnico.solid.modelo.TipoPagamento;

public class CalculadoraValorCompra {
	
	public BigDecimal calculaValor(Compra compra, TipoPagamento tipoPagamento) {
		if (tipoPagamento == null) {
			throw new IllegalArgumentException("Informe o tipo de pagamento");
		}
		
		if (TipoPagamento.A_VISTA.equals(tipoPagamento)) {
			BigDecimal desconto = new BigDecimal(1.000);
			return compra.getCarro().getPreco().subtract(desconto);
			
		}else if (TipoPagamento.A_PRAZO.equals(tipoPagamento)) {
			BigDecimal acrescimo = new BigDecimal(5.000);
			return compra.getCarro().getPreco().add(acrescimo);
			
		}else if (TipoPagamento.PIX.equals(tipoPagamento)) {
			BigDecimal descontoPix = new BigDecimal(2.000);
			return compra.getCarro().getPreco().subtract(descontoPix);
		}
		
		return compra.getCarro().getPreco();
	}

}
