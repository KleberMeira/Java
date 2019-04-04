
public class Quadrado extends Retangulo {

	public Quadrado(int lado1, int lado2) {
		super(lado1, lado2);
		
		lados = new int[2];
		
		lados[0] = lado1;
		lados[1] = lado2;
		
		// TODO Auto-generated constructor stub
		
		
		
	}
	public Quadrado(int lado1) {
		super(lado1, lado1);
		// TODO Auto-generated constructor stub
	}
	
	public int calculaArea() {
		
		int area = lados[0] * lados[0];
		
		return area;
	}

}
