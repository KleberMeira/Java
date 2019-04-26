
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListaEncadeada lista = new ListaEncadeada();
		
		System.out.println("**Lista Original**");
		//Insere no fim da lista
		lista.add(13);
		lista.add(12);
		lista.add(10);
		lista.add(20);
		lista.listar();
		
		System.out.println();
		
		System.out.println("***Aqui REMOVE um elemento em uma posicao especifica***");
		lista.remove(2);
		lista.listar();
		
		System.out.println();

		System.out.println("***Aqui INSERE um elemento em uma posicao especifica***");
		lista.add(2, 100);
		lista.listar();
		
		System.out.println();
		System.out.println("***QUANTIDADE de elementos***");
		System.out.println(lista.size());
		
		System.out.println();
		System.out.println("***Aqui RETORNA o ELEMENTO do MEIO");
		System.out.println(lista.retornaCentral());
		

	
	}

}
