package FilaDuplamenteEncadeada;

public class No<T> {

	private T valor;
	private No<T> proximo;
	private No<T> anterior;
	
	public No(T valor, No<T> anterior, No<T> proximo) {
		this.valor = valor;
		this.proximo = proximo;
		this.anterior = anterior;
	}
	
	public T getValor() {
		return valor;
	}
	
	public No<T> getProximo() {
		return proximo;
	}
	
	public No<T> getAnterior() {
		return anterior;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	public void setAnterior(No<T> anterior) {
		this.anterior = anterior;
	}
}
