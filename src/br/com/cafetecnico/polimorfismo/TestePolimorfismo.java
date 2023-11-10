package br.com.cafetecnico.polimorfismo;

public class TestePolimorfismo {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.getDocumento();
		
		Cliente c = new Cliente();
		c.getDocumento();
		
		// polimorfismo com Super Classes
		Pessoa pf1 = new Funcionario();
		pf1.getDocumento();
		
		Pessoa pc2 = new Cliente();
		pc2.getDocumento();
		
		// polimorfismo com interfaces
		Autenticavel a1 = new Funcionario();
		a1.realizaLogin("Jose", "abc123");
	}

}
