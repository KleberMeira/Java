public class AlgoritmosDeOrdenacao{


	private int vetor[] = { 10, 5 , 4, 6, 30, 9, 8, 7 };
	private int n;

	/*
	public AlgoritmosDeOrdenacao(){
		this.n = n;
	}
	public void setN(int n){
		this.n = n;
	}
	public int getN(){
		return n;
	}
	*/

	public void BubbleSort(){

		int temp;
		for(int i = 0; i < vetor.length-1 ; i++){
			for(int j = 0; j < vetor.length - 1; j++){
				if(vetor[i] > vetor[j+1]){
					temp = vetor[i];
					vetor[i] = vetor[j+1];
					vetor[j+1] = temp;
				}
			}
					System.out.println(":::Fim da Interacao::: " + i);
		}
		imprime();


	}

	public void imprime(){
		for(int i = 0; i < vetor.length; i++){
			System.out.println(" " + vetor[i]);
		}
		System.out.println("");
	}



}