
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Triangulo t = new Triangulo(1, 1, 1);
		Retangulo r = new Retangulo(2, 3); //base * altura
		Quadrado q = new Quadrado(2, 2);
		
		/*
		System.out.print("Tipo do Triangulo: ");
		t.imprime();
		*/
		
		System.out.println("Area Retangulo: " + r.calculaArea());
		System.out.println("Area Quadrado: " +q.calculaArea());
		
		
		
	}

}
