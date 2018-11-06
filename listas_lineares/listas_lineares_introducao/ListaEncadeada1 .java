public class ListaEncadeada1 implements ListaEncadeada {

	
	private Celula p;
	
	public ListaEncadeada1() {
		this.p = null;
	}
	
	

	public Celula getP() {
		return p;
	}

	public void setP(Celula p) {
		this.p = p;
	}


	@Override
	public void add(int e) {
		// TODO Auto-generated method stub
		Celula nova = new Celula();
		nova.setChave(e);
		nova.setProx(null);
		
		if(p == null) {
			p = nova;
		}
		else {
			Celula aux;
			aux = p;
			while(aux.getProx() != null) {
				aux = aux.getProx();
			}
			aux.setProx(nova);
		}
			
	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		if(p == null) 
			System.out.println("A lista está vazia");
			
		else {
			Celula aux = p;
			while(aux != null) {
				System.out.println("Elementos: " + aux.getChave());
				aux = aux.getProx();
		}
			
		}
		
	}

	public boolean isEmpty() {
		return this.p == null;
	}

	

}