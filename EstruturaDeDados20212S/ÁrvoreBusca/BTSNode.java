
public class BTSNode {

	private Integer valorNo;
	private BTSNode pai, filhoDaEsquerda, filhoDaDireita;
	
	public BTSNode(Integer valorNo, BTSNode pai, BTSNode filhoDaEsquerda, BTSNode filhoDaDireita) {
		this.valorNo = valorNo;
		this.pai = pai;
		this.filhoDaEsquerda = filhoDaEsquerda;
		this.filhoDaDireita = filhoDaDireita;
	}
	
	public Integer getValorNo() {
		return valorNo;
	}
	public void setValorNo(Integer valorNo) {
		this.valorNo = valorNo;
	}
	public BTSNode getPai() {
		return pai;
	}
	public void setPai(BTSNode pai) {
		this.pai = pai;
	}
	public BTSNode getFilhoDaEsquerda() {
		return filhoDaEsquerda;
	}
	public void setFilhoDaEsquerda(BTSNode filhoDaEsquerda) {
		this.filhoDaEsquerda = filhoDaEsquerda;
	}
	public BTSNode getFilhoDaDireita() {
		return filhoDaDireita;
	}
	public void setFilhoDaDireita(BTSNode filhoDaDireita) {
		this.filhoDaDireita = filhoDaDireita;
	}
	
	
}
