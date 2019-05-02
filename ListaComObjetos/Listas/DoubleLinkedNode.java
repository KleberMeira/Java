
public class DoubleLinkedNode {

	private Object elemento;
	private DoubleLinkedNode proximo;
	private DoubleLinkedNode anterior;

	public DoubleLinkedNode() {

	}

	public DoubleLinkedNode(Object elemento) {
		this.elemento = elemento;
		this.proximo = null;
		this.anterior = null;
	}

	public DoubleLinkedNode(Object elemento, DoubleLinkedNode proximo, DoubleLinkedNode anterior) {
		this.proximo = proximo;
		this.anterior = anterior;
		this.elemento = elemento;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public DoubleLinkedNode getProximo() {
		return proximo;
	}

	public void setProximo(DoubleLinkedNode proximo) {
		this.proximo = proximo;
	}

	public DoubleLinkedNode getAnterior() {
		return anterior;
	}

	public void setAnterior(DoubleLinkedNode anterior) {
		this.anterior = anterior;
	}

}
