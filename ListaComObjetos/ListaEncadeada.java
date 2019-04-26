
public class ListaEncadeada implements Lista {

	private Celula inicio;

	public ListaEncadeada() {
		this.inicio = null;
	}

	public void inserir(int elemento) {

		Celula nova = new Celula(elemento);
		// nova.setElemento(elemento);
		nova.setProximo(null);

		if (inicio == null) {
			inicio = nova; //Inserio o primeirpo elemento da lista
		} else {
			Celula aux;
			aux = inicio;

			while (aux.getProximo() != null) {
				aux = aux.getProximo(); // Percorre a lista a adciona ao final
			}
			aux.setProximo(nova); // Seta a ultima celula para a nova e a nova p/null
		}
	}

	public void listar() {

		if (inicio == null) {
			System.out.println("Vazia");
		} else {
			Celula aux;
			aux = inicio;

			while (aux != null) {
				System.out.print(" " + aux.getElemento() + " ");
				aux = aux.getProximo();
			}

		}

	}

	@Override
	public Object get(int pos) {
		
		Celula aux = inicio;
		int cont = 0;
		
		if(pos <= size()) {
			return null;
		}
		else {
			while(aux.getProximo() != null) {
				if(cont == pos) {
					return aux;
				}
				cont++;
				aux = aux.getProximo();
			}
		}
		return aux;
	}

	@Override
	public boolean add(int pos, Object item) {
		
		Celula p = this.inicio;
		Celula q = p.getProximo();
		Celula nova = new Celula(item);
		
		for(int i = 0; i < pos-1; i++) {
			p = p.getProximo();
			q = q.getProximo();
		}
		
		p.setProximo(nova);
		nova.setProximo(q);
		
		return true;
	}

	@Override
	public boolean add(Object item) {

		Celula nova = new Celula(item);
		nova.setProximo(null);

		if (inicio == null) {
			inicio = nova;
			return true;
		} else {
			Celula aux = inicio;

			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}

			aux.setProximo(nova);

		}
		return true;
	}

	@Override
	public boolean remove(int pos) {

		Celula p = this.inicio;
		Celula q = p.getProximo();
		int iteracao = 1;

		if (pos > size())
			return false; /// Posição inválida

		
			if (pos == 0) {
				this.inicio = p.getProximo(); // se posicao buscada for 0
			}
			else {
				for(int i = 0; i < pos-1; i++) {
					
					p = p.getProximo();//Percorre até a posicao (pos)
					q = q.getProximo();
			
				}
					//Aqui ele está parado uma posicao antes e assim removemos o proximo
					//desta posicao
					p.setProximo(p.getProximo().getProximo());

				}

			return true;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0 ? true : false; // se size == 0 lista vazia
	}

	@Override
	public int size() {

		if (inicio == null) {
			return 0;
		}

		else {
			Celula aux = inicio;
			int tamanho = 0;
			while (aux != null) {
				//Aux.getProximo() deixa para tras um elemento pois já comeca na frente de um
				//já apenas aux pega todos os elementos possiveis e para quando encontra o null
				aux = aux.getProximo();
				tamanho++;
			}
			return tamanho;
		}
	}
	
	public Object retornaCentral () {
		
		Celula aux = this.inicio;
		int meio = (size()/2);
		
		for(int i = 0; i < meio; i++) {
			aux = aux.getProximo();
		}
		return aux.getElemento();
	}

	public void trocarElementos (int pos1, int pos2) {
		
	}
	
	
}
