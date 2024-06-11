package aula_interface;

public class TesteFunc {
	public static void main(String args[]) {
		Funcionario gerente = new Gerente("12345", "Gerente", "Fulano", "222123-45");
		Funcionario diretor = new Diretor("67890", "Diretor", "Cicrano", "12345678-90");
		
		System.out.println(gerente.toString());
		System.out.println(diretor.toString());
	}
}
