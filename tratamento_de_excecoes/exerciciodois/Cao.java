package exerciciodois;

public class Cao extends Animal{

	private static int quantidadeDeMordida;

	public Cao(String raca, int idade, int quantidadeDeMordida) {
		super(raca, idade);
		this.quantidadeDeMordida = quantidadeDeMordida;
	}

	public static int getQuantidadeDeMordida() {
		return quantidadeDeMordida;
	}
	
	
	
	
	
	
}
