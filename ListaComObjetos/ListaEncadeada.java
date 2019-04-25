
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
			inicio = nova; // Verifica se a lista tem mais de 1 elemento
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

			while (aux.getProximo() != null) {
				System.out.println(" " + aux.getElemento());
				aux = aux.getProximo();
			}

		}

	}

	@Override
	public Object get(int pos) {
		
		Celula aux = inicio;
		int cont = 0;
		
		if(size() < pos) {
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
		// TODO Auto-generated method stub
		return false;
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

		Celula aux = this.inicio;
		Celula posAux = aux.getProximo();
		int iteracao = 0;

		if (pos > size())
			return false; /// Posição inválida

		else {
			if (pos == 0) {
				this.inicio = aux.getProximo(); // se posicao buscada for 0
			}
			else {
				for(int i=0 ; i <= pos; i++) {
					aux = aux.getProximo();
					posAux = aux.getProximo();
					if(i == pos) {
						
					}
				}
				
			}

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
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
				tamanho++;
			}
			return tamanho;
		}
	}

}
