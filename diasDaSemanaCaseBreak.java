package curso_programacao;
import java.util.Scanner;

public class diasDaSemanaCaseBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String dia;
		
		System.out.println("Insira algum dia de 1 a 7");
		
		int x = sc.nextInt();
		
				switch (x) {
		case 1: 
		   dia = "Domingo";
		break;
		
		case 2:
		   dia = "Segunda";
		break;
		
		case 3:
			dia = "Terça";
		break;
		
		case 4:
			dia = "Quarta";
		break;
		
		case 5:
			dia = "Quinta";
        break;
        
		case 6:
			dia = "Sexta";
		break;
		
		case 7:
			dia = "Sabado";
		break;
		
		default:
			dia = null;
			  break;
		 				
		}
		
				if (dia == null ) {
					System.out.println("Insira um valor valido");
				}
				
				else {
					System.out.printf("O dia da semana é %s%n", dia);
				}
				
				
		
		sc.close();
		
		}

}
