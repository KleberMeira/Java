
public class Calendario {

	private Evento[] eventos;

	public Calendario() {
		this.eventos = new Evento[5];
	}
	
	public Calendario(Calendario c) {
		this.eventos = c.getEventos();
	}
		
	public void mostrarDia(Evento[] v, int inicio, int fim) {

		//int[] aux = new int[v.length];

		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mostrarDia(v, inicio, meio);
			mostrarDia(v, meio + 1, fim);
			ordena(v, inicio, meio, fim);
		}

	}


	public void ordena(Evento[] v, int inicio, int meio, int fim) {
		// TODO Auto-generated method stub
		Evento[] aux = new Evento[v.length]; //Criação vetor auxiliar

		for (int pos = inicio; pos <= fim; pos++) {
			aux[pos] = v[pos]; //Copia dos elementos do vetor a para o vetor auxiliar
		}

		int i = inicio; 
		int posMeio = meio + 1; /// Meio somada a mais uma, ou seja apos a metade
		int k = inicio; 		/// Inicio 2 para o vetor auxiliar

		while (i <= meio && posMeio <= fim) {
			
			if (aux[i].getData().getDia() < aux[posMeio].getData().getDia()) { 
				v[k++] = aux[i++];
			} else
				v[k++] = aux[posMeio++];
		}
		
		while(i <= meio)
		{
			v[k++] = aux[i++];
		}
	}
	
	
	public void mostrarMes() {

	}

	public void mostrarAno() {

	}

	public Evento[] getEventos() {
		return eventos;
	}

	public void setEventos(Evento[] eventos) {
		this.eventos = eventos;
	}

	int k = 0;

	public void preencheEventos(Evento tarefa) {
		this.eventos[k++] = tarefa;
	}

	// Listagem dos eventos
	public void listagemEventos() {

		for (int i = 0; i < eventos.length; i++) {
			eventos[i].listagemGeral();
			System.out.println();
		}
	}
		
	///RASCUNHOS
	public void ordenaBubble() {
		
		Evento temp = new Evento();
		for(int it = 0; it < eventos.length - 1; it ++){
			for(int pos = 0; pos < eventos.length - it - 1; pos++){
				if(eventos[pos].getData().getDia() > eventos[pos+1].getData().getDia()){
					temp = eventos[pos];
					eventos[pos] = eventos[pos+1];
					eventos[pos+1] = temp;
				}
			}
		}	
	
	}

	
	
}
