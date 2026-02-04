package application;
import java.util.Scanner;

public class coxinhacalculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto é seu salário?: ");
		int sal = sc.nextInt();
		int cox = 5;
		int cont = 0;
		
	    while (sal >= cox) {
	    	sal = sal - cox;
	    	cont++;
	    }

	    System.out.println("O tanto de coxinha que da pra comprar com seu salario é " + cont);
		
		sc.close();

	
	}

}
