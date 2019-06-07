
/*
 * Autor: Kleber Meira
 * Engenharia de Software/Ufms/Facom
 */

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PILHA VETOR
		System.out.println();
		System.out.println("--PILHA EM VETOR---");
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
		
		System.out.println();
		System.out.println();
		System.out.println("---PILHA ENCADEADA---");
		
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
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("---EXPRESSOES RECURSIVAS---");
		
		
		System.out.println("Expressao balanceada");
		StackArray bf = new StackArray();
		//Funcao balanceada apresenta erro, para verificar so descomentar
		//System.out.println(bemFormada(0, "[(([]", bf));
		
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("Inversao Recursiva ");
		System.out.println();
		System.out.println(inverte(0, "Kleber", st));
		//invetida2(5, "Kleber", st);
		
		
		
	}
	
	//---------------------------------------------------------------------->
	//Com erro
	public static boolean bemFormada(int cont, String sequencia, Stack pilha) {
		
		
		if(sequencia.length() % 2 == 0) {
			return false;
		}
		
		else if(cont < sequencia.length()) {
			
			pilha.push(sequencia.charAt(cont++));
			
			if(sequencia.charAt(cont) == ')' || sequencia.charAt(cont) == ']') {
				pilha.pop();
			}
			
			if(pilha.isEmpty()) {
				return true;
			}
			bemFormada(cont, sequencia, pilha);

		}
		
		return false;
	}
	
	
	//Nao esta desempilhando
	public static int p = 5;
	public static String[] invertida;
	public static String[] inverte(int cont, String palavra, Stack pilha) {
		
		//System.out.println("Tamanho da palavra: " + palavra.length());
		
		if(cont < palavra.length()) {
			pilha.push(palavra.charAt(cont));
			
			System.out.println("Elemento: " + pilha.top());
			
			inverte(++cont, palavra, pilha);
		}
		return invertida ;
	}
	
	
	public static String invetida2(int cont, String palavra2, Stack pilha) {
		
		if(cont > 0) {
			palavra2+= pilha.pop();
			invetida2(cont--, palavra2, pilha);
		}
		
		return null;
		
		
	}
	//<----------------------------------------------------------------------------
	
	

}
