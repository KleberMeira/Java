package com.fila;

public class FilaEncadeada {

	private Celula inicio;
	private Celula fim;
	private int tamanho;

	public FilaEncadeada() {

		this.inicio = null;
		fim = inicio;
		tamanho = 0;
		
	}

	public boolean enfileira(Object elemento) {

		Celula nova = new Celula();
		nova.setElemento(elemento);
		nova.setProx(null);
		
		if(this.inicio == null) {
			this.inicio = nova;
			fim = inicio;
			inicio = nova;
			tamanho++;
			return true;
		}
		else {
			fim.setProx(nova);
			fim = nova;
			tamanho++;
			return true;
		}

	}

	public Object desinfileira() {
		
		if(tamanho < 0) {
			return null;
		}
		
		this.inicio = inicio.getProx();
		tamanho--;
		return inicio.getElemento();
	}

	public boolean isEmpty() {

		if (tamanho < 0) {
			return true;
		}
		return false;

	}

	public void ler() {
		Celula aux = this.inicio;
		
		while(aux != null) {
			System.out.print(" " + aux.getElemento() + " ");
			aux = aux.getProx();
		}
	}
	
}
