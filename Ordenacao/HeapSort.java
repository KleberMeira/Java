
public class HeapSort {

	//Fazer alterações *troca e realizar testes
	
	public void refaz_cima_baixo(int[] v, int k, int N) {
		
		int i, j;
		while(2*k <= N) {
			j = 2*k;
			// encontra maior filho
			if(j < N && v[j] < v[j+1]) {
				j++;
			}
			
			//troca(v[k], v[j]);
			k = j;
		}
	}
	
	public void refaz_baixo_cima(int[] v, int k) {
	
		//se pai for menor que filho, troca
		while(k > 1 && v[k/2] < v[k]) {
			//troca(v[k], v[k/2]);
			//vai para o pai e repete o processo
			k = k/2;
		}
	}
	
	public void heap_constroi(int[] v, int n) {
		
		int k = n/2;
		while(k >= 1) {
			refaz_cima_baixo(v, k, n);
			k--;
		}
	}
	
	public void heap_insere(int[] v, int n, int itemNovo) {
		
		n += 1;
		v[n] = itemNovo;
		refaz_baixo_cima(v, n);
		
	}
	
	public int heap_remove_maximo(int[] v, int n) {
		
		//troca(v[1], v[n];
		n -= 1;
		refaz_cima_baixo(v, 1, n);
		return v[n+1];
		
	}
	
	public void heapsort(int[] v, int n) {
		
		heap_constroi(v, n);
		int k = n; //elemento de v[1] a v[n]
		
		while(k >= 1) {
			//troca(v[k], v[1]);
			k--;
			refaz_cima_baixo(v, 1, k);
		}
		
	}
	
	
	
	public void troca(int[] pos, int[] pos2 ) {
		/*
		int aux = maximo;
		S[maximo] = S[i];
		S[i] = maximo;
		 */
	}
}
