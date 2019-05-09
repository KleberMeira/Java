
public class ListaCircular implements Lista {

	private No inicio;

	public ListaCircular() {
		this.inicio = null;
	}

	@Override
	public boolean insert(Object obj) {

		return false;
	}

	@Override
	public Object remove() {

		if (isEmpty()) {
			return null;
		} else {

			No aux = this.inicio;
			while (aux.getProximo() != inicio) {
				aux = aux.getProximo();
			}
			
			aux.setProximo(aux.getProximo().getProximo());
			inicio = inicio.getProximo();
			inicio.setAnterior(aux);

		}

		return null;
	}

	@Override
	public boolean insertLast(Object obj) {

		No nova = new No();
		nova.setElemento(obj);

		if (isEmpty()) {
			nova.setProximo(nova);
			nova.setAnterior(nova);
			inicio = nova;
			return true;
		}

		else {
			No aux = this.inicio;

			while (aux.getProximo() != inicio) {
				aux = aux.getProximo();
			}

			inicio.setAnterior(nova);
			aux.setProximo(nova);
			nova.setAnterior(aux);
			nova.setProximo(inicio);
		}

		return true;
	}

	@Override
	public Object removeLast() {

		No aux = this.inicio;
		No remove = aux.getProximo();

		if (isEmpty()) {
			return null;
		} else {
			while (remove.getProximo() != inicio) {
				remove = remove.getProximo();
				aux = aux.getProximo();
			}

			inicio.setAnterior(aux);
			aux.setProximo(inicio);

		}

		return remove.getElemento();
	}

	@Override

	public boolean insert(int pos, Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

	@Override
	public void invert() {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		int tamanho = 1;

		if (isEmpty()) {
			return 0;
		} else {
			No cont = this.inicio;

			while (cont.getProximo() != inicio) {
				cont = cont.getProximo();
				tamanho++;
			}

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
		return (this.inicio == null);
	}

	@Override
	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public void lerCircular() {

		No tmp = inicio;

		do {
			System.out.println("Elemento da lista = " + tmp.getElemento());
			tmp = tmp.getProximo();
		} while (tmp != inicio);

	}

}
