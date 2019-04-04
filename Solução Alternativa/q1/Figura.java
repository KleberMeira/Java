
public abstract class Figura implements CalculadoraPerimetro {
	
		protected int[] lados;

		public abstract void setLado(int lado, int valor);

		public abstract int getLado(int lado);

	
		public void imprimeValores() {

			for(int i = 0; i < lados.length; i++) {
				System.out.print( " " + lados[i]+ " ");
			}
			
		}

		@Override
		public int perimetroRecursivo(int[] vet, int pos) {
			// TODO Auto-generated method stub
			int lado = getLado(pos);
			
			if(pos < vet.length) {
				
				return vet[pos + 1] + perimetroRecursivo(vet, pos + 1);
			}
			else
				return 0;
		}
		
		
		@Override
		public int getPerimetro() {
			return 0;
		}
	
}
