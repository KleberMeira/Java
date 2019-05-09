
public class ListaDePrioridades implements Lista {

	private PriorityNode inicio;

	public ListaDePrioridades() {
		this.inicio = null;
	}

	@Override
	public boolean insert(Object obj) {
		System.out.println("Para insercao deve ser usado *insertInOrder*");
		return false;
	}

	@Override
	public Object remove() {

		if (size() == 0) {
			return null;
		} else {
			PriorityNode aux = this.inicio;
			this.inicio = aux.getProx();
			return aux.getElemento();
		}
	}

	// insertLast e insert
	@Override
	public boolean insertLast(Object obj) {
		System.out.println("Para insercao deve ser usado *insertInOrder*");
		return false;
	}

	@Override
	public Object removeLast() {

		PriorityNode aux = this.inicio;
		PriorityNode p;
		int tamanho = size() - 1;

		for (int i = 0; i < tamanho; i++) {
			aux = aux.getProx();
		}

		p = aux;
		aux.setProx(aux.getProx().getProx());
		return p.getElemento();
	}

	@Override
	public boolean insert(int pos, Object obj) {
		System.out.println("Para insercao deve ser usado *insertInOrder*");
		return false;
	}

	@Override
	public Object remove(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek(int pos) {

		PriorityNode aux = this.inicio;

		if (pos > size() - 1) {
			return null;
		} else {
			for (int i = 0; i < pos; i++) {
				aux = aux.getProx();
			}
			return aux.getElemento();
		}
	}

	@Override
	public void sort() {
		System.out.println(" Está Lista é por natureza ordenada! ");

	}

	@Override
	public void invert() {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {

		PriorityNode aux = this.inicio;
		int tamanho = 0;

		while (aux != null) {
			aux = aux.getProx();
			tamanho++;
		}

		return tamanho;
	}

	@Override
	public Lista getFirstHalf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lista getSecondHalf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0 ? false : true;
	}

	@Override
	public boolean contains(Object obj) {
		
		PriorityNode aux = this.inicio;
		
		while(aux != null) {
			if(aux.getElemento().equals(obj)) {
				return true;
			}
			aux = aux.getProx();
		}
		return false;
	}

	public boolean insertInOrder(Object elemento, int prioridade) {

		if (prioridade >= 1 && prioridade <= 10000) {

			PriorityNode aux = this.inicio;

			PriorityNode nova = new PriorityNode();

			nova.setElemento(elemento);
			nova.setPrioridade(prioridade);

			if (this.inicio == null) {
				this.inicio = nova;
				return true;
			} else if (this.inicio.getPrioridade() < nova.getPrioridade()) {
				nova.setProx(this.inicio);
				inicio = nova;
				return true;
			}

			else {
				PriorityNode p = aux.getProx();

				while (aux.getProx() != null) {
					if (aux.getPrioridade() < nova.getPrioridade()) {
						aux.setProx(nova);
						nova.setProx(p);
						return true;
					}
					aux = aux.getProx();
					p = p.getProx();
				}
				aux.setProx(nova);
			}

		}
		return true;
	}

	public void ler() {
		PriorityNode aux = this.inicio;
		while (aux != null) {
			System.out.print(" " + aux.getElemento() + "/" + aux.getPrioridade() + " ");
			aux = aux.getProx();
		}
	}

}
