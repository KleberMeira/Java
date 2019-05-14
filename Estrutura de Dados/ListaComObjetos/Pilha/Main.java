
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilhaEncadeada pilha = new PilhaEncadeada();
		
		pilha.empilha(1);
		pilha.empilha(3);
		pilha.empilha(4);
		pilha.empilha(8);
		pilha.ler();
		System.out.println();
		System.out.println("Quantidade de Elementos: " + pilha.getQuant());
		System.out.println();
		
		System.out.println("Esta vazia? " + pilha.isEmpty());
		System.out.println("Elemento removido: " + pilha.desempilha());
		System.out.println("Elemento removido: " + pilha.desempilha());
		
		System.out.println();
		pilha.ler();
		
		System.out.println("Quantidade de Elementos: " + pilha.getQuant());
	
		
	
		
	}

}
