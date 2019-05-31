
public class LinkedDeque {

	private Node left;
	private Node rigth;
	
	public LinkedDeque() {
		this.left = null;
		this.rigth = left;
	}
	
	public void imprime() {
		
		Node aux = this.left;
		
		while(aux != null) {
			System.out.print(" " + aux.getElemento() + " ");
			aux = aux.getProx();
		}
		
		System.out.println();
	}
	
	//removeRight removeLeft insertRight insertLeft

	public boolean insertLeft(Object value) {
		
		Node nova = new Node();
		nova.setElemento(value);
		nova.setProx(null);
		
		if(this.left == null) {
			this.left = nova;
			this.rigth = nova;
			return true;
		}
		
		else {
			
			nova.setProx(left);
			this.left = nova;
			return true;
		}
	}
	
	public Object removeLeft() {
		
		if(this.left == null) {
			return null;
		}
		
		else{
			
			Node aux = this.left;
			
			this.left = left.getProx();
			return aux.getElemento();
		}
		
	}
	
	public boolean insertRight(Object value) {
		
		Node nova = new Node();
		
		nova.setElemento(value);
		nova.setProx(null);
		
		if(this.left == null) {
			this.left = nova;
			this.rigth = nova;
			return true;
		}
		
		else {
			
			Node aux = this.left;
			
			while(aux.getProx() != null){
				aux = aux.getProx();
			}
				
			aux.setProx(nova);
			this.rigth = nova;
			
			return true;
		}
		
		
	}

	public Object removeRight() {

		Node aux = this.left;
		
		if(this.rigth == null) {
			return null;
		}
		
		else if(size() == 1) {
			this.rigth = rigth.getProx();
			return aux.getElemento();
		}
		
		else {
			Node p;

			int tam = size()-1;
			for (int i = 0; i < tam - 1; i++) {
				aux = aux.getProx();
			}

			p = aux.getProx();
			aux.setProx(aux.getProx().getProx());

			return p.getElemento();

			
		}
		
	}
	
	public int size() {
		
		int cont = 0;
		Node aux = this.left;
		while(aux != null) {
			aux = aux.getProx();
			cont++;
		}
		return cont;
	}
	
	
	
	
	
}
