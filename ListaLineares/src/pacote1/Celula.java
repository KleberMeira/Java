package pacote1;

public class Celula {

	private int chave;
	private Celula prox;
	
	
	public Celula(int chave) {
		this.chave = chave;
	}
	
	
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public Celula getProx() {
		return prox;
	}
	public void setProx(Celula prox) {
		this.prox = prox;
	}
	
	

}
