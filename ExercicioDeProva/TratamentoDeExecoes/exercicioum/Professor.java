package exercicioum;

public class Professor extends Pessoa{
	
	private double valorDevendoAoBanco;

	public Professor(String nome, String cpf ,double valorDevendoAoBanco) {
		super(nome, cpf);
		this.valorDevendoAoBanco = valorDevendoAoBanco;
	}

	
	public double getValorDevendoAoBanco() {
		return valorDevendoAoBanco;
	}
	
	
	
	

}
