package aula_interface;

public class Funcionario {
	protected String primeiroNome;
	protected String ultimoNome;
	protected String cpf;
	
	public Funcionario(String primeiroNome, String ultimoNome, String cpf) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.cpf = cpf;	
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
	    return String.format("Nome:%s %s\n"
	            + "CPF:%s\n", this.primeiroNome, this.ultimoNome, this.cpf);
	}

}
