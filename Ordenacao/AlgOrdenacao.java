
public class AlgOrdenacao {

	public void bubbleSort(int[] vetor){

		int temp;

		for(int it = 0; it < vetor.length - 1; it ++){
			for(int pos = 0; pos < vetor.length - it - 1; pos++){
				if(vetor[pos] > vetor[pos+1]){
					temp = vetor[pos];
					vetor[pos] = vetor[pos+1];
					vetor[pos+1] = temp;
					//troca(vetor, pos, pos+1);	
				}
			}
		}

	}

	public void selectionSort(int[] vetor){

		int posMenor;
		int posMenorInicial;
		int it, temp;
		int i;

		for(it = 0; it < vetor.length-1; it++){
			posMenorInicial = it;
			posMenor = it + 1;
			for(i = posMenorInicial + 1; i < vetor.length; i++){
				if(vetor[i] < vetor[posMenor]){
					posMenor = i;
				}

				if(vetor[posMenor] < vetor[posMenorInicial]){
					//troca
					temp = vetor[posMenorInicial];
					vetor[posMenorInicial] = vetor[posMenor];
					vetor[posMenor] = temp;
				}
			}
		}
	}

	public void insertionSort(int[] vetor){
		
		int carta, j;

		for(int it = 0; it < vetor.length; it++){
			carta = vetor[it];
			for(j = it-1; (j>=0) && vetor[j] > carta; j--){
				vetor[j+1] = vetor[j]; ///Está efetuando a troca que são maiores 
			}
			vetor[j+1] = carta;
		}

	}


	public void troca(int[] vetor, int i, int j){

		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = vetor[temp];
		
	}


	public void mergeSort(int[] v, int inicio, int fim) {

		int[] aux = new int[v.length];

		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(v, inicio, meio);
			mergeSort(v, meio + 1, fim);
			ordena(v, inicio, meio, fim);
		}

	}


	public void ordena(int[] v, int inicio, int meio, int fim) {
		// TODO Auto-generated method stub
		int[] aux = new int[v.length]; //Criação vetor auxiliar

		for (int pos = inicio; pos <= fim; pos++) {
			aux[pos] = v[pos]; //Copia dos elementos do vetor a para o vetor auxiliar
		}

		int i = inicio; 
		int posMeio = meio + 1; /// Meio somada a mais uma, ou seja apos a metade
		int k = inicio; 		/// Inicio 2 para o vetor auxiliar

		while (i <= meio && posMeio <= fim) {
			
			if (aux[i] < aux[posMeio]) { 
				v[k++] = aux[i++];
			} else
				v[k++] = aux[posMeio++];
		}
		
		while(i <= meio)
		{
			v[k++] = aux[i++];
		}
	}

}
