package br.com.cafetecnico.solid.modelo;

public class Compra {
	
	private Long id;
	
	private Cliente cliente;
	
	private Carro carro;

	public Compra(Long id, Cliente cliente, Carro carro) {
		this.cliente = cliente;
		this.carro = carro;
		this.setId(id);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
