package recursao;

public class BuscaRecursivaBinaria {

	public int buscaBinaria(int vetor[], int buscado, int inicio, int fim  ) {
		
		int media = (inicio+fim)/2;
		int meio = media;
		
		
		//quando não estiver o valor inserido
		if(inicio > fim) {
			return -1;
		}
		
		//verifica se o valor buscado está no centro do vetor.
		if(buscado == vetor[meio]) {
			return vetor[media];
		}
		
		else if( buscado > vetor[media]) {
			return buscaBinaria(vetor, buscado, media+1, fim);
		}
		else {
			 return buscaBinaria(vetor, buscado, media-1, inicio);
		}
		
	}
	
	
	
}
