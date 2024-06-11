package aula_interface;
import java.util.Scanner;

public class Diretor extends Funcionario implements Autenticavel{
	private String senhaDiretor;

	public Diretor(String primeiroNome, String ultimoNome, String cpf, String senhaDiretor) {
		super(primeiroNome, ultimoNome, cpf);
		this.senhaDiretor = senhaDiretor;
	}
	public void setSenhaDiretor(String senhaDiretor) {
		while(senhaDiretor.length() < 8) {
			System.out.println("Senha possui menos de 8 digitos, digite novamente, "
					+ "digite novamente:");
			senhaDiretor = input.next();
		}
		this.senhaDiretor = senhaDiretor;
	}
	
	public String getSenhaDiretor() {
		return senhaDiretor;
	}
	
	public boolean autentica(String senha) {
		return this.getSenhaDiretor().equals(senha);
	}
	
	public String toString() {
		return String.format("====DIRETOR====\n"
				+"%s"
				+"Senha:%s\n", super.toString(), this.getSenhaDiretor());
	}
}
