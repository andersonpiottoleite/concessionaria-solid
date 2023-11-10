package br.com.cafetecnico.polimorfismo;

public class Funcionario extends Pessoa implements Autenticavel{

	private String user;
	private String senha;

	@Override
	public boolean realizaLogin(String user, String senha) {
		this.user = user;
		this.senha = senha;
		// logica para autenticar
		return false;
	}

}
