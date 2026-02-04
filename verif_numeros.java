package exercicios;
import java.util.Scanner;

public class verif_numeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número inteiro");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("É positivo!");
		}
		else if(num == 0) {
			System.out.println("É neutro!");
		}
		else {
			System.out.println("É negativo!");
		}
			
		sc.close();
		

	}

}
