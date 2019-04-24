package com.listaordem;

public class Node {

	private Node prox;
	private Object chave;
	
	/*
	 * Esta classe deve ter trˆes
		construtores: 
		 [1] um  que  n ̃ao  recebe  nenhum  parˆametro;  
		 [2] um  que  recebe  apenas  o  valor a ser armazenado; 
		 [3]um que recebe tanto o valor quanto o pr ́oximo n ́o da lista como
		parˆametros.
		
		A lista utilize n ́os de uma classe
		Node
		, criada por vocˆe.  Esta classe deve possuir um
		link para o pr ́oximo n ́o e armazenar um objeto do tipo
		Object
		. 
	 */
	
	public Node() {
		this.prox = null;
		this.chave = null;		
	}
	
	public Node(Object valor) {
		this.prox = null;
		this.chave = valor;
	}
	
	public Node(Object valor, Node prox) {
		this.chave = valor;
		this.prox = prox;
	}

	public Node getProx() {
		return prox;
	}

	public void setProx(Node prox) {
		this.prox = prox;
	}

	public Object getChave() {
		return chave;
	}

	public void setChave(Object chave) {
		this.chave = chave;
	}
	
	
	
}
