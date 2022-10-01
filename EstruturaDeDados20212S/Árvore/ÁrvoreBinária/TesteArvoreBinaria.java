package ÁrvoreBinária;

public class TesteArvoreBinaria {
	
	public static void main(String[] args) {
		
		ArvoreBinaria<Integer> arvoreTeste = new ArvoreBinaria<Integer>();
		
		arvoreTeste.inserirNoRaiz(13);
		
		arvoreTeste.inserirNoEsquerda(10, arvoreTeste.getNoRaiz());
		arvoreTeste.inserirNoDireita(25, arvoreTeste.getNoRaiz());
		
		arvoreTeste.inserirNoEsquerda(2, arvoreTeste.getNoRaiz().getFilhoDaEsquerda());
		arvoreTeste.inserirNoDireita(12, arvoreTeste.getNoRaiz().getFilhoDaEsquerda());
		
		arvoreTeste.inserirNoEsquerda(20, arvoreTeste.getNoRaiz().getFilhoDaDireita());
		arvoreTeste.inserirNoDireita(31, arvoreTeste.getNoRaiz().getFilhoDaDireita());
		
		arvoreTeste.inserirNoDireita(29, arvoreTeste.getNoRaiz().getFilhoDaDireita().getFilhoDaDireita());
		
		System.out.println("INTERFIXADO");
		arvoreTeste.imprimirInterFixado(arvoreTeste.getNoRaiz());
		System.out.println("");
		System.out.println("PRÉFIXADO");
		arvoreTeste.imprimirPreFixado(arvoreTeste.getNoRaiz());
		System.out.println("");
		System.out.println("PÓSFIXADO");
		arvoreTeste.imprimirPosFixado(arvoreTeste.getNoRaiz());
		
	}
}
