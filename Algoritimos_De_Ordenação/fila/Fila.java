package fila;

import java.util.EmptyStackException;

public class Fila implements FilaSequencial {

	private int elemento;
	private int inicio;
	private int fim;
	private int[] vetor;
	private int tamanho;
	
	public Fila() {
		vetor = new int[10];
		inicio = 0;
		fim = 0;
		tamanho = 0;
		
	}
	
	
	@Override
	public void enfileira(int elemento) {
		if(tamanho == vetor.length)
			RedimencionaVetor();
		
		vetor[fim] = elemento;
		fim = (fim + 1);
		tamanho++;
		
	}

	@Override
	public int desenfileira() throws EmptyStackException {
		if(tamanho > 0) {
			int elementoRemovido = vetor[inicio];
			inicio++;
	
		return elementoRemovido;
		}
		throw new EmptyStackException();
	}
	
	///Redimenciona Vetor com um novo tamanho
	public void RedimencionaVetor() {
		int[] vetorAux = new int[vetor.length + 1];
		for(int i = 0 ; i < vetorAux.length ; i++) {
			vetorAux[i] = vetor[i]; 
			
		}
	}

	

}
