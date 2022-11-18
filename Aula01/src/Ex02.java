import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite seu endereço: ");
		sc.nextLine();
		String endereco = sc.nextLine();
		
		
		System.out.println("Digite seu telefone: ");
		String telefone = sc.nextLine();
		
		System.out.println("Digite sua cidade: ");
		String cidade = sc.next();
		
		System.out.println("Digite seu cep:");
		String cep = sc.next();
		
		System.out.print("");
		
		System.out.printf("Nome: %s %n", nome);
		System.out.printf("Endereço: %s %n", endereco);
		System.out.printf("Telefone: %s %n", telefone);
		System.out.printf("Cidade: %s %n", cidade);
		System.out.printf("CEP: %s %n", cep);
		
		sc.close();
	}

}
