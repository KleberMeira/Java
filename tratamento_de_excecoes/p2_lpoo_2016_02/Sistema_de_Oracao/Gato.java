public class Gato extends Animal implements Oracao{


	private String racaoFavorita;

	public Gato(String raca, int idade, String racaoFavorita){
		super(raca, idade);
		this.racaoFavorita = racaoFavorita;
	}


	public void setRacaoFavorita(String racaoFavorita){
		this.racaoFavorita = racaoFavorita;
	}

	public String getRacaoFavorita(){
		return racaoFavorita;
	}

	///METODO DA INTERFACE
	public void fazOracao(){
		System.out.println(" Mi mi mi mi ");
	}

	///O gato fica em silencio pois tem dificuldade de agradescer
	public void recebeOracao(){
		System.out.println(" estou quieto ");
	}

}



	