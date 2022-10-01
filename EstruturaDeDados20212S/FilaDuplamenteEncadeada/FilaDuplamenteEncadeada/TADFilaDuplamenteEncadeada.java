package FilaDuplamenteEncadeada;

public interface TADFilaDuplamenteEncadeada<T> {
	
	public void inserirFinal(T valor);
	public T removerInicio();

	public boolean filaVazia();
	public void imprimeFila();
}