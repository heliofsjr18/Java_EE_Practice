package ordenadorJunit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import ordenador.Ordenador;

import org.junit.Test;

public class TesteOrdenador {

	private ArrayList<Double> chamarMetodo() {
		ArrayList<Double> listaDouble = new ArrayList<Double>();
		listaDouble.add(new Double(30.0));
		listaDouble.add(new Double(40.0));
		listaDouble.add(new Double(20.0));
		listaDouble.add(new Double(25.0));
		listaDouble.add(new Double(22.0));
		return listaDouble;
	}

	@Test
	public void testeMaior() {
		Ordenador ordenador = new Ordenador();
		ordenador.inserirColecao(this.chamarMetodo());
	}
}
