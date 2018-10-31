package p2lpoo201602;

public class Professores extends OracaoPessoa implements Oracao {

	private double valorDevendoAoBanco;
	
	public Professores(String nome, String cpf, double valorDevendoAoBanco) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	public double getValorDevendoAoBanco() {
		return valorDevendoAoBanco;
	}

	public void setValorDevendoAoBanco(double valorDevendoAoBanco) {
		this.valorDevendoAoBanco = valorDevendoAoBanco;
	}

	
	
	@Override
	public void fazOracao() {
		double ValorDevendo = getValorDevendoAoBanco();
		double desconto = ((ValorDevendo * 10)/100);
		ValorDevendo = ValorDevendo - desconto;
		
	}

	@Override
	public void recebeOracao() {
		// TODO Auto-generated method stub
		
		double ValorDevendo = getValorDevendoAoBanco();
		double desconto = 250;
		ValorDevendo = ValorDevendo - desconto;
		
		
	}

}
