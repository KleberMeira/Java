
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pilha pilha = new Pilha();
		
		//String nome, int idade, String cpf
		Pessoa p1 = new Pessoa("Kleber", 18, "157.584.156-03");
		Pessoa p2 = new Pessoa("Joao", 20, "484.417.556-04");
		Pessoa p3 = new Pessoa("Carol", 20, "008.715.789-11");
		
		pilha.empilha(p1);
		pilha.empilha(p2);
		pilha.empilha(p3);
		
		System.out.println("Esta vazia? " + pilha.isEmpty());
		System.out.println("Quantos elementos tem? " + pilha.getTamanho());
		
	
	
		
	}

}
