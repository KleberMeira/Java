
public class AlgOrdenacao {

	public void mergeSort(int[] v, int inicio, int fim) {

		int[] aux = new int[v.length];

		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(v, inicio, meio);
			mergeSort(v, meio + 1, fim);
			ordena(v, inicio, meio, fim);
		}

	}

	private void ordena(int[] v, int inicio, int meio, int fim) {
		// TODO Auto-generated method stub
		int[] aux = new int[v.length];

		for (int pos = inicio; pos <= fim; pos++) {
			aux[pos] = v[pos];
		}

		int i = inicio;
		int posMeio = meio + 1; /// Meio somada a mais uma, ou seja apos a metade
		int k = inicio; /// Inicio 2 para o vetor auxiliar

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
