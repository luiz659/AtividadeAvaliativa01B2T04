package fag.objetos;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
		
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario >= 0) {
			this.salario = salario;
		}
		
	}
	
	public double aumentarSalario(double percentual) {
		if(percentual >= 0 && percentual <= 100) {
		 double aumento = salario * (percentual/100);
		  salario += aumento;
		}
		return salario;
			
		
}
}


