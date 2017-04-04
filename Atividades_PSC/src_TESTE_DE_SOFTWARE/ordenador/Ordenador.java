package ordenador;

import java.util.ArrayList;


public class Ordenador {

	ArrayList<Double> lista = new ArrayList<Double>();

	public void inserirColecao(ArrayList<Double> value) {

		this.lista = value;

	}

	public void informarValor(Double valor) {
		if (valor > this.getMaiorValor()) {
			this.lista.add(valor);
		}

	}

	public Double getMaiorValor() {

		Double maior = 0.0;

		for (int index = 0; index < this.lista.size(); index++) {

			if (maior < this.lista.get(index)) {
				maior = this.lista.get(index);
			}
		}

		return maior;

	}

}