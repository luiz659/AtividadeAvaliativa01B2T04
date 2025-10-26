package fag.objetos;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria() {}
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		if (titular != null && !titular.isBlank()) {
		this.titular = titular;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			this.saldo = valor;
		}
		 else {
			System.out.println("Invalido");	
	   }
	}  
	
	public void sacar(double valor) {
		if (valor > 0 && saldo - valor > 0) {
			saldo -= valor;
			System.out.println("Saldo não pode ficar negativo");
		}
		else {			
			this.saldo = valor;
		}
	}
	
	 
}

