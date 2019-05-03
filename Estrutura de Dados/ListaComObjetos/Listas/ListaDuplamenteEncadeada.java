
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
			fim = nova; // fica na primeira celula de criacao e vai se tornando a calda
		} else {

			nova.setProximo(inicio);
			inicio.setAnterior(nova);
			inicio = nova;// vai movendo o inicio sempre para cabeca
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
			inicio = nova;
			fim = nova;
		} else {

			fim.setProximo(nova);
			nova.setAnterior(fim);
			fim = nova;
		}

		return true;
	}

	// Remove elemento do final da lista ///VOLTAR AQUI
	@Override
	public Object removeLast() {

		DoubleLinkedNode aux = this.fim;

		if (size() == 0) {
			return null;
		} else {
			this.fim = fim.getAnterior();
			return aux.getElemento();
		}
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

		if (pos > size()) {
			return null;
		} else {
			for (int i = 0; i < pos; i++) {
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

		DoubleLinkedNode aux = this.fim;

		while (aux != null) {
			System.out.print(" " + aux.getElemento() + " ");
			aux = aux.getAnterior();
		}

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

		DoubleLinkedNode lista = this.inicio;
		int metade = (size() - 1) / 2;
		// System.out.println(metade);
		ListaDuplamenteEncadeada nova = new ListaDuplamenteEncadeada();
		for (int i = 0; i <= metade; i++) {
			nova.insertLast(lista.getElemento());
			lista = lista.getProximo();
		}
		nova.ler();

		return null;
	}

	// Retorno da segunda metade da lista
	@Override
	public Lista getSecondHalf() {

		DoubleLinkedNode lista = this.inicio;
		ListaDuplamenteEncadeada nova = new ListaDuplamenteEncadeada();
		int metade = (size() - 1) / 2;
		// System.out.println(metade);
		for (int i = 0; i < metade; i++) {
			lista = lista.getProximo();
		}

		// System.out.println(lista.getElemento());

		for (int j = metade; j < size(); j++) {
			nova.insertLast(lista.getElemento());
			lista = lista.getProximo();
		}

		nova.ler();

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

		DoubleLinkedNode aux = this.inicio;

		while (aux != null) {
			if (aux.getElemento().equals(obj)) {
				return true;
			}
			aux = aux.getProximo();
		}
		return false;
	}

	public String toString() {

		DoubleLinkedNode aux = this.inicio;

		while (aux != aux.getProximo()) {
			aux = aux.getProximo();
		}

		return "" + aux;
	}

}
