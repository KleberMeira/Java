
/*
 *********Campo Grande/MS******************
 * Curso: Engenharia de Software UFMS/FACOM
 * Autor: Kleber Meira Lima
 * 
 */

public class Teste {

	public static void main(String[] args) {

		ListaEncadeada lista = new ListaEncadeada();
		
		System.out.println("******LISTA SIMPLES******");
		System.out.println();
		
		
		//Insere no comeco
		System.out.println("***  Insere no Comeco");
		lista.insertLast(5);
		lista.insertLast(50);
		lista.insertLast(500);
		lista.remove();
		lista.listar();
		
		
		
		/*
		System.out.println("***  Insere no Final");
		//Insere no Final
		lista.insertLast(15);
		lista.insertLast(30);
		lista.insertLast(12);
		lista.insertLast(11);
		lista.insertLast(14);
		lista.insertLast(100);

		lista.remove(4);
		lista.remove(4);
		lista.remove(0);

		lista.listar();
		
		System.out.println();
		*/
		
		
		//System.out.println("*** Tamanho da Lista: " + lista.size());
		//System.out.println("*** A lista esta vazia? "+lista.isEmpty());
		

	}

}
