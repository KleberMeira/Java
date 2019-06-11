import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

		Set<Integer> aux = new HashSet<Integer>();
		Set<Integer> aux2 = new HashSet<Integer>();
		Set<Integer> difer = new HashSet<Integer>();
	
		aux.addAll(s1);
		aux2.addAll(s2);
		
		System.out.println("//Em construcao");

	}
	
	
	public Map<String, Integer> contar(String frase) {
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(char letra : frase.toCharArray()) {
			Integer s = map.get(String.valueOf(letra));
			
			if(s != null) {
				map.put(String.valueOf(letra), s++);
				System.out.println("Incrementei");
			}
			
			else {
				map.put(String.valueOf(letra), 1);
				System.out.println("Primeira vez");
			}
		}
		
		System.out.println(frase.toCharArray());
		
	
		return map;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
