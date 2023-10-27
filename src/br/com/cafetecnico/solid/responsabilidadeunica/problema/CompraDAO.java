package br.com.cafetecnico.solid.responsabilidadeunica.problema;

import java.util.ArrayList;
import java.util.List;

import br.com.cafetecnico.solid.modelo.Cliente;
import br.com.cafetecnico.solid.modelo.Compra;

// DAO - Data Access Object - Objeto de acesso a Dados.
public class CompraDAO {
	
	private static List<Compra> bancoFake = new ArrayList<Compra>();
	
	public void salvar(Compra compra) {
		System.out.println("Salvando compra " + compra.getId());
		bancoFake.add(compra);
		System.out.println("Compra " + compra.getId() + " salva com sucesso!");
	}
	
	public Compra buscarPorId(Long idCompra) {
		for (Compra compra : bancoFake) {
			if (idCompra.equals(compra.getId())) {
				return compra;
			}
		}
		return null;
	}
	
	public void alterar(Compra compra) {
		for (Compra compraParaAlterar : bancoFake) {
			if (compraParaAlterar.getId().equals(compra.getId())) {
				compraParaAlterar.setCarro(compra.getCarro());
				compraParaAlterar.setCliente(compra.getCliente());
				break;
			}
		}
	}
	
	public void remover(Compra compra) {
		bancoFake.remove(compra);
	}
	
	public void mandarEmail(Cliente cliente) {
		System.out.println("Enviando email para ".concat(cliente.getEmail()));
	}
	
}
