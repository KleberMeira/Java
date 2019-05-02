
public class Node {

	/*
	 * Kleber Meira
	 */
	
	private Object elemento;
	private Node prox;
	
	public Node() {
		
	}
	
	public Node(Object elemento) {
		this.elemento = elemento;
		this.prox = null;
	}
	
	public Node(Object elemento, Node prox) {
		this.elemento = elemento;
		this.prox = prox;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Node getProx() {
		return prox;
	}

	public void setProx(Node prox) {
		this.prox = prox;
	}
	
	
}
