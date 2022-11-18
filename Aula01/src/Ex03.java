import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int maior = 0;
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
		} else {
			maior = num3;							
		}
		
		System.out.println("O maior numero é o " + maior);
		
		sc.close();
}
}
