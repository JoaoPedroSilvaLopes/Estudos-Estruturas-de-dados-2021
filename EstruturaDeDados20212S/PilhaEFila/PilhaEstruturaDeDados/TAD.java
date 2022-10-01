package PilhaEstruturaDeDados;

public interface TAD {
	
	/**
	 *  Funçoes principais
	 */
	
	public void adicionar(Integer Valor);
	public void remover();
	
	/**
	 *  Funçoes secundarias
	 */
	
	public boolean cheio();
	public boolean vazio();
	public void imprimir();
	
}