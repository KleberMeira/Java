
public class ListaEncadeada implements Lista {

	/*
	 * Kleber Meira
	 */

	private Node inicio;

	public ListaEncadeada() {
		this.inicio = null;
	}

	// Insercao de elemento no comeco da lista
	@Override
	public boolean insert(Object obj) {

		Node nova = new Node();
		nova.setElemento(obj);
		nova.setProx(null);

		if (inicio == null) {
			this.inicio = nova;
			return true;
		} else {
			nova.setProx(inicio);
			inicio = nova;
			return true;
		}

	}

	public void listar() {
		Node aux = this.inicio;

		if (size() == 0) {
			System.out.println("Lista vazia");
		} else {
			while (aux != null) {
				System.out.print(" " + aux.getElemento());
				aux = aux.getProx();
			}
		}

	}

	// Remocao de elemento no comeco da lista
	@Override
	public Object remove() {

		if (size() == 0) {
			return null;
		} else {
			Node aux = this.inicio;
			this.inicio = aux.getProx();
			return aux.getElemento();

		}
	}

	// Insere elemento no final da lista
	@Override
	public boolean insertLast(Object obj) {

		Node aux = this.inicio;
		Node nova = new Node();
		nova.setElemento(obj);
		nova.setProx(null);

		if (inicio == null) {
			inicio = nova;
			return true;
		} else {
			while (aux.getProx() != null) {
				aux = aux.getProx();
			}
			aux.setProx(nova);
		}
		return true;
	}

	// Remove elemento do final da lista **VOLTAR**
	@Override
	public Object removeLast() {

		Node p = this.inicio;
		Node q;

		if (size() == 0) {
			return null;
		} else if (size() == 1) {
			this.inicio = null;
			return p.getElemento();
		} else {

			for (int i = 0; i < size(); i++) {
				p = p.getProx();
			}
			p.setProx(null);
			return p.getElemento();
		}
	}

	// Insercao de elemento na posicao recebida como parametro
	@Override
	public boolean insert(int pos, Object obj) {

		Node p = this.inicio;
		Node q = p.getProx();
		Node nova = new Node();
		nova.setElemento(obj);

		if (pos > size()) {
			return false;
		} else {
			for (int i = 0; i < pos - 1; i++) {
				p = p.getProx();
				q = q.getProx();
			}
			p.setProx(nova);
			nova.setProx(q);
			return true;
		}
	}

	// Remocao de elemento da posicao passa por parametro e retornando este valor
	// Rever a questao da posicao 0 e 1 semipronto
	@Override
	public Object remove(int pos) {

		Node p = this.inicio;
		Node q;

		if (pos > size()) {
			return null;
		} else if (pos == 0) {
			return this.inicio = p.getProx();
		} else {

			for (int i = 0; i < pos - 1; i++) {
				p = p.getProx();
			}
			q = p;
			p.setProx(p.getProx().getProx());
			return q.getElemento();
		}
	}

	// Retorna elemento da posicao do parametro sem remover, semelhante ao get
	@Override
	public Object peek(int pos) {

		Node p = this.inicio;

		if (pos > size()) {
			return null;
		} else {
			for (int i = 0; i < pos; i++) {
				p = p.getProx();
			}
			return p.getElemento();
		}
	}

	// Ordenacao da lista
	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

	// Inversao da lista
	@Override
	public void invert() {
		// TODO Auto-generated method stub

	}

	// Retorna o tamanho da lista
	@Override
	public int size() {

		Node aux = this.inicio;
		int tamanho = 0;
		while (aux != null) {
			aux = aux.getProx();
			tamanho++;
		}

		return tamanho;
	}

	// Retorno da primeira metade da lista
	@Override
	public Lista getFirstHalf() {
		// TODO Auto-generated method stub
		return null;
	}

	// Retorno da segunda metade da lista
	@Override
	public Lista getSecondHalf() {
		// TODO Auto-generated method stub
		return null;
	}

	// Retorna booleano se a lista esta vazia ou nao
	@Override
	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}

	// Retorna um booleano, indicando se o objeto passado por parametro esta ou nao
	// na lista
	@Override
	public boolean contains(Object obj) {

		Node aux = this.inicio;

		while(aux != null) {
			if(aux.getElemento().equals(obj)) {
				return true;
			}
			aux = aux.getProx();
		}
		
		return false;
	}

	public String toString() {

		return " Elementos: ";
	}

}
