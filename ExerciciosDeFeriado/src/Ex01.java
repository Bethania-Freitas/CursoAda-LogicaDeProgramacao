import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int operacao;
		String opcao = null;
		
		System.out.println("OPERAÇÃO MATEMÁTICA");
		
		System.out.println("Escolha qual operação quer realizar:");
		System.out.println("1 - SOMAR");
		System.out.println("2 - SUBTRAIR");
		System.out.println("3 - MULTIPLICAR");
		System.out.println("4 - DIVIDIR");
		operacao = sc.nextInt();
		
		System.out.println("Digite 2 numeros para realizar a operação: " );
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int resultado = 0;
		
		switch(operacao) {
			case 1 :
				opcao = "+";
				resultado = numero1 + numero2;
				break;
			case 2 :
				opcao = "-";
				resultado = numero1 - numero2;
				break;
			case 3 :
				opcao = "*";
				resultado = numero1 * numero2;
				break;
			case 4 :
				opcao = "/";
				resultado = numero1 / numero2;
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");			
		}		
		System.out.println(numero1 + opcao + numero2 + " = " + resultado);
		
		sc.close();
	}

}
