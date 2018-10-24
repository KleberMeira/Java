package exerciciodois;

public class VetoriusInfinitus {

	private int[] vetorInfinito;
	
	
	
	public VetoriusInfinitus()
	{
		int[] vetorInfinito = new int[1];
	}
	
	public void adcionaElemento(int numero)
	{
		if(vetorInfinito.length < numero)
		{
			for(int i = 0 ; i < vetorInfinito.length ; i++)
			{
				vetorInfinito[i] = numero;
			}
		}
		
		else
		{
			int[] vetorAux;
			vetorAux = new int[vetorInfinito.length + 1];
			
			for(int i = 0 ; i < vetorInfinito.length ; i++)
			{
				vetorAux[i] = vetorInfinito[i]; 
			}
			
			vetorInfinito = vetorAux;
		}
		
	}
	
	
	public void buscarElemento(int numero) 
	{
		
	}
	
	
}
