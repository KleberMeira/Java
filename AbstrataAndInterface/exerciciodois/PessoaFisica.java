package exerciciodois;

public class PessoaFisica extends Contribuinte {


	public PessoaFisica(String nome, double renda)
	{
		super(nome, renda);
	}
	
	
	public double calcImposto()
	{
		double auxRendaFisica = 0;
		auxRendaFisica = getRenda();
		
		if(auxRendaFisica > 0 && auxRendaFisica <= 1400)
		{
			auxRendaFisica = (auxRendaFisica * 0)/100;
		}
			else if(auxRendaFisica > 1400 && auxRendaFisica <= 2100)
			{
				auxRendaFisica = ((auxRendaFisica * 15)/100) - 100;
			}
				else if(auxRendaFisica > 2100 && auxRendaFisica <= 2800)
				{
					auxRendaFisica = ((auxRendaFisica * 15)/100) - 270;
				}
					else if(auxRendaFisica > 2800 && auxRendaFisica <= 3600)
					{
						auxRendaFisica = ((auxRendaFisica * 25)/100) - 500;
					}
						else
						{
							auxRendaFisica = ((auxRendaFisica * 30)/100) - 500;
						}
		//totalDeImpostos = auxRendaFisica;
		return auxRendaFisica;
	}
	
	
	
	public String toString() {
		return "Nome: " + getNome() + "\n" +
				"Renda: " + getRenda() + "\n" +
				"Imposto descontado: " + calcImposto() + "\n";
	}
	
}
