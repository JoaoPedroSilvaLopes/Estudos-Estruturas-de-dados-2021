package FilaDuplamenteEncadeada;

public class TesteFilaDuplamenteEncadeada {

	public static void main(String[] args) {
		
		TADFilaDuplamenteEncadeada<String> fila = new FilaDuplamenteEncadeada<String>();
		
		fila.imprimeFila();
		
		fila.inserirFinal("a");
		fila.imprimeFila();
		
		fila.inserirFinal("b");
		fila.imprimeFila();
		
		fila.inserirFinal("c");
		fila.imprimeFila();
		
		fila.removerInicio();
		fila.imprimeFila();
		
		fila.inserirFinal("d");
		fila.imprimeFila();
		
		fila.removerInicio();
		fila.imprimeFila();
		
		fila.removerInicio();
		fila.imprimeFila();
		
		fila.removerInicio();
		fila.imprimeFila();
	}
}