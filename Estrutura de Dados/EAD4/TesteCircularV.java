
public class TesteCircularV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//FILA EM VETOR
		CircularArrayQueue e = new CircularArrayQueue();
		System.out.println("Lista vazia? " + e.isEmpty());
		System.out.println(e.enqueue(12));
		System.out.println(e.enqueue(13));
		System.out.println(e.enqueue(14));
		System.out.println("Lista vazia? " + e.isEmpty());
		System.out.println(e.enqueue(15));
		System.out.println(e.enqueue(16));
		System.out.println("Tamanho: " + e.size());
		System.out.println(e.enqueue(160));
		System.out.println(e.dequeue());
		System.out.println(e.dequeue());
		System.out.println(e.dequeue());
		System.out.println(e.enqueue(160));
		
		System.out.println("Elemento do Inicio: " + e.peek());
		
		System.out.println("Tamanho: " + e.size());
		
		System.out.println("Finalizado");
		*/
		
		/*
		//FILA ENCADEADA
		LinkedQueue lk = new LinkedQueue();
		lk.enqueue(1);
		lk.enqueue(2);
		lk.enqueue(3);
		
		lk.mostrar();
		
		
		System.out.println("Removido: "+ lk.dequeue());
		
		System.out.println("Elemento do inicio: " + lk.peek());
		
		lk.mostrar();
		System.out.println("Esta vazia? " + lk.isEmpty());
		System.out.println("Tamanho: " + lk.size());
		*/
		
		//DEQUE QUEUE
		LinkedDeque d = new LinkedDeque();
		
		d.insertLeft(1);
		d.insertLeft(2);
		d.insertLeft(3);
		d.imprime();
		
		d.insertRight(4);
		d.insertRight(5);
		d.insertRight(6);
		d.imprime();
		
		d.removeLeft();
		d.imprime();
		
		d.removeRight();
		d.imprime();
		
		
		
		
		
		
	
	}
	
	
	
	
	

}
