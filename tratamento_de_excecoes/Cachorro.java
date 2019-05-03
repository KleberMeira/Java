public class Cachorro extends Animal implements Oracao{

	private int quantDeMordidas;

	public Cachorro(String raca, int idade, int quantDeMordidas){
		super(raca, idade);
		this.quantDeMordidas = quantDeMordidas;
	}

	public void setQuantDeMordidas(int quantDeMordidas){
		this.quantDeMordidas = quantDeMordidas;
	}

	public int getQuantDeMordidas(){
		return quantDeMordidas;
	}

	///METODO DA INTERFACE
	public void fazOracao(){
		System.out.println(" Au au au a" );
	}

	///quando recebe uma oracaoo, o cachorro tem uma de suas mordidas perdoadas
	public void recebeOracao(){
		int novaQuantMordidas = getQuantDeMordidas();
		novaQuantMordidas = novaQuantMordidas - 1;
	}

}