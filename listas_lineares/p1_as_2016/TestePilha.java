public class TestePilha{
    public static void main(String[] args) {
	    Pilha teste = new Pilha(4, 1);
	    
	    teste.empilha(7);
	    teste.empilha(6);
	    teste.empilha(5);
	    teste.empilha(4);
		teste.empilha(3);
		teste.empilha(2);
		teste.empilha(1);
		
		System.out.println(teste.isEmpty()); //Momento em que NÂO está vazia
		
		while(!teste.isEmpty()) {
			int elemento = teste.desempilha();
			System.out.println("Desempilhei: " + elemento);
		}
		
		System.out.println(teste.isEmpty()); //Momento que está vazia

    }
}