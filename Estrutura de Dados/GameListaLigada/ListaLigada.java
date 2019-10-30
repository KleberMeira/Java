
import java.util.Random;

public class ListaLigada {

	private Celula inicio;
	private int quantJogador;
	private int quantElementos;
	private int jogadasPorJogador;

	Celula caixa = new Celula();

	public ListaLigada(int quantJogador, int quantElementos, int jogadasPorJogador) {

		this.quantJogador = quantJogador;
		this.quantElementos = quantElementos;
		this.jogadasPorJogador = jogadasPorJogador;
	}

	public int getQuantJogador() {
		return quantJogador;
	}

	public void setQuantJogador(int quantJogador) {
		this.quantJogador = quantJogador;
	}

	public int getQuantElementos() {
		return quantElementos;
	}

	public void setQuantElementos(int quantElementos) {
		this.quantElementos = quantElementos;
	}

	public int getJogadasPorJogador() {
		return jogadasPorJogador;
	}

	public void setJogadasPorJogador(int jogadasPorJogador) {
		this.jogadasPorJogador = jogadasPorJogador;
	}

	
	//CRIAR LISTA
	public boolean insert() {

		caixa.setProximo(null);

		for (int i = 0; i < getQuantElementos(); i++) {

			if (inicio == null) {
				this.inicio = caixa;
				System.out.println("Primeiro elemento: " + i);
				System.out.println("------------" + i);
				System.out.println("Id: " + caixa.getIdJogador());
				System.out.println("Pontos: " + caixa.getPontos());
				System.out.println("Status: " + caixa.getStatus());
				System.out.println("Fator troca: " + caixa.getTroca());
				caixa.setJogadas(getJogadasPorJogador());
				System.out.println("Jogadas: " + caixa.getJogadas());
				System.out.println("------------");
				System.out.println();

			} else {
				caixa.setProximo(inicio);
				inicio = caixa;
				System.out.println("------------" + i);
				System.out.println("Id: " + caixa.getIdJogador());
				System.out.println("Pontos: " + caixa.getPontos());
				System.out.println("Status: " + caixa.getStatus());
				System.out.println("Fator troca: " + caixa.getTroca());
				caixa.setJogadas(getJogadasPorJogador());
				System.out.println("Jogadas: " + caixa.getJogadas());
				System.out.println("------------");
				System.out.println();
			}
		}
		return true;
	}

	//LISTAGEM DOS ELEMENTOS COM SEUS ATRIBUTOS
	public boolean listaElementos() {

		for (int i = 0; i < size(); i++) {

			System.out.println("Primeiro elemento: " + i);
			System.out.println("------------" + i);
			System.out.println("Id: " + caixa.getIdJogador());
			System.out.println("Pontos: " + caixa.getPontos());
			System.out.println("Status: " + caixa.getStatus());
			System.out.println("Fator troca: " + caixa.getTroca());
			System.out.println("Jogadas disponiveis: " + caixa.getJogadas());
			System.out.println("------------");
			System.out.println();

		}
		return true;
	}

	//RETORNA O TAMANHO DA LISTA
	public int size() {
		return this.quantElementos;
	}
	

	public Celula buscar(int pos) {

		Celula a = this.inicio;

		if (pos > size()) {
			return null;
		} else {
			for (int i = 0; i < pos; i++) {
				a = a.getProximo();
			}
			return a;
		}
	}

	public boolean jogada(int pos, int idJogador) {
		
		Celula p = buscar(pos);
		
		if(p.getStatus() == 0) {
			p.setStatus(1);//INVADIDO
			//System.out.println("id jogador: " + idJogador);
			p.setIdJogador(idJogador);
			
			System.out.println("Id: " + p.getIdJogador());
			System.out.println("Pontos: " + p.getPontos());
			System.out.println("Status: " + p.getStatus());
			System.out.println("Fator troca: " + p.getTroca());
			System.out.println("Jogadas disponiveis: " + p.getJogadas());
			System.out.println("------------");
		}else if(p.getStatus() == 1 && p.getIdJogador() != idJogador ) {
			p.setStatus(0);
			int c = p.cont();
			if(c < 0) {
				remove(pos);//REMOVE A CELULA 
				setQuantElementos(getQuantElementos()-1);//REDIMENCIONA LISTA
			}
		}else if(p.getStatus() == 1 && p.getIdJogador() == idJogador) {
			p.setStatus(3);
			p.setPontos(p.getPontos()+1);
		}else if(p.getStatus() == 3 && p.getIdJogador() != idJogador && p.getPontos() > 1) {
			p.setPontos(p.getPontos()-1);
		}else {
			p.setPontos(p.getPontos()+1);//QUANDO JA E PROPRIETARIO
		}
		
		return true;
	}
	

	//SORTEAR POOSICAO
	public int sortearIndice() {
		
		int num;
		Random gerar = new Random();
		num = gerar.nextInt(getQuantElementos()+1);
		//System.out.println("Numero gerado:" + num);
		return num;
	}
	

	// Remocao de elemento da posicao passa por parametro e retornando este valor
	public Object remove(int pos) { 

		Celula p = this.inicio;
		Celula q;

		if (pos > size()) {
			return null;
		} else if (pos == 0) {
			q = p;
			this.inicio = p.getProximo();
			return q;
		} else {

			for (int i = 0; i < pos - 1; i++) {
				p = p.getProximo();
			}
			q = p;
			p.setProximo(p.getProximo().getProximo());
			return q;

		}
	}
	

}
