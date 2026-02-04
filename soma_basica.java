package exercicios;
import java.util.Scanner;

public class soma_basica {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	    int A, B, Soma;
	   
	   A = sc.nextInt();
	   B = sc.nextInt();
	   Soma = A + B;
	   
	   System.out.println("A soma de " + A + " e " + B + " é igual a " + Soma);
	   
	   sc.close();

	}

}
