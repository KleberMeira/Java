
public class Retangulo extends Figura {

	public Retangulo(int lado1, int lado2) {
		// TODO Auto-generated constructor stub

		lados = new int[2];

		lados[0] = lado1;
		lados[1] = lado2;

	}

	public int calculaArea() {

		int area = lados[0] * lados[1];

		return area;
	}

	@Override
	public void setLado(int lado, int valor) {
		
		if(lado > lados.length) {
			lados[lado] = valor;
		}
		else
			System.out.println("Posição inválida");
		

	}

	@Override
	public int getLado(int lado) {
		return lados[lado];
	}

}
