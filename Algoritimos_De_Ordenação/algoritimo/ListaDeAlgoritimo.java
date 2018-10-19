package algoritimo;

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
	public void bubbleSort() {
		int i, j;
		for(i = vetor.length-1 ; i > 0 ; i--) {
			for(j = 0 ; j < i ; j++) {
				if(vetor[j] > vetor[j+1]) {
					troca();
				}
			}
		}
		
	}
	
	///Selection Sort
	public void selectionSort() {
		int i, j, min;
		for(i = 0; i < vetor.length-1 ; i++) {
			min = i;
			for(j = i+1 ; j < vetor.length ; j++) {
				if(vetor[j] < vetor[min]) {
					min = j;
				}
			troca();
			}
		}
	}
	
	///Insertion Sort
	public void insertionSort() {
		
	}
	
	
	
	///Troca
	public int troca() {
		int aux,j,i;
		
		aux = vetor[i];
		vetor[j] = vetor[i];
		aux = vetor[j];
		
		return 0;
	}
	
}
