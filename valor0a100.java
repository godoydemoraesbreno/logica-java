package exercicios;
import java.util.Scanner;

public class valor0a100 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.println("Digite um numero de 0 a 100: ");
		num = sc.nextDouble();
		
		if(0 >= num && num <= 25 ) 
			System.out.println("Esta entre 0 e 25");
		
		else if(25.01 <= num && num <= 50)
			System.out.println("Esta entre 25 e 50");
		
		else if(50.01 <= num && num <= 75)
			System.out.println("Esta entre 50 e 75");
		
		else if(75.01 <= num && num <= 100)
			System.out.println("Esta entre 75 e 100");
		
		else 
			System.out.println("Este valor não esta nas condiçoes");
		
		sc.close();
		
			}

}
