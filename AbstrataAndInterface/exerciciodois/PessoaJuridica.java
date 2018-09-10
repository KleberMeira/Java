package exerciciodois;

public class PessoaJuridica extends Contribuinte {

	
	public PessoaJuridica(String nome, double renda)
	{
		super(nome, renda);
	}
	
	public double calcImposto()
	{
		double auxRendaJuridica = 0;
		auxRendaJuridica = getRenda();
		
		auxRendaJuridica = (auxRendaJuridica * 10)/100;
		
		return auxRendaJuridica;
	}
	
	
	public String toString() {
		return "Nome: " + getNome() + "\n" +
				"Renda: " + getRenda() + "\n" +
				"Imposto descontado: " + calcImposto() + "\n";
	}
	
}

