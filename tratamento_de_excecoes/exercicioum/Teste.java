package exercicioum;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Numero num = new Numero(10, 2);
		
		try {
			num.divisao(10, 2);
			throw new InvalidCpfFormatException();
			
		}
		catch(InvalidCpfFormatException InvalidCpfFormatException){
			System.err.printf("dada", InvalidCpfFormatException);
					
		}
		finally {
			System.out.println("Concluido");
		}
		
	}
	

}
