package Funcionario;

public class FuncionarioChefe extends Funcionario{

	private Double gratificacao;
	private Double valor_inicial;
	private Funcionario funcionarioAcessor;
	
	
	public Double getGratificacao() {
		return gratificacao;
	}
	public void setGratificacao(Double gratificacao) {
		this.gratificacao = gratificacao;
	}
	public Double getValor_inicial() {
		return valor_inicial;
	}
	public void setValor_inicial(Double valor_inicial) {
		this.valor_inicial = valor_inicial;
	}
	public Funcionario getFuncionarioAcessor() {
		return funcionarioAcessor;
	}
	public void setFuncionarioAcessor(Funcionario funcionarioAcessor) {
		this.funcionarioAcessor = funcionarioAcessor;
	}
	
	
	@Override
	public Double obterSalario() {
		return this.getValor_inicial() + this.getGratificacao();
	}
	
	
	@Override
	public boolean equals(Funcionario f){
		
		return f.getCpf().equals(this.getCpf());		
	}
	
	@Override
	public String toString(){
		return this.getCpf() + "  ---  " 
			+ this.getNome() 
			+ ", " 
			+ this.getIdade() 
			+ " : " 
			+ this.obterSalario() + " (FC) "
			+ " Acessor: "
			+ this.getFuncionarioAcessor().getNome();
	}		
}
