package fag;

import fag.objetos.BicicletaAlugada;
import fag.objetos.ContaBancaria;
import fag.objetos.ContaLuz;
import fag.objetos.Funcionario;
import fag.objetos.Musica;
import fag.objetos.PessoasIMC;
import fag.objetos.ProdutoEstoque;
import fag.objetos.Retangulo;
import fag.objetos.Temperatura;
import fag.objetos.filme.Filme;



public class Principal {

	public static void main(String[] args) {                                    
		// atividadeUm();
		// atividadeDois();
		//atividadeTres();
		// atividadeQuatro();
		// atividadeCinco();
		  // atividadeSeis();
		   // atividadeSete();
		   // atividadeOito();
		   //atividadeNove();
		   atividadeDez();
		   
	}
      public static void atividadeUm() {
   	   ContaBancaria contB = new ContaBancaria("joao",5000);
   	  
   	 contB.setTitular("joão");
   	 contB.depositar(1000);
   	 contB.sacar(200);
   	 System.out.printf("Saldo final: %.2f", contB.getSaldo());
      }
      
      public static void atividadeDois() {
    	  Filme filme = new Filme("Vigadores",5);
    	  
    	  filme.getTitulo();
    	  filme.getAvaliacao();
    	  System.out.printf("Filme: <%s> | Avaliação: <%.2f>", filme.getTitulo(), filme.getAvaliacao());
      }
      public static void atividadeTres() {
    	  Funcionario funcio = new Funcionario ("jorge", 2600);
    	  
    	  funcio.getNome();
    	  funcio.getSalario();
    	  funcio.aumentarSalario(0);
    	  System.out.printf("Nome: <%s> || Salario Antes: <%.2f> || Salario com aumento: <%.2f>", funcio.getNome(), funcio.getSalario(),funcio.aumentarSalario(100));  
      }
      public static void atividadeQuatro() {
    	  Retangulo retan = new Retangulo();
    	  
    	  retan.getAltura();
    	  retan.getLargura();
    	  retan.Area(0,0);
    	  retan.Perimetro(0,0);
    	  System.out.printf("<Tringulo>  Area: %.0f || Perimetro: %.0f", retan.Area(15,20),retan.Perimetro(15,20) );
      }
      
      public static void atividadeCinco(){
    	  Musica music = new Musica("Poesia", 156);
    	  
    	  music.getTitulo();
    	  music.getDuracaoSegundos();
    	  music.formatarDuracao();
    	  System.out.printf("Musica: <%s> || Duracao Segundos: <%d> || Duracao Formatada: <%s>", music.getTitulo(), music.getDuracaoSegundos(), music.formatarDuracao());
    	  
      }
      public static void atividadeSeis() {
    	  PessoasIMC pessoas = new PessoasIMC("José",1.63, 103);
    	  
    	  pessoas.getNome();
    	  pessoas.calcularIMC(1.75 , 85 );
    	  pessoas.classificacaoIMC();
    	  System.out.printf("Nome: %s || Calculo IMC: %.2f || Classificação: %s", pessoas.getNome(), pessoas.calcularIMC(1.75, 85), pessoas.classificacaoIMC() );
    	  
    	  
      }
      public static void atividadeSete() {
    	  ContaLuz conta = new ContaLuz();
    	  
    	  conta.getConsumoKwh();
    	  conta.getValorKwh();
    	  conta.calcularValorTotal(200,0.63);
    	  System.out.printf(" Valor a ser pago:R$%.2f", conta.calcularValorTotal(200,0.63));
      }
      public static void atividadeOito() {
    	  BicicletaAlugada bici = new BicicletaAlugada(4,5.80);
    	  
    	  bici.getHora();
    	  bici.getValorHora();
    	  bici.calcularValor();
	  System.out.printf("Valor da Hora: %.2f || Horas: %d || Calculo total: %.2f ", bici.getValorHora(), bici.getHora(), bici.calcularValor());
    	  
    	  
      }
      public static void atividadeNove() {
    	  ProdutoEstoque prod = new ProdutoEstoque("Laranja", 0);
    	 
    	  prod.getNome();
    	  prod.getQuantidade();
    	  prod.adicionarEstoque(0);
    	  prod.removerEstoque(0);
  
    	  System.out.printf("Produto: %s  ||  Quantidade: %d  ||   Adicionado : %d || Removido: %d || Qnt final: %d ", prod.getNome(), prod.getQuantidade(), prod.adicionarEstoque(5), prod.removerEstoque(3), prod.getQuantidade());
}
      public static void atividadeDez() {
    	  Temperatura temp = new Temperatura(25);
    	  temp.getCelsius();
    	  temp.paraFahrenheit();
    	  temp.paraKelvin();
    	  
    	  System.out.printf( "Temperatura: Celsius: %.2f°C | Fahrenheit: %.2f°F |Kelvin: %.2fK%n",temp.getCelsius(),temp.paraFahrenheit(),temp.paraKelvin());
          
      }
}
