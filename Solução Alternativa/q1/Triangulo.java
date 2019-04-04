
public class Triangulo extends Figura {

	private String tipo;

	public Triangulo(int lado1, int lado2, int lado3) {

		lados = new int[3];

		if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
			this.tipo = "Equilátero";
		} else if (lado1 == lado2 && lado2 != lado3 || lado2 == lado3 && lado2 != lado1
				|| lado1 == lado3 && lado1 != lado2) {
			this.tipo = "Isósceles";
		} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			this.tipo = "Escaleno";
		}

	}

	//Teste para verificação do tipo
	public void imprime() {
		System.out.println(tipo);
	}

	@Override
	public void setLado(int lado, int valor) {

		if (lado < lados.length) {
			lados[lado] = valor;
		}

		else {
			System.out.println("Posição invalida");
		}

	}

	@Override
	public int getLado(int lado) {
		return lados[lado];
	}

}
