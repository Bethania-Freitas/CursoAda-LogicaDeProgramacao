import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Desenhando triangulos de *");
		
		System.out.printf("Quantas linhas deseja desenhar o triangulo: ");
		int linhas = sc.nextInt();

				
		String star = "*";

		for(int i = linhas; i > 0; i--) {
			for (int j = linhas; j > 0; j--) {
				System.out.print(star);
			}
			System.out.println();
			linhas--;
		}
		
		sc.close();
	}
}


