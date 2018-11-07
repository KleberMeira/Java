public class CelulaDupla {
	
	private int chave;
	private CelulaDupla ant;
	private CelulaDupla prox;
	
	
	public CelulaDupla() {
		this.ant = null;
		this.prox = null;
	}
	
	
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public CelulaDupla getAnt() {
		return ant;
	}
	public void setAnt(CelulaDupla ant) {
		this.ant = ant;
	}
	public CelulaDupla getProx() {
		return prox;
	}
	public void setProx(CelulaDupla prox) {
		this.prox = prox;
	}
	
	

	
}