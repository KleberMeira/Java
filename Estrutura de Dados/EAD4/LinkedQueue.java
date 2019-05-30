
public class LinkedQueue implements Queue {
	
	private Node inicio;
	
	public LinkedQueue() {
		this.inicio = null;
	}

	public void mostrar() {
		Node ler = this.inicio;
		
		while(ler != null) {
			System.out.print(" " + ler.getElemento() + " ");
			ler = ler.getProx();
		}
		System.out.println();
	}
	
	@Override
	public boolean enqueue(Object value) {
		
		Node nova = new Node();
		nova.setElemento(value);
		nova.setProx(null);
		
		if(this.inicio == null) {
			inicio = nova;
			return true;
		}
		
		else {
			
			Node aux = this.inicio;
			
			while(aux.getProx() != null) {
				aux = aux.getProx();
			}
			
			aux.setProx(nova);
			return true;
		}
		
	}

	@Override
	public Object dequeue() {
		
		if(this.inicio == null) {
			return null;
		}
		
		else {
		
			Node aux = this.inicio;
			this.inicio = inicio.getProx();
			
			return aux.getElemento();
		}
	}

	@Override
	public Object peek() {
		
		if(this.inicio == null) {
			return null;
		}
		
		else {
			return this.inicio.getElemento();
		}
	}

	@Override
	public boolean isEmpty() {
			
		return size() == 0 ? true : false;
	}

	@Override
	public int size() {
		
		Node aux = this.inicio;
		int cont = 0;
		
		while(aux != null) {
			cont++;
			aux = aux.getProx();
		}
		
		return cont;
	}

	
	
}
