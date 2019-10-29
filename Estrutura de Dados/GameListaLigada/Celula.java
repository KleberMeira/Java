
public class Celula {

	private int idJogador;
	private int status; //0: Vago
						//1: Invadido
						//2: Proprietario
	private int troca;
	private int pontos;
	private Celula proximo;

	public Celula() {
		this.idJogador = 0;
		this.status = 0;
		this.troca = 0;
		this.pontos = 0;
	}

	public Celula(int idJogador, int status, int troca, int pontos, Celula prox) {
		this.idJogador = 0;
		this.status = 0;
		this.troca = 0;
		this.pontos = 0;
		this.proximo = prox;
	}
	

	

	public int getIdJogador() {
		return idJogador;
	}

	public void setIdJogador(int idJogador) {
		this.idJogador = idJogador;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTroca() {
		return troca;
	}

	public void setTroca(int troca) {
		this.troca = troca;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

}
