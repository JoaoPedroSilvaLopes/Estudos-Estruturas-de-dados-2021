package ListaDuplamenteEncadeada;

public interface TADListaDuplamenteEncadeada<T> {
	
	public void insereValor(T valor, int posicao);
	public T removeValor(int posicao);
	public boolean listaVazia();
	public void imprimeLista();
}