
public class ListaCircular implements Lista {

	private No inicio;

	public ListaCircular() {
		this.inicio = null;
	}

	@Override
	public boolean insert(Object obj) {
		
		No nova = new No();
		nova.setElemento(obj);
		
		if(isEmpty()) {
			nova.setProximo(nova);
			nova.setAnterior(nova);
			inicio = nova;
			return true;
		}
		else {
			No aux = this.inicio;
			while(aux.getProximo() != inicio) {
				aux = aux.getProximo();
			}
			
			aux.setProximo(nova);
			nova.setAnterior(aux);
			nova.setProximo(inicio);
			inicio = nova;
			
			return true;
			
		}
		
		
	}

	@Override
	public Object remove() {

		if (isEmpty()) {
			return null;
		} else {

			No aux = this.inicio;
			No remove;
			while (aux.getProximo() != inicio) {
				aux = aux.getProximo();
			}
			remove = inicio;
			aux.setProximo(aux.getProximo().getProximo());
			inicio = inicio.getProximo();
			inicio.setAnterior(aux);
			return remove.getElemento();
		}

		
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
		
		No nova = new No();
		nova.setElemento(obj);

		if (pos > size()) {
			return false;
		} else if (pos == 0) {
			insert(obj);//Voltar p/verificar inserir na pos 0
			return true;
		} else {
			No p = this.inicio;
			No q = p.getProximo();

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

	@Override
	public Object remove(int pos) {

		No p = this.inicio;
		No q = p.getProximo();
		No aux;

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

	@Override
	public Object peek(int pos) {

		int buscar = 0;
		No aux = this.inicio;

		if (pos > size()) {
			return null;
		} else if (pos == 0) {
			return aux.getElemento();
		} else {

			for (int i = 0; i < pos; i++) {
				aux = aux.getProximo();
			}
		}

		return aux.getElemento();
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

	@Override
	public void invert() {

		No invert = this.inicio;
		while (invert.getAnterior() != inicio) {
			System.out.print(" " + invert.getElemento() + " ");
			invert = invert.getAnterior();
		}

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
		
		No original = this.inicio;
		int metade = (size()/2);
		ListaCircular nova1 = new ListaCircular();
		
		for(int i = 0; i <= metade; i++) {
			nova1.insertLast(original.getElemento());
			original = original.getProximo();
		}
		
		nova1.lerCircular();
		return null;
	}

	@Override
	public Lista getSecondHalf() {
		
		No original = this.inicio;
		int metade = (size()/2);
		ListaCircular nova2 = new ListaCircular();
		
		for(int i = 0; i <= metade; i++) {
			original = original.getProximo();
		}
		
		for(int j = metade; j < size(); j++) {
			nova2.insertLast(original.getElemento());
			original = original.getProximo();
		}
		
		nova2.lerCircular();
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		return (this.inicio == null);
	}

	@Override
	public boolean contains(Object obj) {

		No aux = this.inicio;

		for (int i = 0; i < size(); i++) {
			if (aux.getElemento().equals(obj)) {
				return true;
			}
			aux = aux.getProximo();
		}

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
