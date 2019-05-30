
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
		
		else {
			
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
	
	//Voltar aqui, corrigir remocao no final nao valida
	public Object removeRight() {

		Node aux = this.left;
		Node p = aux.getProx().getProx();
		Node removido;
		
		while(p != null) {
			p = p.getProx();
			aux = aux.getProx();
		}
		
		removido = this.rigth;
		this.rigth = aux;
		aux.setProx(aux.getProx().getProx());
		
		return aux.getElemento();
	}
	
	
	
	
	
}
