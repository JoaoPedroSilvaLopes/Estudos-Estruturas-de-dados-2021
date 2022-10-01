package ÁrvoreBinária;

public class No<T> {
	
	private T valorDoNo;
	private No<T> pai, filhoDaEsquerda, filhoDaDireita;
	
	public No(T valorDoNo, No<T> pai, No<T> filhoDaEsquerda, No<T> filhoDaDireita) {
		this.valorDoNo = valorDoNo;
		this.pai = pai;
		this.filhoDaEsquerda = filhoDaEsquerda;
		this.filhoDaDireita = filhoDaDireita;
		
	}
	
	public T getValorDoNo() {
		return valorDoNo;
	}
	public void setValorDoNo(T valorDoNo) {
		this.valorDoNo = valorDoNo;
	}
	public No<T> getPai() {
		return pai;
	}
	public void setPai(No<T> pai) {
		this.pai = pai;
	}
	public No<T> getFilhoDaEsquerda() {
		return filhoDaEsquerda;
	}
	public void setFilhoDaEsquerda(No<T> filhoDaEsquerda) {
		this.filhoDaEsquerda = filhoDaEsquerda;
	}
	public No<T> getFilhoDaDireita() {
		return filhoDaDireita;
	}
	public void setFilhoDaDireita(No<T> filhoDaDireita) {
		this.filhoDaDireita = filhoDaDireita;
	}
		
}
