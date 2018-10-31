public class Esportista extends Pessoa{

	private String esporteFavorito;

	public Esportista(String nome, String cpf, String esporteFavorito){
		super(nome, cpf);
		this.esporteFavorito = esporteFavorito;
	}

	public void setEsporteFavorito(String esporteFavorito){
		this.esporteFavorito = esporteFavorito;
	}

	public String getEsporteFavorito(){
		return esporteFavorito;
	}

	///METODOS DA INFERFACE
	public void fazOracao(){
		System.out.println(" no pain, no gain ");
	}
	public void recebeOracao(){
		System.out.println("Gratidão, torce por mim nas Olimpiadas ");
	}

}