package fag.objetos;

public class ProdutoEstoque {
     private String nome;
     private int quantidade;
     
     public ProdutoEstoque() {}
     
	 public ProdutoEstoque(String nome, int quantidade) {
	
		this.nome = nome;
		this.quantidade = quantidade;
	}
	 public String getNome() {
		 return nome;
	 }
	 public void setNome(String nome) {
		 if (nome != null && !nome.isBlank()) {
			 this.nome = nome;
		 }
	 }
	 public int getQuantidade() {
		 return quantidade;
	 }
	 public void setQuantidade(int quantidade) {
		 if(quantidade >= 0) {
			 this.quantidade = quantidade;
		 }
		 
	 }
	 public int adicionarEstoque(int qtd) {
		  if(qtd > 0) {
			 quantidade += qtd;
			 System.out.println( qtd + "produto adicionado");
		 }
		 return quantidade;
	 }
	 
	 public int removerEstoque(int qtd) {
	        if (qtd > 0) {
	            if (qtd <= quantidade) {
	                quantidade -= qtd;
	                System.out.println(qtd + " unidades removidas do estoque.");
	            }
	        }
	        return quantidade;
	 }
	        
     
     
     
}
