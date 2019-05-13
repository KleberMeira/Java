package com.fila;

public class Celula {

	private Celula prox;
	private Object elemento;

	public Celula() {
	}
	
	public void Celula(Object elemento) {
		this.elemento = elemento;
		this.prox = null;
	}

	public Celula getProx() {
		return prox;
	}

	public void setProx(Celula prox) {
		this.prox = prox;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

}
