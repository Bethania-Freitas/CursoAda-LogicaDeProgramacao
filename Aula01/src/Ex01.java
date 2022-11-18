import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			
			System.out.println("Digite seu nome: ");
			String nome = sc.next();
			
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();
			
			System.out.printf("Nome: %s %n", nome);
			System.out.printf("Idade: " + idade);
			
			sc.close();
			

	}

}
