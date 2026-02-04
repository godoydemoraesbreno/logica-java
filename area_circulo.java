package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class area_circulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Pi, Raio, area;
		
		Pi = 3.14159;
		Raio = sc.nextDouble();
		area = Pi * (Raio * Raio); 
		
		System.out.printf("A area do circulo quando seu raio é %.2f, é igual a %.4f%n ", Raio,  area); 
		
		sc.close();
				;
		
		

	}

}
