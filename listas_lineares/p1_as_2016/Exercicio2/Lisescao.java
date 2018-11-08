public class Lisescao{

	private Celula cabeca;

	public Lisescao(){
		cabeca = new Celula();
	}

	public Celula getCabeca(){
		return cabeca;
	}

	// recebe um valor inteiro e o coloca na lista, mantendo-a ordenada
	public void insere(int elemento){

		Celula aux = cabeca;
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		
		Celula nova = new Celula();
		nova.setChave(elemento);
		aux.setProx(nova);
			
	}
	// recebe um valor inteiro e o remove da lista, mantendo-a ordenada;
	public void remove(int elemento) {
		
		Celula aux = cabeca;
		while(aux != null) {
			if(aux.getChave() == elemento) {
				System.out.println(":: Everybody:: ");
			}
			else {
				System.out.println(":: Nada encontrado :: ");
			}
		}
	}
	
	// imprime todos os campos chave da lista em questão
	public void imprime() {
		
		Celula aux = cabeca.getProx();
		while(aux != null) { 				///getProx()
			System.out.print(" " + aux.getChave());
			aux = aux.getProx();
			//					  System.out.println("");
		}
	}
	
	//Metodo para Ordenar Elementos, usando Bubble Sort
	public void bubbleSort() {
		
	}
}