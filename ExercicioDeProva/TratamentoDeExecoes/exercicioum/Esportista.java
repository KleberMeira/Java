package exercicioum;

public class Esportista extends Pessoa{

	private String nomeDoEsporte;

	public Esportista(String nome, String cpf, String nomeDoEsporte) {
		super(nome, cpf);
		this.nomeDoEsporte = nomeDoEsporte;
	}

	public String getNomeDoEsporte() {
		return nomeDoEsporte;
	}
	public void setNomeDoEsporte(String nomeDoEsporte) {
		this.nomeDoEsporte = nomeDoEsporte;
	}
	
	
	
	
}
