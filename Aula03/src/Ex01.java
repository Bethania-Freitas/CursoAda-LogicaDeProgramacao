import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero primo: ");
		int num = sc.nextInt();
		int divisor = 2;

		while (num % divisor != 0) {
			divisor++;
		}

		if (divisor == num) {
			System.out.println("Numero primo");
		} else if (num == 1) {
			System.out.println("Numero 1 é neutro");
		} else {
			System.out.println("Numero 1 não é primo");
		}
		
		sc.close();
	}
}
