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

	//quando recebe uma oracao, um gato ﬁca em silencio, pois tem diﬁculdade de agradecer
	public void recebeOracao(){
		System.out.println(" ");
	}

}



	