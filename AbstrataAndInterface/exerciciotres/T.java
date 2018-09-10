package exerciciotres;

public class T 
{

	private double[] vetor = new double[1];
	
	public void adciona(double num)
	{
		//Preenchimento da posição
		if(vetor.length < num)
		{
			for(int i = 0 ; i < vetor.length ; i++)
			{
				vetor[i] = num;
			}
		}
	
			
		else
		{
			//Redimenciona vetor original "Vetor"
			double[] vetorAux = new double[vetor.length + 1];
				for(int i = 0 ; i < vetorAux.length ; i++)
				{
					vetorAux[i] = vetor[i];
				}
				vetor = vetorAux;
		}
 			
	}
}	
	
	

