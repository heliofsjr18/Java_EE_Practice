package FormaGeometrica;

public class Quadrado extends Retangulo{

	public Quadrado(){
		this.setComprimento(5);
		this.setAltura(5);
	}
	
	public Quadrado(Integer valor){
		this.setComprimento(valor);
		this.setAltura(valor);
	}
	
	public void aumentarQuadrado(Integer lado){
		this.setComprimento(lado);
		this.setAltura(lado);
	}
	
}