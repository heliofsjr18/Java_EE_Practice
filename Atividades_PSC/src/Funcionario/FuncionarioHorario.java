package Funcionario;

public class FuncionarioHorario extends Funcionario{

	private Double qtd_horas;
	private Double valor_horas;
		
	public Double getQtd_horas() {
		return qtd_horas;
	}
	public void setQtd_horas(Double qtd_horas) {
		this.qtd_horas = qtd_horas;
	}
	public Double getValor_horas() {
		return valor_horas;
	}
	public void setValor_horas(Double valor_horas) {
		this.valor_horas = valor_horas;
	}
	

	
	@Override
	public Double obterSalario() {
		return this.getValor_horas() * this.getQtd_horas();
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
			+ this.obterSalario() + " (FH) ";
	}		
}
