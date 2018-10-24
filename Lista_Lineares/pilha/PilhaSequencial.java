package pilha;


///USANDO TIPOS GENERICOS
public class PilhaSequencial<T> implements Pilha<T> {
	private int topo;
	private Object[] vetor; ///USANDO TIPOS GENERICOS
	
	public PilhaSequencial() {
		topo = 0;
		vetor = new Object[50];
	}
	
	@Override
	public void empilha(T elemento) {
		// TODO Auto-generated method stub
		vetor[topo] = elemento;
		topo++;
		if(topo == vetor.length)
			redimencionaVetor();
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T desempilha() {
		topo--;
		// TODO Auto-generated method stub
		return (T)vetor[topo];
	}
	
	public void redimencionaVetor() {
		
	}
	
	
	
}
