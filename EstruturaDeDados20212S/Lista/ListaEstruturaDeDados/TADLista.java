package ListaEstruturaDeDados;

public interface TADLista <T>{

	// funcoes principais
	public void inserir(T Valor, int posicaoLista);
	public void remover(int posicaoLista);
	
	
	// funcoes secundarias
	public boolean ListaCheia();
	public boolean ListaVazia();
	public void imprimir();
	
}