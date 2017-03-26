package FormaGeometrica;

public class TesteFormaGeometrica {

	Quadrado q1 = new Quadrado();
	Quadrado q2 = new Quadrado(8);

	Retangulo r1 = new Retangulo();
	Retangulo r2 = new Retangulo(4, 9);
	Retangulo r3 = new Retangulo(3);

	ColecaoFormas formasPSC = new ColecaoFormas();

	public void testaColecao() {

		Double totalArea = new Double(0.00);
		Integer quadrado = new Integer(0);
		try {
			formasPSC.adicionarForma(q1);
			formasPSC.adicionarForma(q2);
			formasPSC.adicionarForma(r1);
			formasPSC.adicionarForma(r2);
			formasPSC.adicionarForma(r3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		//Begin Descobrindo e imprimindo Areas e Perimetros de todasas formas
		for (int index = 0; index < formasPSC.formas.size(); index++) {

			totalArea = +formasPSC.formas.get(index).calcularArea();
			System.out.println("Perimetro " + index + " : " + formasPSC.formas.get(index).calcularPerimetro());

		}
		//End Descobrindo e imprimindo Areas e Perimetros de todasas formas

		
		
		//Begin Descobrindo e contando todos os quadrados
		for (FormaGeometrica forma : formasPSC.formas) {
			if (forma.getClass().equals(new Retangulo())) {

				Retangulo rect = (Retangulo) forma;
				
				
				//Begin Imprimindo Altura e Comprimento de cada Retangulo
				System.out.println("Altura do retangulo :" +rect.getAltura());
				System.out.println("Comprimento do retangulo :" +rect.getComprimento());				
				//End Imprimindo Altura e Comprimento de cada Retangulo

				if (rect.ehQuadrado())
					quadrado = +1;

			}

			if (forma.getClass().equals(new Quadrado()))
				quadrado = +1;

		}
		//End Descobrindo e contando todos os quadrados
		
		

		System.out.println("O total das áreas das formas é:  " + totalArea.toString());
		System.out.println("O total de quadrado é: :  " + quadrado);

	}

}
