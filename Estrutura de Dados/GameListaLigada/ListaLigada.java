
import java.util.Random;

public class ListaLigada {

	private Celula inicio;
	private int quantJogador;
	private int quantElementos;
	private int quantJogadas;

	Celula caixa = new Celula();

	public ListaLigada(int quantJogador, int quantElementos, int quantJogadas) {

		this.quantJogador = quantJogador;
		this.quantElementos = quantElementos;
		this.quantJogadas = quantJogadas;
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

	public int getQuantJogadas() {
		return quantJogadas;
	}

	public void setQuantJogadas(int quantJogadas) {
		this.quantJogadas = quantJogadas;
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
			System.out.println("------------");
			System.out.println();

		}
		return true;
	}

	//RETORNA O TAMANHO DA LISTA
	public int size() {
		return this.quantElementos;
	}

	public boolean jogar() {
		int ind = sortearIndice();
		System.out.println("Indice sorteado: " + ind);
		int a = 0;
		
		if(a == ind) {
			System.out.println("Sou == a 0");
		}
		
		else {
			while(a != ind) {
				a++;
				
				if(a == ind) {
					System.out.println("Sou o " + a);
				}
				
			}
		}
		
		
		return false;
	}
	
	//SORTEAR POOSICAO
	public int sortearIndice() {
		
		int num;
		Random gerar = new Random();
		num = gerar.nextInt(getQuantElementos()+1);
		//System.out.println("Numero gerado:" + num);
		return num;
	}
	
	/*
	 * 	//0: Vago
		//1: Invadido
		//2: Proprietario
	 */
	

}
