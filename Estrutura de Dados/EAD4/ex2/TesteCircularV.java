package pack2;

public class TesteCircularV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
	}

}
