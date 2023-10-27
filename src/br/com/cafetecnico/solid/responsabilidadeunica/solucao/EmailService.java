package br.com.cafetecnico.solid.responsabilidadeunica.solucao;

import br.com.cafetecnico.solid.modelo.Cliente;

public class EmailService {
	
	public void mandarEmail(Cliente cliente) {
		System.out.println("Enviando email para ".concat(cliente.getEmail()));
	}
}
