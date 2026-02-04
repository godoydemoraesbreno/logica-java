package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class calculo_salario {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double vlph, sal;
		int num, hrt;
		
		num = sc.nextInt();
		vlph = sc.nextDouble();
		hrt = sc.nextInt();
		sal = vlph * hrt;
		
		System.out.printf("O salário do funcionário %d é igual a $ %.2f%n ", num, sal);
		
		sc.close();
		
		
		
		
	}

}
