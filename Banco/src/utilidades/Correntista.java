package utilidades;

public class Correntista {
	private String cpf, nome;
	
	public Correntista (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String toString () {
		return "CPF: "+cpf+" Nome: "+nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
