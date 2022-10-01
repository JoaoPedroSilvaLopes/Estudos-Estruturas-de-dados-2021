package FilaEncadeadaEstruturaDeDados;

public interface TADFila<T> {
	
	/**
	 *  Opera��es principais
	 */
	
	public void inserirFinal(T valor);
	public T removerInicio();
	
	/**
	 * Opera��es secundarias
	 */
	
	public boolean filaVazia();
	public void imprimeFila();
}