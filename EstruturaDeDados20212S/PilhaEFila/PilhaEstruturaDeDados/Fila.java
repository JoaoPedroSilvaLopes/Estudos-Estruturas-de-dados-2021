package PilhaEstruturaDeDados;

public class Fila implements TAD {
	
	private Integer[] fila;
	private int posicaoFila;
	
	public Fila(int tamanho) {
		fila = new Integer[tamanho];
		posicaoFila = -1;
	}

	@Override
	public void adicionar(Integer Valor) {
		if (cheio()) {
			System.out.println("Não é possivel adicionar mais nenhum elemento, pois a fila esta cheia...");
			return;
		}
		fila[++posicaoFila] = Valor;
		imprimir();
	}

	@Override
	public void remover() {
		if (vazio()) {
			System.out.println("Não é possivel remover mais nenhum elemento, pois a fila esta vazia...");
			return;
		}
		for (int i = 0; i < posicaoFila; i++) {
			fila[i] = fila[i + 1];
		}
		fila[posicaoFila--] = null;
		imprimir();
	}

	@Override
	public boolean cheio() {
		if (posicaoFila == fila.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean vazio() {
		if (posicaoFila == -1) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimir() {
		if (vazio()) {
			System.out.println("Pilha esta vazia.");
			return;
		}
		for (int i = 0; i <= posicaoFila; i++) {
			System.out.print(fila[i] + "\t");
		}
		System.out.println();	
	}

}
