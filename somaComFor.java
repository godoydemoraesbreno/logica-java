package exercicios;
import java.util.Scanner;

public class somaComFor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tanto de numeros que deseja inserir: ");
		int n = sc.nextInt();
		 
		int x = 0;
		int soma = 0;
		double media = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Insira os valores: ");
			x = sc.nextInt();
			soma = x + soma;
		}
		
		media = soma / n;
		
		System.out.println(media);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
