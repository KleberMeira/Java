package recursividade;

public class Test {

	public static void main(String[] args) {
		
		Boom boom = new Boom();
		MDC mdc = new MDC();
		
		boom.boom(5); // imprime a sequencia dos numeros menores > 0
		
		System.out.println();
		System.out.println(mdc.mdc(10, 11));
		
		
	}
}
