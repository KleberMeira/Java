
public class Teste3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		System.out.println("**Objeto removido: " + cLista.removeLast() );
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
		//cLista.invert();
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
