
public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackArray sa = new StackArray();
		sa.push(5);
		sa.push(4);
		sa.push(3);
		sa.push(2);
		sa.push(1);
		sa.push(99);
		//sa.push(98);
		System.out.println(sa.top());
		System.out.println("Desempilhado: " + sa.pop());
		System.out.println(sa.pop());
		System.out.println("Tamanho: " + sa.size());
		System.out.println("Esta vazia? " + sa.isEmpty());
		/*
		System.out.println("Desempilhado: " + sa.pop());
		System.out.println("Desempilhado: " + sa.pop());
		System.out.println("Desempilhado: " + sa.pop());
		System.out.println("Desempilhado: " + sa.pop());
		System.out.println("Desempilhado: " + sa.pop());
		*/
	}

}
