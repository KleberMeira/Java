
public class ListaDuplamenteEncadeada implements Lista {

	private DoubleLinkedNode inicio;
	private DoubleLinkedNode fim;

	public ListaDuplamenteEncadeada() {
		this.inicio = null;
		fim = inicio;
	}

	public void ler() {
		DoubleLinkedNode aux = this.inicio;

		while (aux != null) {
			System.out.print(" " + aux.getElemento() + " ");
			aux = aux.getProximo();
		}
	}

	// Insercao de elemento no comeco da lista
	@Override
	public boolean insert(Object obj) {

		DoubleLinkedNode nova = new DoubleLinkedNode();
		nova.setElemento(obj);

		if (this.inicio == null) {
			this.inicio = nova;
		} else {
			nova.setProximo(inicio);
			nova.setAnterior(null);
			inicio = nova;
		}

		return true;
	}

	// Remocao de elemento no comeco da lista
	@Override
	public Object remove() {

		DoubleLinkedNode aux = this.inicio;

		if (size() == 0) {
			return null;
		} else {
			this.inicio = inicio.getProximo();
			return aux.getElemento();
		}
	}

	// Insere elemento no final da lista
	@Override
	public boolean insertLast(Object obj) {

		DoubleLinkedNode nova = new DoubleLinkedNode();
		nova.setElemento(obj);

		if (inicio == null) {
			this.inicio = nova;
		} else {
			DoubleLinkedNode aux = this.inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(nova);
			nova.setAnterior(aux);
			nova.setProximo(null);
		}

		return true;
	}

	// Remove elemento do final da lista
	@Override
	public Object removeLast() {

		// a fazer

		return null;
	}

	// Insercao de elemento na posicao recebida como parametro
	@Override
	public boolean insert(int pos, Object obj) {

		DoubleLinkedNode nova = new DoubleLinkedNode();
		nova.setElemento(obj);

		if (pos > size()) {
			return false;
		} else if (pos == 0) {
			insert(obj);
			return true;
		} else {
			DoubleLinkedNode p = this.inicio;
			DoubleLinkedNode q = p.getProximo();

			for (int i = 0; i < pos - 1; i++) {
				p = p.getProximo();
				q = q.getProximo();
			}

			p.setProximo(nova);
			nova.setAnterior(p);
			nova.setProximo(q);
			q.setAnterior(nova);
			return true;
		}
	}

	// Remocao de elemento da posicao passa por parametro e retornando este valor
	@Override
	public Object remove(int pos) {

		DoubleLinkedNode p = this.inicio;
		DoubleLinkedNode q = p.getProximo();
		DoubleLinkedNode aux;
		
		if (pos == 0) {
			aux = p;
			this.inicio = inicio.getProximo();
			return aux.getElemento();
			
		} else if (pos > size()) {
			return null;
		} else {
			for (int i = 0; i < pos - 1; i++) {
				p = p.getProximo();
				q = q.getProximo();
			}

			aux = q;
			p.setProximo(p.getProximo().getProximo());
			q.setAnterior(p);
			return aux.getElemento();
		}
	}

	// Retorna elemento da posicao do parametro sem remover, semelhante ao get
	@Override
	public Object peek(int pos) {
		
		DoubleLinkedNode p = this.inicio;
		
		if(pos > size()) {
			return null;
		}
		else {
			for(int i = 0; i < pos; i++) {
				p = p.getProximo();
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

		DoubleLinkedNode aux = this.inicio;
		int tamanho = 0;

		while (aux != null) {
			aux = aux.getProximo();
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
		// TODO Auto-generated method stub
		return false;
	}

}
