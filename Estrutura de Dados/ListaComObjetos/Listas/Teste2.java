
public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		ListaDePrioridades lista = new ListaDePrioridades();
		
		System.out.println(" ** Lista de Prioridades **");
		System.out.println();
		lista.insertInOrder(90, 10);
		lista.insertInOrder(53, 8);
		lista.insertInOrder(81, 5);
		lista.insertInOrder(92, 3);
		lista.insertInOrder(100, 100);
		lista.insertInOrder(99, 10);
		lista.ler();
		*/
		
		ListaCircular cLista = new ListaCircular();
		
		cLista.insertLast(12);
		cLista.insertLast(14);
		cLista.insertLast(18);
		cLista.lerCircular();
		System.out.println();
		System.out.println("Tamanho: " + cLista.size());
		System.out.println("Está vazia? " + cLista.isEmpty());
		//System.out.println("Elemento removido: " + cLista.removeLast());
		System.out.println();
		cLista.lerCircular();
		System.out.println();
		cLista.remove();
		cLista.lerCircular();
		System.out.println();
		System.out.println(cLista.peek(1));
		System.out.println();
		cLista.invert();
		System.out.println();
		System.out.println("Contém? " + cLista.contains(18));
		System.out.println();
		cLista.insertLast(10);
		cLista.insertLast(29);
		cLista.insertLast(33);
		cLista.lerCircular();
		System.out.println();
		cLista.getFirstHalf();
		System.out.println();
		cLista.getSecondHalf();
		
	}

}
