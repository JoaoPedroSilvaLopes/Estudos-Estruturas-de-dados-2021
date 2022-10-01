package PilhaEstruturaDeDados;

public interface TAD {
	
	/**
	 *  Fun�oes principais
	 */
	
	public void adicionar(Integer Valor);
	public void remover();
	
	/**
	 *  Fun�oes secundarias
	 */
	
	public boolean cheio();
	public boolean vazio();
	public void imprimir();
	
}