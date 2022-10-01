package FilaEncadeadaEstruturaDeDados;

public interface TADFila<T> {
	
	/**
	 *  Operações principais
	 */
	
	public void inserirFinal(T valor);
	public T removerInicio();
	
	/**
	 * Operações secundarias
	 */
	
	public boolean filaVazia();
	public void imprimeFila();
}