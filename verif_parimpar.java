package exercicios;
import java.util.Scanner;

public class verif_parimpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("É par!");
		}
		else {
			System.out.println("É impar!");
		}
				
       sc.close();
	}

}
