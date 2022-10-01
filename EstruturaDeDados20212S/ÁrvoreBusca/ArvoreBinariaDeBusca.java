public class ArvoreBinariaDeBusca {
	
	private BTSNode noRaiz;
	
	public void inserirNo(Integer valorNo, BTSNode noBase) {
		
		if (noRaiz == null) {
			noRaiz = new BTSNode(valorNo, null, null, null);
			return;
		}
		
		if (valorNo > noBase.getValorNo()) {
			if (noBase.getFilhoDaDireita() == null) {
				BTSNode novoNo = new BTSNode(valorNo, noBase, null, null);
				noBase.setFilhoDaDireita(novoNo);
			}
			else {
				inserirNo(valorNo, noBase.getFilhoDaDireita());
			}
		}
		
		else if (valorNo < noBase.getValorNo()) {
			if (noBase.getFilhoDaEsquerda() == null) {
				BTSNode novoNo = new BTSNode(valorNo, noBase, null, null);
				noBase.setFilhoDaEsquerda(novoNo);
			}
			else {
				inserirNo(valorNo, noBase.getFilhoDaEsquerda());
			}
		}
		
		else if (valorNo == noBase.getValorNo()) {
			System.out.println("Valor " + valorNo + " já foi inserido na árvore");
		}
	}
	
	public BTSNode pesquisarNo(Integer valorNo, BTSNode noBase) {
		
		if (noBase == null) {
			return null;
		}
		
		if (valorNo == noBase.getValorNo()) {
			return noBase;
		}
		
		if (valorNo < noBase.getValorNo()) {
			return pesquisarNo(valorNo, noBase.getFilhoDaEsquerda());
		} 
		else {
			return pesquisarNo(valorNo, noBase.getFilhoDaDireita());
		}
	}
	
	public int calcularProfundidade(BTSNode noBase) {
		
		if (noBase == null || noBase.equals(noRaiz)) {
			return 0;
		}
		else {
			return 1 + calcularProfundidade(noBase.getPai());
		}
		
	}
	
	public int calcularAltura(BTSNode noBase) {
		
		if (noBase == null || isFolha(noBase)) {
			return 0;
		}
		else {
			return 1 + Math.max(calcularAltura(noBase.getFilhoDaDireita()), calcularAltura(noBase.getFilhoDaEsquerda()));
		}
	}
	
	public boolean isFolha(BTSNode no) {
		if (no.getFilhoDaDireita() == null && no.getFilhoDaEsquerda() == null) {
			return true;
		}
		return false;
	}

	public void imprimirPreFixado(BTSNode noBase) {
		if (noBase != null) {
			System.out.print(noBase.getValorNo() + "\t");
			imprimirPreFixado(noBase.getFilhoDaEsquerda());
			imprimirPreFixado(noBase.getFilhoDaDireita());
		}
	}
	
	public void imprimirInterFixado(BTSNode noBase) {
		if (noBase != null) {
			imprimirInterFixado(noBase.getFilhoDaEsquerda());
			System.out.print(noBase.getValorNo() + "\t");
			imprimirInterFixado(noBase.getFilhoDaDireita());
		}
	}
	
	public void imprimirPosFixado(BTSNode noBase) {
		if (noBase != null) {
			imprimirPosFixado(noBase.getFilhoDaEsquerda());
			imprimirPosFixado(noBase.getFilhoDaDireita());
			System.out.print(noBase.getValorNo() + "\t");
		}
	}

	
	public BTSNode getNoRaiz() {
		return noRaiz;
	}

	public void setNoRaiz(BTSNode noRaiz) {
		this.noRaiz = noRaiz;
	}
	
	
}
