package com.fila;

public class Fila {

	private int[] fila;
	private int inicio;
	private int ultimo;
	private int tamanho;
	
	public Fila() {
		this.fila = new int[10];
		this.inicio = 0;
		this.ultimo = 0;
		tamanho = 0;
	}
	
	
	public void inserir(int elemento) {
		
		if(FilaCheia()) {
			throw new RuntimeException(" Fila Cheia! ");
		}
		
		fila[ultimo] = elemento;
		ultimo = (ultimo + 1) % fila.length;
		tamanho++;
		
	}
	
	public int remove() {
		
		if(FilaVazia()) {
			throw new RuntimeException(" Fila Vazia! ");
		}
		
		int elemento = fila[inicio];
		inicio = (inicio + 1) % fila.length;
		tamanho--;
		
		return elemento;
	}
	
	public boolean FilaVazia() {
		return tamanho == 0;
	}
	
	public boolean FilaCheia() {
		return tamanho == fila.length;
	}
	
	
}
