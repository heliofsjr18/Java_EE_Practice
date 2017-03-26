package FormaGeometrica;

public class Retangulo extends FormaGeometrica {

	private Integer comprimento;
	private Integer altura;

	public Retangulo() {
		this.comprimento = 5;
		this.altura = 5;
	}

	public Retangulo(Integer valor) {
		this.comprimento = valor;
		this.altura = valor;
	}

	public Retangulo(Integer comprimento, Integer altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getComprimento() {
		return comprimento;
	}

	public void setComprimento(Integer comprimento) {
		this.comprimento = comprimento;
	}

	@Override
	public Double calcularArea() {
		return (this.comprimento * this.altura) * 1.00;
	}

	@Override
	public Double calcularPerimetro() {
		return ((this.comprimento + this.altura) * 2) * 1.00;
	}

	public Boolean ehQuadrado() {

		if (this.comprimento == this.altura)
			return true;

		return false;
	}

		
	public Boolean equals(Integer comprimento, Integer altura) {

		if ((this.comprimento == comprimento) && (this.altura == altura))
			return true;

		return false;

	}

}
