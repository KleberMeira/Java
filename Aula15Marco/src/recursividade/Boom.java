package recursividade;

public class Boom {

	public void boom(int x) {
		
		if(x > 0) {
			System.out.print(x + " ");
			boom(x-1);
		}
		
		if(x == 0) {
			System.out.print(" boom!");
		}
		
	}
	
}
