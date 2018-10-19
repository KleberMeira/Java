package ListasLineares;

public class CelulaSimples {

	private int chave;
	private CelulaSimples prox;
	
	public CelulaSimples() {
		this.prox = null;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public CelulaSimples getProx() {
		return prox;
	}

	public void setProx(CelulaSimples prox) {
		this.prox = prox;
	}
	
	
	
}
