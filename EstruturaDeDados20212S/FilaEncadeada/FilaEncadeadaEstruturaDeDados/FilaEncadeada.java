package FilaEncadeadaEstruturaDeDados;

public class FilaEncadeada<T> implements TADFila<T> {

	private No<T> noInicio;
	private int tamanho;

	@Override
	public void inserirFinal(T valor) {
		No<T> novoNo = new No<T>(valor, null);
		
		if (filaVazia()) {
			noInicio = novoNo;
		}
		else {
			No<T> auxiliar = noInicio;
			while (auxiliar.getProximo() != null) {
				auxiliar = auxiliar.getProximo();
			}
			auxiliar.setProximo(novoNo);
		}
		tamanho++;
	}

	@Override
	public T removerInicio() {
		
		if (filaVazia()) {
			System.out.println("Não é possível remover");
			return null;
		}
		
		No<T> noRemovido = noInicio;
		noInicio = noInicio.getProximo();
		noRemovido.setProximo(null);
		
		tamanho--;
		
		return noRemovido.getValor();
	}
	
	@Override
	public boolean filaVazia() {
		if (noInicio == null) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimeFila() {
		if (filaVazia()) {
			System.out.println("Fila esta vazia, não é possível fazer a impressão");
			return;
		}
		
		No<T> auxiliar = noInicio;
		while(auxiliar != null) {
			System.out.print(auxiliar.getValor()+" ");
			auxiliar = auxiliar.getProximo();
		}
		System.out.println("");
	}

}
