package recursao;

public class Fibonacci {

	
	public long Fib(int n) {

		//retorna n para caso == a 0 e 1
		if(n == 0 || n == 1) {
			return n;
		}
		
		else {
			return Fib(n - 1) + Fib(n - 2);
		}
		
	}
	
}
