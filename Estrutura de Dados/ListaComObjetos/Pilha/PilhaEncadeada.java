
public class PilhaEncadeada implements Pilha {

	
	private Node topo;
	private int size;  //controle de pilha para as posicoes validas
	private int quant; //retornar a quantidade real de elementos
	
	public PilhaEncadeada() {
		this.topo = null;
		this.size = -1;
		this.quant = 0;
	}
		
	public int getQuant() {
		return quant;
	}

	@Override
	public boolean empilha(Object e) {
		
		Node nova = new Node();
		nova.setElemento(e);
		nova.setProximo(null);
		nova.setAnterior(null);
		
		if(this.topo == null) {
			this.topo = nova;
			size++; quant++;
			//System.out.println(topo.getElemento());
			return true;
		}
		else {
			
			topo.setProximo(nova);
			nova.setAnterior(topo);
			topo = nova;
			//System.out.println(topo.getElemento());
			size++; quant++;
			return true;
		}
		
	}

	@Override
	public Object desempilha() {
	
		if(isEmpty()) {
			return null;
		}
		else {
			
			Node aux = this.topo;
			this.topo = topo.getAnterior();
			size--; quant--;
			return aux.getElemento();
		}
		
	}


	@Override
	public boolean isEmpty() {
		
		if(size < 0) {
			return true;
		}
		
		return false;
	}
	
	public void ler() {
		
		Node aux = this.topo;
		while(aux != null) {
			System.out.println(aux.getElemento());
			aux = aux.getAnterior();
		}
		
	}

}
