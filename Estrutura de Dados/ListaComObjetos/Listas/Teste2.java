
public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListaDePrioridades lista = new ListaDePrioridades();
		
		System.out.println(" ** Lista de Prioridades **");
		System.out.println();
		
		System.out.println("--Insere no comeco--");
		lista.insert(33);
		System.out.println();
		
		System.out.println("--Insere no final--");
		lista.insertLast(33);
		System.out.println();
		
		System.out.println("--Insere em uma posicao--");
		lista.insert(2, 33);
		System.out.println();
		
		//Voltar aqui, verificar ordem em 1 dos maiores
		System.out.println("--Usando o insertInOrder--");
		lista.insertInOrder(90, 10);
		lista.insertInOrder(53, 8);
		lista.insertInOrder(81, 5);
		lista.insertInOrder(92, 3);
		lista.insertInOrder(100, 100);
		lista.insertInOrder(100, 100);
	
		lista.ler();
		System.out.println();
		System.out.println();
		
		System.out.println("--Remove no comeco e retorna--");
		System.out.println("**Objeto removio: " + lista.remove());
		System.out.println("**Objeto removio: " + lista.remove());
		lista.ler();
		System.out.println();
		System.out.println();
		
		System.out.println("--Remove no final e retorna--");
		System.out.println("**Objeto removido: " + lista.removeLast());
		lista.ler();
		System.out.println();
		System.out.println();
		
		//Voltar aqui
		System.out.println("--Remove em uma posicao e retorna--");
		System.out.println("**Objeto da removido: " + lista.remove(1));
		lista.ler();
		System.out.println();
		System.out.println();
		
		
		System.out.println("--Retorna Object da posicao--");
		System.out.println("**Objeto da posicao: " + lista.peek(0));
		System.out.println("**Objeto da posicao: " + lista.peek(1));
		lista.ler();
		System.out.println();
		System.out.println();
		
		System.out.println("--Ordenar a Lista--");
		lista.sort();
		System.out.println();
		System.out.println();
		
		//Voltar aqui
		System.out.println("--Inverte Lista--");
		lista.invert();
		System.out.println();
		System.out.println();
		
		System.out.println("--Tamanho da Lista: " + lista.size());
		System.out.println();
		System.out.println();
		
		//Voltar aqui
		System.out.println("--Retorna Primeira Metade--");
		lista.getFirstHalf();
		System.out.println();
		System.out.println();
		
		//Voltar aqui
		System.out.println("--Retorna Primeira Metade--");
		lista.getSecondHalf();
		System.out.println();
		System.out.println();
		
		System.out.println("A lista est� vazia? :" + lista.isEmpty());
		System.out.println();
		System.out.println();
		
		System.out.println("--Verifica se contem um Objeto--");
		System.out.println("Contem? : " + lista.contains(81));
		System.out.println("Contem? : " + lista.contains(3));
		System.out.println();
		System.out.println();
		
		
		
				
		
	}

}
