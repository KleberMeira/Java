import java.util.List;

public class OrdenadorDeLista implements Comparable<Integer> {

	public void bubbleSort(List<Integer> lista ) {
		
		
		for(int i = 0; i < lista.size(); i++) {
			for(int j = 1; j < i-1; j++) {
				if(lista.get(i) > lista.get(j)) {
					int aux = lista.get(i);
					System.out.println("Num "+aux);
				}
			}
		}
		
		System.out.println(lista.size());
		
	}


	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
