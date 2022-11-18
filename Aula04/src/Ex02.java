import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[100];
		
		int contador = 0;
		int contador2 = 0;
		
		for (int i = 0; i < vetor.length; i++) {
				System.out.println("Digite um numero: ");
				vetor[i] = sc.nextInt();
				contador++;
				if (vetor[i] == 0) {
					break;
			}					
		}
		
		int[] vetorInverso = new int[contador];
		
		for (int i = contador-1; i >= 0; i--) {
			vetorInverso[i] = vetor[(contador2)];
			contador2++;
		}
		
		System.out.println(Arrays.toString(vetorInverso));	
		
		sc.close();
	}

}
