package p2lpoo201602;

public class SistemaDeOracoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Menu = 6;
		switch( Menu )
		{
		case 1 :
			//Politicos    (String nome, String cpf, double valorDePropina)
			Politicos politico = new Politicos("JOAO", "12345678910", 300);
		case 2 :
			//Esportista   (String nome, String cpf, String Esporte)Esporte preferido
			Esportistas esportista = new Esportistas("PEDRO", "2345678910", "Futebol");
		case 3 :
			//Professores	(String nome, String cpf, double valorDevendoAoBanco)
			Professores professor = new Professores("LUCAS", "3456789010", 500);
		case 4 :
			//Cachorro 		(String raca, int idade, int quantMordidas)
			Cachorro cachorro = new Cachorro("PUDLLE", 7, 10);
		case 5 :
			//Gato			(String raca, int idade, String racaoFavorita)
			Gato gato = new Gato("SIAMES", 1, "PEDIGREE");
		default :
			break;
		}
		
		
		
		
		
		
		
		
			
		
		
		
		
		

	}

}
