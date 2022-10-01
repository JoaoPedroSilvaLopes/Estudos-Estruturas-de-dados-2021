package PilhaEstruturaDeDados;


public class Pilha implements TAD {

	private Integer[] pilha; // vetor de posicoes da pilha
	private int posicaoPilha; // posicao da pilha
	
	public Pilha(int tamanho) {
		pilha = new Integer[tamanho];
		posicaoPilha = -1;
	}
	
	@Override
	public void adicionar(Integer Valor) {
		if (cheio()) {
			System.out.println("Não é possivel adicionar mais nenhum elemento, pois a pilha esta cheia...");
			return;
		}
		for (int i = posicaoPilha; i >= 0; i--) {
			pilha[i + 1] = pilha[i];
		}
		pilha[0] = Valor;
		posicaoPilha++;
		imprimir();
	}

	@Override
	public void remover() {
		if (vazio()) {
			System.out.println("Não é possivel remover mais nenhum elemento, pois a pilha esta vazia...");
			return;
		}
		for (int i = 0; i < posicaoPilha; i++) {
			pilha[i] = pilha[i + 1];
		}
		pilha[posicaoPilha--] = null;
		imprimir();
	}

	@Override
	public boolean cheio() {
		if (posicaoPilha == pilha.length - 1) {
			return true;		
		}
		return false;
	}

	@Override
	public boolean vazio() {
		if (posicaoPilha == -1) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimir() {
		if (vazio()) {
			System.out.println("Pilha esta vazia.");
		}
		for (int i = 0; i <= posicaoPilha; i++) {
			System.out.print(pilha[i] + "\t");
		}
		System.out.println();	
	}

}