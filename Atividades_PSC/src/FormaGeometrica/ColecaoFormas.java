package FormaGeometrica;

import java.util.ArrayList;

public class ColecaoFormas {

	ArrayList<FormaGeometrica> formas;

	public ColecaoFormas() {
		this.formas = new ArrayList<FormaGeometrica>();
	}

	public void adicionarForma(FormaGeometrica forma) throws Exception {

		Double area = forma.calcularArea();

		if (area < 4.00) {
			throw new Exception("Área da forma geométrica abaixo do limite inferior");
		} else
			this.formas.add(forma);

	}

	public Double retornarAreaTotal() {

		Double somaArea = new Double(0.00);
		for (int index = 0; index < this.formas.size(); index++) {
			somaArea = +this.formas.get(index).calcularArea();
		}
		return somaArea;
	}

	public Double retornarPerimetroTotal() {

		Double somaPerimetro = new Double(0.00);
		for (int index = 0; index < this.formas.size(); index++) {
			somaPerimetro = +this.formas.get(index).calcularPerimetro();
		}
		return somaPerimetro;
	}

	public Integer obterQuantidadeQuadrados() {

		Integer qtdQuadrados = new Integer(0);

		for (int index = 0; index < this.formas.size(); index++) {

			if ((this.formas.get(index).getClass().equals(new Quadrado()))
				|| (this.formas.get(index).getClass().equals(new Retangulo()))) {
				if ((this.formas.get(index).getClass().equals(new Retangulo()))) {
					Retangulo r = (Retangulo) this.formas.get(index);
					if (r.ehQuadrado())
						qtdQuadrados = +1;
					else
						continue;
				}
				
				qtdQuadrados = +1;
			}			
		}
		
		return qtdQuadrados;
	}
	
	public Integer obterQuantidadeRetangulo() {
		
		Integer qtdRetangulo = new Integer(0);
		for (int index = 0; index < this.formas.size(); index++) {
			if ((this.formas.get(index).getClass().equals(new Retangulo()))) 
				qtdRetangulo =+ 1;
			
		}
		return qtdRetangulo;
	}

}
