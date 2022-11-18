import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite um numero inteiro: ");
		int i = sc.nextInt();
		
		System.out.println(i %2 == 0 ? "PAR" : "IMPAR");
		
		sc.close();
	}

}
