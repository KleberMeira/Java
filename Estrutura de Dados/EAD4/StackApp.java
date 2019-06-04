
/*
 * Autor: Kleber Meira
 * Engenharia de Software/Ufms/Facom
 */

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PILHA VETOR
		StackArray sa = new StackArray();
		System.out.println("Esta vazia? " + sa.isEmpty());
		sa.push(5);
		sa.push(4);
		sa.push(3);
		sa.push(2);
		sa.push(1);
		
		System.out.println("Elemento do topo: " + sa.top());
		System.out.println("Tamanho: " + sa.size());
		System.out.println("Esta vazia? " + sa.isEmpty());
		
		System.out.println("Desempilhado: " + sa.pop());
		System.out.println("Desempilhado: " + sa.pop());
		System.out.println("Desempilhado: " + sa.pop());
		System.out.println("Desempilhado: " + sa.pop());
		System.out.println("Desempilhado: " + sa.pop());
		
		
		//PILHA ENCADEADA
		LinkedStack st = new LinkedStack();
		System.out.println("Esta vazia? " + st.isEmpty());
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		System.out.println("---Empilhado!---");
		System.out.println("Esta vazia? " + st.isEmpty());
		System.out.println("Tamanho: " + st.size());
		st.ler();
	
		System.out.println("Topo: " + st.top());
		System.out.println("Elemento removido: " + st.pop());
		System.out.println("Elemento removido: " + st.pop());
		System.out.println("Elemento removido: " + st.pop());
		System.out.println("Elemento removido: " + st.pop());
		
		
		System.out.println();
		st.ler();
		System.out.println("Topo: " + st.top());
		System.out.println("Tamanho: " + st.size());
		
		System.out.println(bemFormada("[(([]]", sa));
		inverte("Kleber ", st);
		
	}
	
	
	public static boolean bemFormada(String sequencia, Stack pilha) {
		
		for(int i = 0; i < sequencia.length(); i++) {
			//System.out.println(sequencia.charAt(i));
			if(sequencia.charAt(i) == '(' || sequencia.charAt(i) == '[') {
				pilha.push(sequencia.charAt(i));
			}
			else if(sequencia.charAt(i) == ')' || sequencia.charAt(i) == ']') {
				if(!pilha.isEmpty()) {
					pilha.pop();
				}
			}
			
		}
		
		if(pilha.isEmpty()) {
			return true;
		}
		
		
		return false;
	}
	
	public static String inverte(String  palavra, Stack pilha) {
		
		for(int i = 0; i < palavra.length(); i++) {
			pilha.push(palavra.charAt(i));
		}
		
		for(int j = 0; j < palavra.length(); j++) {
			System.out.println(pilha.pop());
		}
		
		return null;
	}

}
