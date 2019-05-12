
/*
 *********Campo Grande/MS******************
 * Curso: Engenharia de Software UFMS/FACOM
 * Autor: Kleber Meira 
 * 
 */

public class TesteListas {

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
		lista.insert(0, 5);// verificar pq esta comecando da pos 1 ao inves da 0

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
		System.out.println("Elemento removido: " + ld.remove(2));
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

		System.out.println("*******************");
		System.out.println("*******************");
		System.out.println("*******************");
		System.out.println("*******************");

		System.out.println("** LISTA DE PRIORIDADES **");

		ListaDePrioridades pLista = new ListaDePrioridades();

		System.out.println(" ** Lista de Prioridades **");
		System.out.println();

		System.out.println("--Insere no comeco--");
		pLista.insert(33);
		System.out.println();

		System.out.println("--Insere no final--");
		pLista.insertLast(33);
		System.out.println();

		System.out.println("--Insere em uma posicao--");
		pLista.insert(2, 33);
		System.out.println();

		// Voltar aqui, verificar ordem em 1 dos maiores
		System.out.println("--Usando o insertInOrder--");
		pLista.insertInOrder(90, 10);
		pLista.insertInOrder(53, 8);
		pLista.insertInOrder(81, 5);
		pLista.insertInOrder(92, 3);
		pLista.insertInOrder(100, 100);
		pLista.insertInOrder(100, 100);

		pLista.ler();
		System.out.println();
		System.out.println();

		System.out.println("--Remove no comeco e retorna--");
		System.out.println("**Objeto removio: " + pLista.remove());
		System.out.println("**Objeto removio: " + pLista.remove());
		pLista.ler();
		System.out.println();
		System.out.println();

		System.out.println("--Remove no final e retorna--");
		System.out.println("**Objeto removido: " + pLista.removeLast());
		pLista.ler();
		System.out.println();
		System.out.println();

		// Voltar aqui
		System.out.println("--Remove em uma posicao e retorna--");
		System.out.println("**Objeto da removido: " + pLista.remove(1));
		pLista.ler();
		System.out.println();
		System.out.println();

		System.out.println("--Retorna Object da posicao--");
		System.out.println("**Objeto da posicao: " + pLista.peek(0));
		System.out.println("**Objeto da posicao: " + pLista.peek(1));
		pLista.ler();
		System.out.println();
		System.out.println();

		System.out.println("--Ordenar a Lista--");
		pLista.sort();
		System.out.println();
		System.out.println();

		// Voltar aqui
		System.out.println("--Inverte Lista--");
		pLista.invert();
		System.out.println();
		System.out.println();

		System.out.println("--Tamanho da Lista: " + pLista.size());
		System.out.println();
		System.out.println();

		// Voltar aqui
		System.out.println("--Retorna Primeira Metade--");
		pLista.getFirstHalf();
		System.out.println();
		System.out.println();

		// Voltar aqui
		System.out.println("--Retorna Primeira Metade--");
		pLista.getSecondHalf();
		System.out.println();
		System.out.println();

		System.out.println("A lista esta vazia? :" + pLista.isEmpty());
		System.out.println();
		System.out.println();

		System.out.println("--Verifica se contem um Objeto--");
		System.out.println("Contem? : " + pLista.contains(81));
		System.out.println("Contem? : " + pLista.contains(3));
		System.out.println();
		System.out.println();

		System.out.println("*******************");
		System.out.println("*******************");
		System.out.println("*******************");
		System.out.println("*******************");

		System.out.println("** LISTA CIRCULAR **");

		ListaCircular cLista = new ListaCircular();

		System.out.println("**Lista Circular**");
		System.out.println();

		System.out.println("--Insere no Comeco--");
		cLista.insert(20);
		cLista.insert(18);
		cLista.insert(22);
		cLista.insert(40);
		cLista.insert(19);
		cLista.lerCircular();
		System.out.println();

		System.out.println("--Remove no Comeco--");
		System.out.println("**Objeto removido: " + cLista.remove());
		System.out.println("**Objeto removido: " + cLista.remove());
		cLista.lerCircular();

		System.out.println();

		System.out.println("--Insere no Final--");
		cLista.insertLast(21);
		cLista.insertLast(29);
		cLista.insertLast(23);
		cLista.insertLast(31);
		cLista.lerCircular();
		System.out.println();

		System.out.println("--Remove no Final--");
		System.out.println("**Objeto removido: " + cLista.removeLast());
		System.out.println("**Objeto removido: " + cLista.removeLast());
		cLista.lerCircular();
		System.out.println();

		System.out.println("--Insere em uma posicao--");
		cLista.insert(0, 99);
		cLista.insert(2, 100);
		cLista.lerCircular();
		System.out.println();

		System.out.println("--Remove em uma posicao e retorna--");
		System.out.println("**Objeto removido: " + cLista.remove(0));
		System.out.println("**Objeto removido: " + cLista.remove(2));
		cLista.lerCircular();
		System.out.println();

		System.out.println("--Retorna Objeto da posicao--");
		System.out.println("**Objeto da posicao: " + cLista.peek(0));
		System.out.println("**Objeto da posicao: " + cLista.peek(4));
		cLista.lerCircular();
		System.out.println();

		System.out.println("--Ordena a Lista--");
		cLista.sort();
		System.out.println();

		System.out.println("--Inverte Lista--");
		// cLista.invert();
		System.out.println();

		System.out.println("--Tamanho da Lista: " + cLista.size());
		System.out.println();

		System.out.println("--Retorna Primera metade da Lista--");
		cLista.getFirstHalf();
		System.out.println();

		System.out.println("--Retorna Segunda metade da Lista--");
		cLista.getSecondHalf();
		System.out.println();

		System.out.println("--A lista está vazia ?" + cLista.isEmpty());
		System.out.println();

		System.out.println("--Verifica se contém o Objeto na Lista--");
		System.out.println("Contém? : " + cLista.contains(99));
		System.out.println("Contém? : " + cLista.contains(13));
		System.out.println();

	}

}
