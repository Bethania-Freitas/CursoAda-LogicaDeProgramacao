import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario do funcionario:");
		double salario = sc.nextDouble();
		System.out.println("Digite o cargo do funcionario, sendo ( 1 para Tecnico - 2 para gerente - 3 para 'outros')");
		int cargo = sc.nextInt();
		
		if (cargo == 1) {
			salario += salario /100 * 50;
		} else if (cargo == 2) {
			salario += salario /100 * 30;
		} else if (cargo == 3) {
			salario += salario /100 * 20;
		} else {
			System.out.println("Dado inválido");
		}
		
		System.out.printf("O novo salario do funcionário é de R$ %.2f", salario);
		
		sc.close();
	}
}
