
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComparaString comp = new ComparaString();
		
		String[] vetor = new String[]{"Aaaa", "Aaa", "Aa", "AAAAAA"};
		
		for(int i = 0; i< vetor.length ; i++) {
			System.out.print(" " + vetor[i] + " ");
		}
		
		comp.quickSort(vetor, 0, vetor.length-1);
		
		System.out.println();
		
		for(int i = 0; i< vetor.length ; i++) {
			System.out.print(" " + vetor[i] + " ");
		}
		
	}

}
