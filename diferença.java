package exercicios;
import java.util.Scanner;

public class diferença {

	public static void main(String[] args) {
	
		Scanner vl = new Scanner(System.in);
		
	    int A, B, C, D, DIF;
	    
	    A = vl.nextInt();
	    B = vl.nextInt();
	    C = vl.nextInt();
	    D = vl.nextInt();
	    DIF =  A * B - C * D;
	    
	    System.out.println(DIF);
		
		vl.close();
		
		
		

	}

}
