package Funcionario;

public class Funcionario {

	private String cpf;
	private String nome;
	private String idade;
	private Double salario;
	
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
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	
	public Double obterSalario() {
		return salario;
	}
	
	
	public boolean equals(Funcionario f) {		
		return f.getCpf().equals(this.getCpf());
	}
	
	
	public String toString(){
		return this.getCpf() + "  ---  " 
			+ this.getNome() 
			+ ", " 
			+ this.getIdade() 
			+ " : " 
			+ this.obterSalario() + " (F) ";
	}
}
