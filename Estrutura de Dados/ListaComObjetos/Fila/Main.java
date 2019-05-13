package com.fila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fila fila = new Fila();
		
		fila.inserir(5);
		fila.inserir(4);
		fila.inserir(3);
		fila.inserir(2);
		fila.inserir(1);
		
		while(fila.FilaVazia() == false) {
			System.out.print(" " + fila.remove());
		}
		
		System.out.println();
		FilaEncadeada eFila = new FilaEncadeada();
		eFila.enfileira(2);
		eFila.enfileira(3);
		eFila.enfileira(5);
		eFila.enfileira(6);
		eFila.enfileira(9);
		eFila.enfileira(100);
		
		eFila.desinfileira();
		eFila.desinfileira();
		eFila.desinfileira();
		
		eFila.ler();
		
		System.out.println();
		System.out.println(eFila.isEmpty());
		
	}

}
