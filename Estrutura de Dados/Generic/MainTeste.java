
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainTeste {
	
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		Map mapa = new HashMap();
		
		System.out.println("**Exercicio 1**");
		
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("E");
		lista.add("F");
		lista.add("G");
		lista.add("H");
		lista.add("I");
		lista.add("J");
		
		System.out.println("-Lista-");
		System.out.println(lista);
		
		for(int i = 0; i < lista.size(); i++) {
			mapa.put(i, lista.get(i));
		}
		System.out.println("-HashMap-");
		System.out.println(mapa);
		
		System.out.println();
		
		///_------------------------------
		System.out.println("**Exercicio 2**");
		
		List<Integer> numero = new LinkedList<Integer>();
		
		numero.add(10);
		numero.add(1);
		numero.add(19);
		numero.add(39);
		numero.add(14);
		numero.add(2);
		numero.add(13);
		
		System.out.println("-Lista de Numeros-");
		//System.out.println(numero);
		OrdenadorDeLista sort = new OrdenadorDeLista();
		//sort.bubbleSort(numero);
		
		///_------------------------------
		System.out.println("**Exercicio 3**");
		Seters cs = new Seters();
		
		String frase = "ana bananae";
		System.out.println(cs.contar(frase));
	

		/*
		///_------------------------------
		System.out.println("**Exercicio 5**");
		
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		set1.add(14);
		set1.add(15);
		set1.add(17);
		set1.add(30);
		
		set2.add(14);
		set2.add(17);
		set2.add(22);
		
		//14, 17
	
		System.out.println("Uniao");
		cs.SetUnion(set1, set2);
		System.out.println();
		System.out.println("Intersecao");
		cs.SetIntersection(set1, set2);
		System.out.println();
		System.out.println("Diferenca");
		cs.SetDifference(set1, set2);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
