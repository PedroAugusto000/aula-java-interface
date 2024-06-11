package aula_interface;

public class Gerente extends Funcionario implements Autenticavel{
	protected String senha;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean autentica(String senhaDigitada) {
		return this.getSenha().equals(senhaDigitada);
	}
	
	public String toString() {
		return String.format("=====GERENTE=====\n"
				+ "%s"
				+ "Senha:%s\n", super.toString(), this.getSenha());
	}
}


