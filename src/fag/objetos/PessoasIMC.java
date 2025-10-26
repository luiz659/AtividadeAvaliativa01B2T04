package fag.objetos;

public class PessoasIMC {
	private String nome;
	private double peso;
	private double altura;
	
	public PessoasIMC() {}
	
	public PessoasIMC(String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso > 0){
			this.peso = peso;
		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	public double calcularIMC(double altura, double peso) {
		return peso / (altura * altura);
	}
	 public String classificacaoIMC() {
	        double imc = calcularIMC(peso,altura);

	        if ( imc < 18.5) {
	            return "Abaixo do peso";
	        } else if (imc < 24.9) {
	            return "Normal";
	        } else if (imc < 29.9) {
	            return "Sobrepeso";
	        } else if (imc < 34.9) {
	            return "Obesidade grau I";
	        } else if (imc < 39.9) {
	            return "Obesidade grau II";
	        } else {
	            return "Obesidade grau III (mórbida)";
	        }
	    }
	
	
	
	
	

}
