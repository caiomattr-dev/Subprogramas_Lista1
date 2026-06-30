package subprogramasLista1.java;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao5 {
	
	public static String hMS(int segs) {
		DecimalFormat df = new DecimalFormat();
		int horas = segs / 3600;
		int min = segs % 3600;
		int sec = min % 60;
		min = min / 60;
		
		return df.format(horas) + ":" +df.format(min) + ":" + 
	       df.format(sec);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("insira segundos: ");
		int segundos = s.nextInt();
		
		System.out.println(hMS(segundos));
		
	}

}
