public class TestePilha{
    public static void main(String[] args) {
    
        Pilha teste = new Pilha(4, 1);
		teste.empilha(3);
		teste.empilha(2);
		teste.empilha(1);
		
		while(!teste.isEmpty()) {
			int elemento = teste.desempilha();
			System.out.println("Desempilhei: " + elemento);
		}

    }
}