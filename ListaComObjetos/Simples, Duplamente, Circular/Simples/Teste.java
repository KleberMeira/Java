import javax.swing.plaf.synth.SynthSeparatorUI;

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
		lista.insertLast(15);
		lista.insertLast(150);
		lista.insertLast(1500);

		lista.listar();
		System.out.println();
		
		lista.insert(3, 6);
		lista.listar();
		System.out.println();
		//System.out.println("Elemento " + lista.remove(1) + " removido pelo indice");
		//System.out.println("Elemento buscado pelo indice eh: " + lista.peek(3));
		
		System.out.println(lista.contains(3));
	
		
		
		
		
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
