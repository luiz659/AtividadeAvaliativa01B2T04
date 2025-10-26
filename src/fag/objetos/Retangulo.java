package fag.objetos;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public Retangulo() {}
	
	public Retangulo(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		if(largura > 0) {
			this.largura = largura;

		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}
	
	public double Area(double largura, double altura){
		return largura * altura;
		
	}
	public double Perimetro(double largura, double altura) {
		return 2 * (altura + largura);
	}

}
