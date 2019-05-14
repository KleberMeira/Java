
public class Node {

	private Node proximo;
	private Node anterior;
	private Object elemento;

	public Node() {
		
	}
	public Node(Object elemento) {
		this.elemento = elemento;
		this.proximo = null;
		this.anterior = null;
	}
	
	public Node(Node proximo, Node anterior, Object elemento) {
		super();
		this.proximo = proximo;
		this.anterior = anterior;
		this.elemento = elemento;
	}
	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	public Node getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
}
