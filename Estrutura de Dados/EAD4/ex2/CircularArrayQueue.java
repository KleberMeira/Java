package pack2;

public class CircularArrayQueue implements Queue {

	private int tamanho;
	private int ini, fim;
	private Object[] vetor;
	
	public CircularArrayQueue() {
		this.vetor = new Object[5];
		this.ini = 0;
		this.fim = 0;
		this.tamanho = 0;
	}
	
	
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getIni() {
		return ini;
	}
	public void setIni(int ini) {
		this.ini = ini;
	}
	public int getFim() {
		return fim;
	}
	public void setFim(int fim) {
		this.fim = fim;
	}
	public Object[] getVetor() {
		return vetor;
	}
	public void setVetor(Object[] vetor) {
		this.vetor = vetor;
	}


	@Override
	public boolean enqueue(Object value) {
		
		if(tamanho == vetor.length) {
			System.out.println("Fila cheia");
			return false;
		}
		
		this.vetor[fim] = value;
		fim = (fim+1) % vetor.length;
		tamanho++;
		return true;
	
	}

	@Override
	public Object dequeue() {
		
		Object elemento = this.vetor[ini];
		
		ini = (ini+1) % vetor.length;
		tamanho--;
		
		return elemento;
	}

	@Override
	public Object peek() {
		
		Object elemento = this.vetor[ini];
		
		return elemento;
	}

	@Override
	public boolean isEmpty() {
		
		if(tamanho == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.tamanho;
	}

}
