import java.util.List;

public class OrdenadorDeLista implements Comparable<Integer> {

	public void bubbleSort(List<Integer> lista ) {
		
		int tamanho = lista.size();
		int temp;
		
		for(int it = 0; it < tamanho-1; it++) {
			for(int pos = 0; pos < tamanho-it-1; pos++) {
				System.out.println(pos);
				if(lista.get(pos) > lista.get(pos+1)) {
					temp = lista.get(pos);
					
				}
			}
		}
	
	}
	

	@Override
	public int compareTo(Integer o) {
		
		return 0;
	}
	
	
	
	/*
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
	*/
	
	
}
