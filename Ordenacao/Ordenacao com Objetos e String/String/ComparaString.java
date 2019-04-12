
public class ComparaString {


	// QuickSort
	public void quickSort(String[] vet, int inicio, int fim) {

		int i = partition(vet, inicio, fim);

		if (inicio < i - 1) {
			quickSort(vet, inicio, i - 1);
		}

		if (i < fim) {
			quickSort(vet, i, fim);
		}

	}

	public int partition(String[] a, int init, int end) {
		
		int i = init;
		int j = end;
		
		String pivot = a[(init + end)/2];
		
		while(i <= j ) {
			
			while(a[i].length() < pivot.length()) {
				i++;
			}
			
			while(a[j].length() > pivot.length()) {
				j--;
			}
			
			if (i <= j) {
				String temp;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}	
		
		}
		return i;
	}
	

	public void mergeSort(String[] v, int inicio, int fim) {

		String[] aux = new String[v.length];

		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(v, inicio, meio);
			mergeSort(v, meio + 1, fim);
			ordena(v, inicio, meio, fim);
		}

	}


	public void ordena(String[] v, int inicio, int meio, int fim) {
		// TODO Auto-generated method stub
		String[] aux = new String[v.length]; //Criação vetor auxiliar

		for (int pos = inicio; pos <= fim; pos++) {
			aux[pos] = v[pos]; //Copia dos elementos do vetor a para o vetor auxiliar
		}

		int i = inicio; 
		int posMeio = meio + 1; /// Meio somada a mais uma, ou seja apos a metade
		int k = inicio; 		/// Inicio 2 para o vetor auxiliar

		while (i <= meio && posMeio <= fim) {
			
			if (aux[i].length() < aux[posMeio].length()) { 
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
