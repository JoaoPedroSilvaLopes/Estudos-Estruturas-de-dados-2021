package ListaEncadeada;

public interface TADListaEncadeada<T> {
	
	public void insereInicio(T valor);
	public void inserePosicao(T valor, int posicao);
	public void insereFinal(T valor);
	
	public T removePosicao(int posicao);
	
	public boolean listaVazia();
	public void imprimeLista();	
}