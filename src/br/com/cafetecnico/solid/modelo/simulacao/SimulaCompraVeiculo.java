package br.com.cafetecnico.solid.modelo.simulacao;

import java.math.BigDecimal;

import br.com.cafetecnico.solid.modelo.Carro;
import br.com.cafetecnico.solid.modelo.Cliente;
import br.com.cafetecnico.solid.modelo.Compra;
import br.com.cafetecnico.solid.responsabilidadeunica.solucao.CompraDAO;
import br.com.cafetecnico.solid.responsabilidadeunica.solucao.EmailService;

public class SimulaCompraVeiculo {
	
	public static void main(String[] args) {
		Carro fusca = new Carro(1L, "WOLKS", "FUSCA", 1970, new BigDecimal(3.000));
		Carro palio = new Carro(2L, "FIAT", "PALIO", 2015, new BigDecimal(15.000));
		Carro camaro = new Carro(3L, "CAMARO", "CHEVROLET", 2023, new BigDecimal(350.000));
		
		Cliente lucas = new Cliente(1L, "Lucas Monstro", "2345678908-11", "lucas@qintess.com");
		
		Compra compra = new Compra(1L, lucas, camaro);
		
		CompraDAO compraDAO = new CompraDAO();
		compraDAO.salvar(compra);
		
		EmailService emailService = new EmailService();
		emailService.mandarEmail(lucas);
	}
}
