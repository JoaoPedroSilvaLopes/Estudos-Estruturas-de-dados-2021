package ListaEstruturaDeDados;

public class Lista<T> implements TADLista<T> {

	private T[] lista;
	private int posicaoLista;
	
	public Lista(int tamanho) {
		lista = (T[]) new Object[tamanho];
		posicaoLista = -1;
	}
	
	@Override
	public void inserir(T Valor, int indice) {
		if (ListaCheia()) {
			System.out.println("Não é possivel adicionar mais nenhum elemento, pois a lista esta cheia...");
			return;
		}
		if (indice < 0 || indice > posicaoLista + 1) {
			System.out.println("Indice inválido");
			return;
		}

	}

	@Override
	public void remover(int indice) {
		if (ListaVazia()) {
			System.out.println("Não é possivel remover mais nenhum elemento, pois a lista esta vazia...");
			return;
		}
		if (indice < 0 || indice > posicaoLista) {
			System.out.println("Indice inválido");
			return;
		}

	}

	@Override
	public boolean ListaCheia() {
		
		return false;
	}

	@Override
	public boolean ListaVazia() {
		
		return false;
	}

	@Override
	public void imprimir() {
		if (ListaVazia()) {
			System.out.println("Lista esta vazia.");
			return;
		}
		for (int i = 0; i <= posicaoLista; i++) {
			System.out.print(lista[i] + "\t");
		}
		System.out.println();
	}

}
