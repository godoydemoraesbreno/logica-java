package exercicios;
import java.util.Scanner;

public class tipos_combustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;
		
		
		System.out.println("Digite o tipo de combustivel: ");
		int valor = sc.nextInt();
		
		while(valor != 4) {
			if(valor == 1) {
				Alcool = Alcool + 1;
			}
			else if(valor == 2) {
				Gasolina = Gasolina + 1;
			}
			else if(valor == 3) {
				Diesel = Diesel + 1;
			}
				 valor = sc.nextInt();
				 
			    }
		
		System.out.println("Muito obrigado");
		System.out.printf("Gasolina: %d%n", Gasolina);
		System.out.printf("Alcool: %d%n", Alcool);
		System.out.printf("Diesel: %d%n", Diesel);
		
		sc.close();
		
		
	}

}
