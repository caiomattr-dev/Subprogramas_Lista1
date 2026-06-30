package subprogramasLista1.java;

import java.util.Scanner;

public class Questao11 {
	public static double peso(double alt, String sex) {
		if(sex.equalsIgnoreCase("m")) {
			double pesoI = 72.7 * alt - 58;
			return pesoI;
		}
		if(sex.equalsIgnoreCase("f")) {
			double pesoI = 62.1 * alt - 44.7;
			return pesoI;
		}
		else
			return 0;
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("qual sua altura em M? ");
		double alt = s.nextDouble();
		
		System.out.println("qual sexo:");
		String sex = s.next();
		
		System.out.println(peso(alt, sex));

	}

}
