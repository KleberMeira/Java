
public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		
		
	}

}
