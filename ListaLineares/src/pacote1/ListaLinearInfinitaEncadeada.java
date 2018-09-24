package pacote1;

public class ListaLinearInfinitaEncadeada implements ListaLinearInfinita{

	private Celula cabeca;
	
	@Override
	public void add(int e) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void add(int index, int elemento) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contains(int elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean equals(ListaLinearInfinita lista) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		Celula aux = cabeca;
		int auxIndex = 0;
		
		while(aux.getProx() != null && auxIndex != index) {
			aux = aux.getProx();
			auxIndex++;
		}
		return aux.getChave();
	}

	@Override
	public boolean remove(int elemento) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int set(int posicao, int elemento) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
