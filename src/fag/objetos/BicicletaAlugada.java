package fag.objetos;

public class BicicletaAlugada {
     private int hora;
     private double valorHora;
     
     public BicicletaAlugada() {}
     
	 public BicicletaAlugada(int hora, double valorHora) {
		this.hora = hora;
		this.valorHora = valorHora;
	}
	 public int getHora() {
		 return hora;
	 }
	 public void setHora(int hora) {
		 if (hora >= 1) {
			 this.hora = hora;
		 }
		
	 }
	 public double getValorHora() {
		 return valorHora;
	 }
	 public void setValorHora(double valorHora) {
		 if(valorHora > 0) {
			 this.valorHora = valorHora;
		 }
		 
	 }
	 public double calcularValor() {
		 return valorHora * hora;
	 }
     
}
