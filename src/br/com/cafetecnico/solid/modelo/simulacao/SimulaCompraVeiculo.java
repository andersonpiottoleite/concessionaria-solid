package br.com.cafetecnico.solid.modelo.simulacao;

import java.math.BigDecimal;

//import br.com.cafetecnico.solid.abertofechado.problema.CalculadoraValorCompra;
import br.com.cafetecnico.solid.abertofechado.solucao.CalculadoraValorCompra;
import br.com.cafetecnico.solid.abertofechado.solucao.PagamentoCarroAPrazo;
import br.com.cafetecnico.solid.abertofechado.solucao.PagamentoCarroAVista;
import br.com.cafetecnico.solid.abertofechado.solucao.PagamentoCarroPix;
import br.com.cafetecnico.solid.lsp.problema.Moto;
import br.com.cafetecnico.solid.lsp.problema.VeiculoTripulavel;
import br.com.cafetecnico.solid.modelo.Carro;
import br.com.cafetecnico.solid.modelo.Cliente;
import br.com.cafetecnico.solid.modelo.Compra;
import br.com.cafetecnico.solid.modelo.TipoPagamento;
import br.com.cafetecnico.solid.responsabilidadeunica.solucao.CompraDAO;
import br.com.cafetecnico.solid.responsabilidadeunica.solucao.EmailService;

public class SimulaCompraVeiculo {
	
	public static void main(String[] args) {
		int quatroAcentos = 4;
		int quatroPortas = 4;
		int duasPortas = 2;
		
		Carro fusca = new Carro(1L, "WOLKS", "FUSCA", 1970, new BigDecimal(3.000), duasPortas, quatroAcentos);
		Carro palio = new Carro(2L, "FIAT", "PALIO", 2015, new BigDecimal(15.000), quatroPortas, quatroAcentos);
		Carro camaro = new Carro(3L, "CAMARO", "CHEVROLET", 2023, new BigDecimal(350.000), quatroPortas, quatroAcentos);
		
		Cliente lucas = new Cliente(1L, "Lucas Monstro", "2345678908-11", "lucas@qintess.com");
		
		Compra compra = new Compra(1L, lucas, camaro);
		
		CalculadoraValorCompra calculadoraValorCompra = new CalculadoraValorCompra();
		
		//BigDecimal valorCompra = calculadoraValorCompra.calculaValor(compra, TipoPagamento.PIX);
		BigDecimal valorCompra = calculadoraValorCompra.calculaValor(compra, new PagamentoCarroPix());
		
		System.out.println("Valor da compra: " + valorCompra);
		
		CompraDAO compraDAO = new CompraDAO();
		compraDAO.salvar(compra);
		
		EmailService emailService = new EmailService();
		emailService.mandarEmail(lucas);
	}
}
