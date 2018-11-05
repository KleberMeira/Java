public class ListaEncadeada1 implements ListaEncadeada {

	private Celula p;
	

	public ListaEncadeada1() {
		this.p = new Celula();
	}

	public Celula getP() {
		return p;
	}

	
	@Override
	public void add(int e) {
		// TODO Auto-generated method stub
		Celula aux = p;
		Celula nova = new Celula();
				
		nova.setChave(e);
		p.setProx(nova);

	}

	@Override
	public void ler() {
		// TODO Auto-generated method stub
		for()
		
	}