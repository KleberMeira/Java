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
		
		System.out.println("** LISTA SIMPLESMENTE ENCADEADA **");
		System.out.println();
		
		System.out.println("**** INSERSAO no inicio ****");
		lista.insert(9);
		lista.insert(4);
		lista.insert(2);
		lista.insert(3);
		lista.insert(7);
		lista.listar();
	
		System.out.println();
		System.out.println();
		
		System.out.println("**** REMOVE no inicio ****");
		System.out.println("Elemento removido: " + lista.remove());
		System.out.println("Elemento removido: " + lista.remove());
		lista.listar();
		
		System.out.println();
		System.out.println();
		
		System.out.println("**** INSERE no final ****");
		lista.insertLast(10);
		lista.insertLast(13);
		lista.listar();
		
		System.out.println();
		System.out.println();
		
		System.out.println("**** REMOVE no final ****");
		System.out.println("Elemento removido: " + lista.removeLast());
		System.out.println("Elemento removido: " + lista.removeLast());
		lista.listar();
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("**** INSERE por parametro um objeto ****");
		
		lista.insert(1, 99);
		lista.insert(0, 5);//verificar pq esta comecando da pos 1 ao inves da 0
		
		lista.listar();
		
		System.out.println();
		System.out.println();
		
		System.out.println("**** REMOVE por uma posicao ****");
		
		System.out.println("Elemento removido: " + lista.remove(0));
		lista.listar();
		System.out.println();
		
		System.out.println("Elemento removido: " + lista.remove(2));
		lista.listar();
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("**** ORDENA a Lista ****");
		lista.sort();
		
		System.out.println();
		System.out.println();
		
		System.out.println("*** INVERTE a Lista *****");
		
		System.out.println();
		System.out.println();
		
		System.out.println("**** RETORNO da primeira metade ");
		System.out.println("**Lista Original**");
		lista.listar();
		System.out.println();

		System.out.println("Primeira metade da lista: ");
		lista.getFirstHalf();
		
		
		System.out.println();
		System.out.println();
		System.out.println("**** RETORNO da seguda metade ");
		System.out.println("**Lista Original**");
		lista.listar();
		System.out.println();
		
		System.out.println("Segunda metade da lista");
		lista.getSecondHalf();
		System.out.println();
		
		
		
		System.out.println("*******************");
		System.out.println("*******************");
		System.out.println("*******************");
		System.out.println("*******************");
	
		System.out.println();
		System.out.println("** LISTA DUPLAMENTE ENCADEADA **");
		
		ListaDuplamenteEncadeada ld = new ListaDuplamenteEncadeada();
		System.out.println("**** INSERSAO no inicio ****");
		ld.insert(3);
		ld.insert(4);
		ld.insert(1);
		ld.insert(19);
		ld.ler();

		
		System.out.println();
		System.out.println();
		System.out.println("**** REMOVE no inicio ****");
		ld.remove();
		ld.remove();
		ld.ler();
		
		System.out.println();
		System.out.println();
		System.out.println("**** INSERSAO no final ****");
		ld.insertLast(100);
		ld.insertLast(99);
		ld.insertLast(1000000);
		ld.ler();
		
		
		System.out.println();
		ld.removeLast();
		ld.ler();
		
		
		System.out.println();
		System.out.println();
		System.out.println("**** INSERSAO pela posicao ****");
		ld.insert(4, 30);
		ld.ler();
		
		System.out.println();
		System.out.println();
		System.out.println("**** REMOVE por indice ****");
		System.out.println("Elemento removido: "+ ld.remove(2));
		ld.ler();
		
		System.out.println();
		System.out.println();
		System.out.println("**** BUSCA por indice ****");
		System.out.println("Elemento buscado: " + ld.peek(0));
		System.out.println("Elemento buscado: " + ld.peek(2));
		
		
		System.out.println();
		System.out.println();
		System.out.println("**** INVERTE a lista");
		ld.ler();
		System.out.println();
		ld.invert();
		
		
		System.out.println();
		System.out.println();
		System.out.println("**** RETORNA tamanho ****");
		System.out.println("Tamanho: " + ld.size());
		
		
		System.out.println();
		System.out.println();
		System.out.println("**** VERIFICA se esta vazia ****");
		System.out.println(ld.isEmpty());
		
		System.out.println();
		System.out.println();
		System.out.println("Elemento existe: " + ld.contains(2));
		System.out.println("Elemento existe: " + ld.contains(3));
		ld.ler();
		
		System.out.println();
		System.out.println();
		System.out.println("**** RETORNO da primeira metade ");
		System.out.println("**Lista Original**");
		ld.ler();
		System.out.println();

		System.out.println("Primeira metade da lista: ");
		ld.getFirstHalf();
		
		
		System.out.println();
		System.out.println();
		System.out.println("**** RETORNO da seguda metade ");
		System.out.println("**Lista Original**");
		ld.ler();
		System.out.println();

		System.out.println("Segunda metade da lista: ");
		ld.getSecondHalf();
		
		
		
	}

}
