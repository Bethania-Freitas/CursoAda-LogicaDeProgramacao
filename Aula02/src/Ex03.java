import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario atual: ");
		double salario = sc.nextDouble();
		
		double inss = salario/100 * 7.5;
		double tercoFerias = salario/3;
		double inssAnual = inss * 13;
		double salarioliquido = (salario*13) + tercoFerias - inssAnual;
		double salarioMedia = (salario * 13)/12;
		
		
		
		System.out.printf("O salario médio: R$ %.2f%n", salarioMedia);
		System.out.printf("INSS: R$ %.2f%n", inss);
		System.out.printf("Terço Férias: R$ %.2f%n", tercoFerias);
		System.out.println("--------------------------------");
		System.out.printf("Salario Liquido: R$ %.2f%n", salarioliquido);
		
		sc.close();
		
	}
}
