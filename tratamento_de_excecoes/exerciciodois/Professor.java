package exerciciodois;

public class Professor extends Pessoa{
	
	private static double valorDevendoAoBanco;

	public Professor(String nome, String cpf ,double valorDevendoAoBanco) {
		super(nome, cpf);
		this.valorDevendoAoBanco = valorDevendoAoBanco;
	}

	
	public double getValorDevendoAoBanco() {
		return valorDevendoAoBanco;
	}
	
	////////É FEITO O CALCULO DE DESCONTO 10% SOBRE O valorDevendoAoBancoAtual
	public double fazOracao() {
		double calcDesconto = valorDevendoAoBanco;
		calcDesconto = (calcDesconto * 30)/100; 
		return valorDevendoAoBanco = valorDevendoAoBanco - calcDesconto;
		 
	}
	//////// RECEBE UM DESCONTO DE 250 SOBRE A DIVIDA valorDevendoAoBanco
	public double recebeOracao()
	{
		return valorDevendoAoBanco = valorDevendoAoBanco - 250;
	}
	
	
	

}
