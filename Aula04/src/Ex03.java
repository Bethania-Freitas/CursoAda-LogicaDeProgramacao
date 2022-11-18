
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		System.out.printf("Digite um numero inteiro entre 2 e 20: ");
		int valor = sc.nextInt();
		int[][] matriz = new int[valor][valor];

		for (i = 0; i < valor; i++) {
			for (j = 0; j < valor; j++)
				if (matriz[i] == matriz[j]) {
					matriz[i][j] = 1;
				} else
					matriz[i][j] = 0; 		
		}
		
		
		for (i = 0; i < valor; i++) {
			for (j = 0; j < valor; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
				
	}
}
