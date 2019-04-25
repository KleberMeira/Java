
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.inserir(34664);
		lista.inserir(2015);
		lista.inserir(45);
		lista.inserir(4554);
		lista.inserir(878);
		
		lista.listar();
		//System.out.println("Tamanho de: " + lista.size()); 
		//System.out.println(lista.isEmpty());
		System.out.println();
		lista.remove(2);
		
		lista.listar();
		
		System.out.println();

	
	}

}
