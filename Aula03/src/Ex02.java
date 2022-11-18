import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double aplicacao = 1500.00;
		double divida = 10000.00;
		int meses = 0;

		while (aplicacao < divida) {
			aplicacao += aplicacao / 100 * 4;
			divida += divida / 100 * 2.5;
			meses++;
			System.out.printf("aplicacao: %.2f%n", aplicacao);
			System.out.printf("divida: %.2f%n", divida);
		}

		System.out.println("Serão necessarios " + meses + " meses pra quitação da divida");
		
		sc.close();
	}

}
