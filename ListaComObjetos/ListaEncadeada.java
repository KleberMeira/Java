package com.listaordem;

public class ListaEncadeada implements Lista {

	private Node inicio;
	
	
	
	@Override
	public Object get(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(int pos, Object item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Object item) {
		// TODO Auto-generated method stub
		Node nova = new Node(item);
		Node aux = this.inicio;

		if(aux.getProx() != null) {
			while(aux != null) 
				aux = aux.getProx();
			aux = nova;
		}else 
			aux = nova;
		
		return true;
	}

	@Override
	public boolean remove(int pos) {

		if(size() < pos) 
			return false;
		
		Node p = this.inicio;
		Node q = p.getProx();
		
		for(int i = 0 ; i < pos - 1; i++) {
			//alguma coisa
			p = p.getProx();
			q = q.getProx();
		}
		
		if(pos == 0) {
			this.inicio = p.getProx();
		}
		
		
		
		
		return false;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}

	@Override
	public int size() {
		
		if(inicio.getProx() == null) {
			return 0;
		}
		else {
			Node aux = new Node();
			int i = 0;
			while(aux.getProx() != null) {
				i++;
				aux = aux.getProx();
			}
			return i; //retorna o tamanho da lista
		}
	}

}
