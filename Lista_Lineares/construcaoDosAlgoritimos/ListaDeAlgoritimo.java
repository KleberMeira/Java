package construcaoDosAlgoritimos;

public class ListaDeAlgoritimo {

	int[] vetor;
	int tamanho;
	
	public ListaDeAlgoritimo(int tamanho) {
		vetor = new int[tamanho];
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}


	///Bubble Sort
	public void bubbleSort(int n, int v[]) {
		int i, j;
		for(i = vetor.length-1 ; i > 0 ; i--) {
			for(j = 0 ; j < i ; j++) {
				if(vetor[j] > vetor[j+1]) {
					troca(i, j, j+1);
				}
			}
		}
		
	}
	
	///Selection Sort
	public void selectionSort(int n, int v[]) {
		int i, j, min;
		for(i = 0; i < vetor.length-1 ; i++) {
			min = i;
			for(j = i+1 ; j < vetor.length ; j++) {
				if(vetor[j] < vetor[min]) {
					min = j;
				}
			troca(i, j, min);
			}
		}
	}
	
	///Insertion Sort
	public void insertionSort(int n, int v[]) {
		
		int i, j, x;
		for(i = 1; i < vetor.length ; i++) {
			x = v[i];
			for(j = i - 1; j >= 0 && v[j] > x ; j--) {
				v[j+1] = v[j];
			}
			v[j+1] = x;
		}
	}
	
	
	
	///Troca
	public int troca(int i, int j, int aux) {
	
		aux = vetor[i];
		vetor[j] = vetor[i];
		aux = vetor[j];
		
		return aux;
	}
	
}
