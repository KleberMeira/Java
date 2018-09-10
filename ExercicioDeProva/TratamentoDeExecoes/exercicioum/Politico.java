package exercicioum;

public class Politico extends Pessoa {
	
	private double valorDaPropinaRecebida;

	public Politico(String nome, String cpf ,double valorDaPropinaRecebida) {
		super(nome, cpf);
		this.valorDaPropinaRecebida = valorDaPropinaRecebida;
	}

	public double getValorDaPropinaRecebida() {
		return valorDaPropinaRecebida;
	}
	////////////////////////////////////////////////
	
	
	public double fazOracao() {
		
		
		
		return 0;
	}
}
