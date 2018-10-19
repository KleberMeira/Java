package ListasLineares;

public class ListaLinearInfinitaEncadeada implements ListaLinearInfinita {

	private CelulaSimples cabeca;
	private int length;
	
	public ListaLinearInfinitaEncadeada() {
		this.cabeca = new CelulaSimples();
		this.length = 0;
	}
	
	public CelulaSimples getCabeca() {
		return cabeca;
	}


	@Override
	public void add(int e) {
		// TODO Auto-generated method stub
			}

	@Override
	public void add(int index, int elemento) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		CelulaSimples nova = cabeca;
		CelulaSimples aux = cabeca;
		int cont = 0;
		while(aux != null) {
			aux.getProx();
			if(cont == index) {
				nova.setChave(elemento);
			}
			else
				cont++;
			
		}
		
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
		return 0;
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
