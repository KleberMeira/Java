public class Pilha{
    
   	   private int pilha[];
		private int n;
		private int topo;
		private int incrementado;
		
		
		public Pilha(int n, int incrementado) {
			super();
			this.topo = -1;
			this.n = n;
			this.incrementado = incrementado;
			pilha = new int[n];
		}
		
		
		public int getN() {
			return n;
		}
		public void setN(int n) {
			this.n = n;
		}
		///////////////////////////
		
		public int getIncrementado() {
			return incrementado;
		}
		public void setIncrementado(int incrementado) {
			this.incrementado = incrementado;
		}
		///////////////////////////
		
		
		//Empilha
		public void empilha(int elemento) {
			System.out.println("empilha.. " + elemento);
			if(topo < pilha.length) {
				topo++;
				pilha[topo] = elemento;
				redimenciona();
			}
			else {
				redimenciona();
			}
			
		}
		
		///Desempilha
		public int desempilha() {
			int elemento;
			elemento = pilha[topo];
			topo--;
			return elemento;
		}
			
		//isEmpty
		public boolean isEmpty() {
			if(topo == -1) {
				return true;
			}
			return false;
		}
		
		//Redimenciona
		public int[] redimenciona() {
			int[] pilha2 = new int[pilha.length + incrementado];
			for(int i = 0; i < pilha.length; i++) {
				pilha2[i] = pilha[i];
			}
			return pilha = pilha2;
			
		}
	
    
}