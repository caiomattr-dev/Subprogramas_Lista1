package subprogramasLista1.java;
import java.util.*;

public class Questao1 {
	public static double vol(int r) {
		return 4.0/3.0 * (Math.PI) * Math.pow(r, 3);
	}
	
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o valor do raio:");
		int raio = s.nextInt();
		
		double conta = vol(raio);
		System.out.println(conta);
		System.out.println(conta);
		
		
		
		
		
		
	
	}
}
