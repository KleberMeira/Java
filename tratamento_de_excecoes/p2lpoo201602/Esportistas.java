package p2lpoo201602;

public class Esportistas extends OracaoPessoa implements Oracao {

	private String Esporte; //Esporte preferido
	
	public Esportistas(String nome, String cpf, String Esporte) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

		
	public String getEsporte() {
		return Esporte;
	}

	public void setEsporte(String esporte) {
		Esporte = esporte;
	}

	@Override
	public void fazOracao() {
		System.out.println(" no pain, no gain ");
		
	}

	@Override
	public void recebeOracao() {
		System.out.println(" GRATIDÂO, Torce para mim nas proximas olimpiadas");
		
	}

	
}
