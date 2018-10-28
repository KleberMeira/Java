package listas_lineares;

public class Celula {

	private int chave;
	private Celula prox;
	
	public Celula() {
		this.prox = null;
	}
	
	public Celula(int chave) {
		this.chave = chave;
	}

	public int getElemento() {
		return chave;
	}

	public void setElemento(int elemento) {
		this.chave = elemento;
	}

	public Celula getProx() {
		return prox;
	}

	public void setProx(Celula prox) {
		this.prox = prox;
	}
	
	

	
	
}
