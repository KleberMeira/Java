
public class ListaEncadeada implements Lista, Comparable {

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

	// Remove elemento do final da lista
	@Override
	public Object removeLast() {

		Node aux = this.inicio;
		Node p;

		int tam = size() - 1;
		for (int i = 0; i < tam - 1; i++) {
			aux = aux.getProx();
		}

		p = aux.getProx();
		aux.setProx(aux.getProx().getProx());

		return p.getElemento();

	}

	// Insercao de elemento na posicao recebida como parametro
	// verificar pq esta comecando da pos 1 ao inves da 0 **VOLTAR AQUI**
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
	@Override
	public Object remove(int pos) { // rever

		Node p = this.inicio;
		Node q;

		if (pos > size()) {
			return null;
		} else if (pos == 0) {
			q = p;
			this.inicio = p.getProx();
			return q.getElemento();
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
	//Object[] vet, int inicio, int fim
	@Override
	public void sort() {
		
		Node lista = this.inicio;
		quickSort(lista, 0 , size()-1);

	}
	@Override
	public int compareTo(Object elemento) {
			Node lista = this.inicio;
			
			return 0;
	}
	
	public void quickSort(Node lista, int inicio, int fim) {
 	/*
		int i = partition(lista, inicio, fim);

		if (inicio < i - 1) {
			quickSort(lista, inicio, i - 1);
		}

		if (i < fim) {
			quickSort(lista, i, fim);
		}
	*/
	}
/*
	public int partition(Node a, int inicio, int fim) {

		int i = inicio;
		int j = fim;

		int pivot = (inicio + fim / 2);

		while (i <= j) {

			while (a. < pivot) {
				i++;
			}

			while (a[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}

		}
		return i;
	}
	*/
	

	// Inversao da lista
	@Override
	public void invert() {

		Node p = this.inicio;
		Node q = p.getProx();
		Node atual = p;

		while (p != null) {
			q.setProx(p);
			p = p.getProx();
			q = q.getProx();
			atual = atual.getProx();
			System.out.print("" + p.getElemento() + "");
		}

		this.inicio = atual;

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

		Node lista = this.inicio;
		int metade = (size() - 1) / 2;
		// System.out.println(metade);
		ListaEncadeada nova = new ListaEncadeada();
		for (int i = 0; i <= metade; i++) {
			nova.insertLast(lista.getElemento());
			lista = lista.getProx();
		}
		nova.listar();
		
		return null;
	}

	// Retorno da segunda metade da lista
	@Override
	public Lista getSecondHalf() {
		
		Node lista = this.inicio;
		ListaEncadeada nova = new ListaEncadeada();
		int metade = (size() - 1) / 2;
		// System.out.println(metade);
		for (int i = 0; i < metade; i++) {
			lista = lista.getProx();
		}

		// System.out.println(lista.getElemento());

		for (int j = metade; j < size(); j++) {
			nova.insertLast(lista.getElemento());
			lista = lista.getProx();
		}

		nova.listar();
		
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

		while (aux != null) {
			if (aux.getElemento().equals(obj)) {
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
