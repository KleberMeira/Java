package p2lpoo201602;

public class Politicos extends OracaoPessoa implements Oracao {

	
	private double valorDePropina;
	
	public Politicos(String nome, String cpf, double valorDePropina) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}


	public double getValorDePropina() {
		return valorDePropina;
	}
	
	public void setValorDePropina(double valorDePropina) {
		this.valorDePropina = valorDePropina;
	}




	@Override
	public void fazOracao() {
		double valorAposOracao = getValorDePropina();
		valorAposOracao = valorAposOracao - 100;
		
	}

	@Override
	public void recebeOracao() {
		System.out.println(" Obrigado pela oração, VOTE EM MIM! ");
		
	}

	

}
