package br.com.cafetecnico.solid.lsp.interfaces.segregada.solucao;

import java.math.BigDecimal;

import br.com.cafetecnico.solid.modelo.Carro;

public class SimulaCadastroVeiculo {
	
	public static void main(String[] args) {
		int vinteEDoisAcentos = 22;
		int duasPortas = 2;

		int umAcento = 1;
		
		VeiculoTripulavelFechado veiculoTripulavelFechado1 = new MicroOnibus(1L, "VOLVO", "ITAPEMIRIM", 2010, new BigDecimal(300.000), duasPortas, vinteEDoisAcentos);
		VeiculoTripulavelFechado veiculoTripulavelFechado2 = new MicroOnibus(2L, "MARCOPOLO", "COMETA", 2015, new BigDecimal(270.000), duasPortas, vinteEDoisAcentos);
		
		VeiculoTripulavelAberto veiculoTripulavelAberto1 = new Moto(2L, "HONDA", "BIZ", 2015, new BigDecimal(7.000), umAcento);
		
		System.out.println(veiculoTripulavelFechado1.getQuantidadePortas());
		System.out.println(veiculoTripulavelFechado2.getQuantidadePortas());
		//System.out.println(veiculoTripulavelAberto1.getQuantidadePortas());
	}

}
