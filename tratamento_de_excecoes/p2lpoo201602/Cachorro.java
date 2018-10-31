package p2lpoo201602;

public class Cachorro extends Animais implements Oracao{

	private int quantMordidas;

	public Cachorro(String raca, int idade, int quantMordidas) {
		super(raca, idade);
		// TODO Auto-generated constructor stub
	}

	public int getQuantMordidas() {
		return quantMordidas;
	}

	public void setQuantMordidas(int quantMordidas) {
		this.quantMordidas = quantMordidas;
	}

	@Override
	public void fazOracao() {
		// TODO Auto-generated method stub
		System.out.println("Au au au au");
		
	}

	@Override
	public void recebeOracao() {
		// TODO Auto-generated method stub
		int quantidadeDeMordidas = getQuantMordidas();
		quantidadeDeMordidas = quantidadeDeMordidas -1; 
	}
	
	
	
}
