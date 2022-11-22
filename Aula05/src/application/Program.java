package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite a matricula do aluno %s\n", i+1);
			String matricula = sc.next();
			System.out.printf("Digite as quatro notas do aluno %s\n", i+1);
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			double nota4 = sc.nextDouble();
			new Alunos();		
		}

		
	


	}
}
