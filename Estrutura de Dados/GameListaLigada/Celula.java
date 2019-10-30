
public class Celula {

	private int idJogador;
	private int status; //0: Vago
						//1: Invadido
						//2: Proprietario
	private int troca = 0;
	private int pontos;
	
	private int contMudar = 3;
	private int jogadas;
	
	
	private Celula proximo;

	public Celula() {
		this.idJogador = 0;
		this.status = 0;
		this.troca = 0;
		this.pontos = 0;
	}
	
	public Celula(Celula c) {
		this.idJogador = c.getIdJogador();
		this.status = c.getStatus();
		this.troca = c.getStatus();
		this.troca = c.getTroca();
		this.pontos = c.getPontos();
	}

	
	public void ler() {
		System.out.println("Id: " + getIdJogador());
		System.out.println("Pontos: " + getPontos());
		System.out.println("Status: " + getStatus());
		System.out.println("Fator troca: " + getTroca());
		System.out.println("Jogadas disponiveis: " + getJogadas());
		System.out.println("------------");
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

	public int getJogadas() {
		return jogadas;
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

	public void setJogadas(int jogadas) {
		this.jogadas = jogadas;
	}
	
	
	public int cont() {
		int valor;
		return valor = this.contMudar--;
	}
	
	
}
