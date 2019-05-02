import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 *********Campo Grande/MS******************
 * Curso: Engenharia de Software UFMS/FACOM
 * Autor: Kleber Meira Lima
 * 
 */

public class Teste {

	public static void main(String[] args) {

		/*
		 * ListaEncadeada lista = new ListaEncadeada();
		 * 
		 * System.out.println("******LISTA SIMPLES******"); System.out.println();
		 * 
		 * 
		 * //Insere no comeco System.out.println("***  Insere no Comeco");
		 * lista.insertLast(5); lista.insertLast(15); lista.insertLast(150);
		 * lista.insertLast(1500);
		 * 
		 * lista.listar(); System.out.println();
		 * 
		 * //lista.insert(3, 6); lista.listar(); System.out.println();
		 * //System.out.println("Elemento " + lista.remove(1) +
		 * " removido pelo indice");
		 * //System.out.println("Elemento buscado pelo indice eh: " + lista.peek(3));
		 * 
		 * //System.out.println(lista.contains(3));
		 * 
		 * lista.invert();
		 * 
		 * System.out.println("***  Insere no Final"); //Insere no Final
		 * lista.insertLast(15); lista.insertLast(30); lista.insertLast(12);
		 * lista.insertLast(11); lista.insertLast(14); lista.insertLast(100);
		 * 
		 * lista.remove(4); lista.remove(4); lista.remove(0);
		 * 
		 * lista.listar();
		 * 
		 * System.out.println();
		 * 
		 * //System.out.println("*** Tamanho da Lista: " + lista.size());
		 * //System.out.println("*** A lista esta vazia? "+lista.isEmpty());
		 */
	
		//LISTA DUPLAMENTE ENCADEADA
		ListaDuplamenteEncadeada ld = new ListaDuplamenteEncadeada();
		
		System.out.println("**Insercao no inicio**");
		ld.insert(2);
		ld.insert(3);
		ld.insert(100);
		ld.insert(3);
		ld.ler();
		
		System.out.println();
		System.out.println();
		System.out.println("**Remorcao no inicio**");
		
		System.out.println(" Elemento removido: " + ld.remove());
		System.out.println(" Elemento removido: " + ld.remove());
		ld.ler();
		
		System.out.println();
		System.out.println("**Insercao no final da lista**");
		ld.insertLast(19);
		ld.insertLast(20);
		ld.ler();
		
		System.out.println();
		System.out.println("**Remocao no final da lista**");

		System.out.println();
		
		System.out.println("**Insercao por parametro**");
		ld.insert(0, 100);
		ld.insert(2, 1000);
		ld.insert(5, 10000);
		ld.ler();
		
		System.out.println();
		System.out.println("**Remocao por parametro**");
		System.out.println("Lista original");
		ld.ler();
		ld.remove(0);
		ld.remove(3);
		ld.ler();
		

		
		
	}

}
