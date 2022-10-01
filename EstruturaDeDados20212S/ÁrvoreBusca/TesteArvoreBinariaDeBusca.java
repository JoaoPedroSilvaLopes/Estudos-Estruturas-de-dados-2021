
public class TesteArvoreBinariaDeBusca {

	public static void main(String[] args) {
		
		ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();
		
		arvore.inserirNo(20, arvore.getNoRaiz());
		arvore.inserirNo(30, arvore.getNoRaiz());
		arvore.inserirNo(10, arvore.getNoRaiz());
		
		arvore.imprimirInterFixado(arvore.getNoRaiz());
		
		System.out.println("");
		System.out.println("Altura: " + arvore.calcularAltura(arvore.getNoRaiz()));
		System.out.println("Profundidade: " + arvore.calcularProfundidade(arvore.getNoRaiz()));
		
		arvore.inserirNo(30, arvore.getNoRaiz());
		
		arvore.pesquisarNo(30, arvore.getNoRaiz());
		
		arvore.pesquisarNo(12, arvore.getNoRaiz());
	}
}
