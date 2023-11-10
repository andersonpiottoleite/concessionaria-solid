package br.com.cafetecnico.solid.abertofechado.solucao;

import java.math.BigDecimal;

import br.com.cafetecnico.solid.modelo.Compra;

public interface PagamentoCarroCalculavel {
	
	BigDecimal calculaValor(Compra compra);

}
