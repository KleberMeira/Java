
public class LinkedStack implements Stack {

	private Node inicio;
	private int tamanho;

	public LinkedStack() {
		this.inicio = null;
		this.tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	public Node getInicio() {
		return inicio;
	}

	public void setInicio(Node inicio) {
		this.inicio = inicio;
	}

	public void ler() {
		Node aux = this.inicio;

		if(this.inicio == null) {
			System.out.println("Vazia");
		}
		else {
			while (aux != null) {
				System.out.print(" " + aux.getElemento() + " ");
				aux = aux.getProx();
			}
		}
		
		
		System.out.println();
	}

	@Override
	public boolean push(Object value) {

		Node nova = new Node();
		nova.setElemento(value);

		if (this.inicio == null) {
			this.inicio = nova;
			this.tamanho++;
			// System.out.println("True 1");
			return true;
		} else {
			Node aux = this.inicio;
			while (aux.getProx() != null) {
				aux = aux.getProx();
			}
			aux.setProx(nova);
			this.tamanho++;
			// System.out.println("True 2");
			return true;
		}

	}

	@Override
	public Object pop() {

		Node aux = this.inicio;
		
		if(this.tamanho == 1) {//quando tem apenas um elemento
			this.inicio = null;
			tamanho--;
			return aux.getElemento();
		}
		
		else {
			Node p = aux.getProx();
			while (p.getProx() != null) {
				p = p.getProx();
				aux = aux.getProx();
			}
			this.tamanho--;
			aux.setProx(aux.getProx().getProx());

			return p.getElemento();
		}
		
		
	}

	@Override
	public Object top() {
		
		if(this.tamanho == 0) {
			return null;
		}
		
		else {
			Node topo = this.inicio;
			while (topo.getProx() != null) {
				topo = topo.getProx();
			}
			
			return topo.getElemento();
		}

	}

	@Override
	public boolean isEmpty() {

		if (this.inicio == null) {
			return true;
		}

		return false;
	}

	@Override
	public int size() {

		if (this.inicio == null) {
			return 0;
		}

		else {
			return this.tamanho;
		}
	}

}
