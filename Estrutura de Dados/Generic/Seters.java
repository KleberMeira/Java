import java.util.HashSet;
import java.util.Set;

public class Seters {

	public void SetUnion(Set<Integer> s1, Set<Integer> s2) {

		Set<Integer> uniao = new HashSet<Integer>();

		uniao.addAll(s1);
		uniao.addAll(s2);

		for (Integer s : uniao) {
			System.out.print(" " + s + " ");
		}
	}

	public void SetIntersection(Set<Integer> s1, Set<Integer> s2) {

		Set<Integer> aux = new HashSet<Integer>();
		Set<Integer> inter = new HashSet<Integer>();
		
		inter.addAll(s1);
		aux.addAll(s2);

		inter.retainAll(s2);
		
		for(Integer ler : inter) {
			System.out.print(" " + ler + " ");
		}
		
		
			
		
		
		
	}

	public void SetDifference(Set<Integer> s1, Set<Integer> s2) {

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
