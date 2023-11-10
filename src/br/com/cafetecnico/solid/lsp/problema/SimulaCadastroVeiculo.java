package br.com.cafetecnico.solid.lsp.problema;

import java.math.BigDecimal;

public class SimulaCadastroVeiculo {
	
	public static void main(String[] args) {
		int vinteEDoisAcentos = 22;
		int duasPortas = 2;

		int umAcento = 1;
		
		VeiculoTripulavel veiculoTripulavel1 = new MicroOnibus(1L, "VOLVO", "ITAPEMIRIM", 2010, new BigDecimal(300.000), duasPortas, vinteEDoisAcentos);
		VeiculoTripulavel veiculoTripulavel2 = new MicroOnibus(2L, "MARCOPOLO", "COMETA", 2015, new BigDecimal(270.000), duasPortas, vinteEDoisAcentos);
		
		VeiculoTripulavel veiculoTripulavel3 = new Moto(2L, "HONDA", "BIZ", 2015, new BigDecimal(7.000), umAcento);
		
		System.out.println(veiculoTripulavel1.getQuantidadePortas());
		System.out.println(veiculoTripulavel2.getQuantidadePortas());
		System.out.println(veiculoTripulavel3.getQuantidadePortas());
	}

}
