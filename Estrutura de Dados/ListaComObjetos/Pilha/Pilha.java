
public class Pilha {

	Pessoa[] pessoas = new Pessoa[3];
	
	private int tamanho = -1;
	
	public int getTamanho() {
		return tamanho;
	}

	public void empilha(Pessoa pessoa) {
		tamanho++;
		this.pessoas[tamanho] = pessoa;
	}

	public void desempilha() {
		
	}
	
	public boolean isEmpty() {
		if(tamanho < 0) {
			return true;
		}
		return false;
	}

}
