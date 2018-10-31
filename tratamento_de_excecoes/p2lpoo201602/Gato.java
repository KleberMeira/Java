package p2lpoo201602;

public class Gato extends Animais implements Oracao {

	private String racaoFavorita;

	public Gato(String raca, int idade, String racaoFavorita) {
		super(raca, idade);
		// TODO Auto-generated constructor stub
	}

	public String getRacaoFavorita() {
		return racaoFavorita;
	}

	public void setRacaoFavorita(String racaoFavorita) {
		this.racaoFavorita = racaoFavorita;
	}

	@Override
	public void fazOracao() {
		// TODO Auto-generated method stub
		System.out.println(" Mi mi mi mi ");
	}

	@Override
	public void recebeOracao() {
		// TODO Auto-generated method stub
		System.out.print("  ");
	}
	
	
	
	
	
}
