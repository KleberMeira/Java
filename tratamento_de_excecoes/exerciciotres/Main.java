package exerciciotres;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*Tratamento test = new Tratamento();
		
		try {
			System.out.println("Digite o numerador: ");
				int numerador = teclado.nextInt();
			System.out.println("Digite o denominador: ");
				int denominador = teclado.nextInt();
			
			System.out.println(test.quociente(numerador, denominador));
			
		  	}
		
		catch(ArithmeticException ArithmeticException)
		{
			System.out.println("Opa, Denominador 0");
		}
		
		
		finally {
			System.out.println("Very Good");
		}
		*/
		
		public static void method1() throws Exception 
		{
			try {
				method2();
			}
			catch(Exception exception)
			{
				throw new Exception("ABC", exception);
			}
		}
		
		public static void method2() throws Exception
		{
			try {
				method3();
			}
			catch(Exception exception)
			{
				throw new Exception("ABCD", exception);
			}
		}
		
		public static void method3() throws Exeption
		{
			try
			{
				throw new Execption("ABCDE");
			}
			
		}
		

	}

}
