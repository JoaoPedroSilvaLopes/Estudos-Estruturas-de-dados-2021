package ListaEncadeada;

public class testeListaEncadeada {

	public static void main(String[] args) {
		
		TADListaEncadeada<Integer> ListaEncadeada = new listaEncadeada<Integer>();
		
		ListaEncadeada.imprimeLista();
		
		ListaEncadeada.insereInicio(20);
		ListaEncadeada.imprimeLista();
		
		ListaEncadeada.insereFinal(10);
		ListaEncadeada.imprimeLista();
		
		ListaEncadeada.inserePosicao(12, 2);
		ListaEncadeada.imprimeLista();
		
		ListaEncadeada.inserePosicao(14, 1);
		ListaEncadeada.imprimeLista();
		
		ListaEncadeada.inserePosicao(18, 3);
		ListaEncadeada.imprimeLista();
		
		ListaEncadeada.inserePosicao(16, 3);
		ListaEncadeada.imprimeLista();
		
		ListaEncadeada.inserePosicao(22, 6);
		ListaEncadeada.imprimeLista();
		
		ListaEncadeada.imprimeLista();
		
	}
	
}
