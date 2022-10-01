package FilaEncadeadaEstruturaDeDados;

public class TesteFilaEncadeada {
	
	public static void main(String[] args) {
		
		TADFila<Integer> fila = new FilaEncadeada<Integer>();
		
		fila.imprimeFila();
		fila.removerInicio();
		
		fila.inserirFinal(12);
		fila.imprimeFila();
		fila.inserirFinal(14);
		fila.imprimeFila();
		fila.inserirFinal(16);
		fila.imprimeFila();
		fila.inserirFinal(18);
		fila.imprimeFila();
		fila.inserirFinal(20);
		fila.imprimeFila();
		
		fila.removerInicio();
		fila.imprimeFila();
		fila.removerInicio();
		fila.imprimeFila();
		fila.removerInicio();
		fila.imprimeFila();
		fila.removerInicio();
		fila.imprimeFila();
		fila.removerInicio();
		fila.imprimeFila();
		
		fila.removerInicio();
		fila.imprimeFila();
	}
}