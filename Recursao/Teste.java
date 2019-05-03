package recursao;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BuscaRecursivaBinaria busca = new BuscaRecursivaBinaria();
		Fibonacci fib = new Fibonacci();
		
		int[] vetor = {1, 2, 3 ,4, 5, 6, 7, 8, 9, 10 } ;

		int numero = 5;
		
		System.out.println(busca.buscaBinaria(vetor, numero, 0, vetor.length-1));
		
		
		//System.out.println(fib.Fib(6));
		
	}

}
