package ÁrvoreBinária;

public class ArvoreBinaria<T> {
	
	private No<T> noRaiz;
	
	public ArvoreBinaria() {
		noRaiz = null;
	}
	
	/**
	 * Operações principais
	 */
	
	public No<T> inserirNoRaiz(T valorDoNo) {
		
		if (noRaiz != null) {
			System.out.println("No raiz já existe. Elemento não inserido");
			return null;
		}
		
		noRaiz = new No<T>(valorDoNo, null, null, null);
		return noRaiz;
		
	}
	
	public No<T> inserirNoEsquerda(T valorNo, No<T> noBase) {
		
		if (noBase == null) {
			System.out.println("Nó de referencia não existe. Elemento não inserido");
			return null;
		}
		
		if (noBase.getFilhoDaEsquerda() != null) {
			System.out.println("Nó da esquerda já existe. Elemento não inserido");
			return null;
		}
		
		No<T> novoNo = new No<T>(valorNo, noBase, null, null);
		noBase.setFilhoDaEsquerda(novoNo);
		
		return novoNo;
	}
	
	public No<T> inserirNoDireita(T valorNo, No<T> noBase) {
		
		if (noBase == null) {
			System.out.println("Nó de referencia não existe. Elemento não inserido");
			return null;
		}
		
		if (noBase.getFilhoDaDireita() != null) {
			System.out.println("Nó da esquerda já existe. Elemento não inserido");
			return null;
		}
		
		No<T> novoNo = new No<T>(valorNo, noBase, null, null);
		noBase.setFilhoDaDireita(novoNo);
		
		return novoNo;
	}
	
	public void imprimirPreFixado(No<T> noBase) {
		if (noBase != null) {
			System.out.print(noBase.getValorDoNo() + "\t");
			imprimirPreFixado(noBase.getFilhoDaEsquerda());
			imprimirPreFixado(noBase.getFilhoDaDireita());
		}
	}
	
	public void imprimirInterFixado(No<T> noBase) {
		if (noBase != null) {
			imprimirInterFixado(noBase.getFilhoDaEsquerda());
			System.out.print(noBase.getValorDoNo() + "\t");
			imprimirInterFixado(noBase.getFilhoDaDireita());
		}
	}
	
	public void imprimirPosFixado(No<T> noBase) {
		if (noBase != null) {
			imprimirPosFixado(noBase.getFilhoDaEsquerda());
			imprimirPosFixado(noBase.getFilhoDaDireita());
			System.out.print(noBase.getValorDoNo() + "\t");
		}
	}

	public No<T> getNoRaiz() {
		return noRaiz;
	}

	public void setNoRaiz(No<T> noRaiz) {
		this.noRaiz = noRaiz;
	}
	
}
