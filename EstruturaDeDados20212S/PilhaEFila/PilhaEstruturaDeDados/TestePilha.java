package PilhaEstruturaDeDados;

public class TestePilha {	
	
	public static void main(String[] args) {
		
		TAD pilha = new Pilha(5);
				
		pilha.adicionar(5);
		pilha.adicionar(3);
		pilha.remover();	
		pilha.adicionar(2);
		pilha.adicionar(8);
		pilha.remover();	
		pilha.remover();	
		pilha.adicionar(9);
		pilha.adicionar(1);
		pilha.remover();			
		pilha.adicionar(7);		
		pilha.adicionar(6);		
		pilha.remover();			
		pilha.remover();			
		pilha.adicionar(4);		
		pilha.remover();	
		pilha.remover();	
	}
}