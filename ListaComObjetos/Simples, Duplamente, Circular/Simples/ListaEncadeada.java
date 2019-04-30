
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
		
		if(inicio == null) {
			this.inicio = nova;
			return true;
		}
		else {
			nova.setProx(inicio);
			inicio = nova;
			return true;
		}

	}
	
	public void listar() {
		Node aux = this.inicio;
		
		if(size() == 0) {
			System.out.println("Lista vazia");
		}
		else {
			while(aux != null) {
				System.out.print(" " + aux.getElemento());
				aux = aux.getProx();
			}
		}
		
	}

	// Remocao de elemento no comeco da lista
	@Override
	public Object remove() {
		
		if(size() == 0) {
			return null;
		}
		else {
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
		}else {
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
		
		return null;
	}

	// Insercao de elemento na posicao recebida como parametro
	@Override
	public boolean insert(int pos, Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	// Remocao de elemento da posicao passa por parametro e retornando este valor
	@Override
	public Object remove(int pos) {
		
		Node p = this.inicio;
		Node q = p.getProx();
		
		if(pos > size()) {
			return null;
		}
		else if(pos == 0){
			return this.inicio = p.getProx();
		}
		else {
			
			for(int i = 0; i < pos-1; i++) {
				p = p.getProx();
				q = q.getProx();
			}
			
			p.setProx(p.getProx().getProx());
			
		}
		

		
		return null;
	}

	// Retorna elemento da posicao do parametro sem remover, semelhante ao get
	@Override
	public Object peek(int pos) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {

		return " Elementos: ";
	}

}
