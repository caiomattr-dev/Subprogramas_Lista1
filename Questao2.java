package subprogramasLista1.java;
import java.util.*;

public class Questao2 {
	public static double media(double a, double b, double c, String l) {
		double mediaP = ((a * 5) + (b * 3) + (c * 2)) / 10;
		if(l.equalsIgnoreCase("A")) {
			double mediaA = (a + b + c) / 3;
			return mediaA;
		}
		else
			return mediaP;
			
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite suas 3 notas: ");
		int nota1 = s.nextInt();
		int nota2 = s.nextInt();
		int nota3 = s.nextInt();
		
		System.out.println("qual tipo de media? [A] ou [P] ");
		String letra = s.next();
		
		System.out.println("media: " + media(nota1, nota2, nota3, letra));
		
	}
}

