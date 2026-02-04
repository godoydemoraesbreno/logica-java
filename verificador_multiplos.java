package exercicios;
import java.util.Scanner;

public class verificador_multiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2 ;
		
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		
		System.out.println("Digite outro");
		num2 = sc.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("É multiplo");
		}
		else {
			System.out.println("Não é multiplo");
		}
		
		sc.close();

	}

}
