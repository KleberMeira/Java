
public class PriorityNode {

	private PriorityNode prox;
	private Object elemento;
	private int prioridade;

	public PriorityNode() {

	}

	public PriorityNode(Object elemento, int prioridade) {

		this.elemento = elemento;
		this.prioridade = prioridade;

	}

	public PriorityNode(Object elemento, int prioridade, PriorityNode prox) {
		this.elemento = elemento;
		this.prioridade = prioridade;
		this.prox = prox;
	}

	public PriorityNode getProx() {
		return prox;
	}

	public void setProx(PriorityNode prox) {
		this.prox = prox;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

}
