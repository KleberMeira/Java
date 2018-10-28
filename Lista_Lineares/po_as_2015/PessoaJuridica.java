package po_as_2015;

public class PessoaJuridica extends Pessoa implements Impostos {

	
	public PessoaJuridica(String nome, double rendaBruta) {
		super(nome, rendaBruta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double descRendaBruta() {
		double valorDescontado = 0;
		double renda = getRendaBruta();
		
		valorDescontado = ((renda * 10)/100);		
		return renda = renda - valorDescontado;
	}
	
	public String toString() {
		return "Sua renda de " + getRendaBruta() + " ficou de " +descRendaBruta() + " com o desconto de impostos. ";
	}



}
