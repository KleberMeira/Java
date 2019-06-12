
public class ComparaString {

	// merge
	public void mergerSort(String[] vet, int inicio, int fim) {

	}

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
	
	
}
