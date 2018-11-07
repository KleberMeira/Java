public class ListaDuplamenteEncadeada implements metodosList{

	private CelulaDupla cabeca;
	private CelulaDupla fim;
	

	public ListaDuplamenteEncadeada() {

		this.cabeca = new CelulaDupla();
		fim = cabeca;
	}
	
	
	public CelulaDupla getCabeca() {
		return cabeca;
	}
	public void setCabeca(CelulaDupla cabeca) {
		this.cabeca = cabeca;
	}
	public CelulaDupla getFim() {
		return fim;
	}
	public void setFim(CelulaDupla fim) {
		this.fim = fim;
	}

	////INTERFACE
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
	public boolean equals(metodosList lista) {
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
	////INTERFACE
	
	

	

	
	
	
}
