package PilhaEstruturaDeDados;

public class TesteFila {

	public static void main(String[] args) {
		
		TAD fila = new Fila(5);
		
		fila.adicionar(5);
		fila.adicionar(3);
		fila.remover();
		fila.adicionar(2);
		fila.adicionar(8);
		fila.remover();
		fila.remover();
		fila.adicionar(9);
		fila.adicionar(1);
		fila.remover();
		fila.adicionar(7);
		fila.adicionar(6);
		fila.remover();
		fila.remover();
		fila.adicionar(4);
		fila.remover();
		fila.remover();
	}
}