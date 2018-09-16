package exerciciodois;

public class Politico extends Pessoa {
	
	private static double valorDaPropinaRecebida = 0;

	public Politico(String nome, String cpf ,double valorDaPropinaRecebida) {
		super(nome, cpf);
		this.valorDaPropinaRecebida = valorDaPropinaRecebida;
	}

	public double getValorDaPropinaRecebida() {
		return valorDaPropinaRecebida;
	}
	////////////////////////////////////////////////
	
	
	public double fazOracao() {
		return valorDaPropinaRecebida = -100;
	}
	
	public void recebeOracao()
	{
		System.out.println("GRATIDAO! ::VOTE EM MIM::: ");
	}
}
