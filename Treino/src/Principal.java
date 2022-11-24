import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static final int TAM = 5;
	static Aluno[] turma = new Aluno[TAM];
	static int quantAluno = 0;

	public static void main(String[] args) {
		
		int opcao = 0;
		System.out.println("---- Escola Bethânia ----");
		do {
			System.out.println();
			
			System.out.println("Digite:");
			System.out.println("1 - Cadastrar aluno");
			System.out.println("2 - Imprimir matriculas");
			System.out.println("3 - Sair");
			opcao = sc.nextInt();
			if (opcao == 1) {
				incluirAluno();
			} else if (opcao == 2) {
				imprimirMatriculas();
			} else if (opcao != 1 && opcao != 2 && opcao != 3) {
				System.out.println("Opção inválida");
			}
		} while (opcao != 3);	
			System.out.println("Sistema finalizado");
			System.out.println("Até a próxima!");
	}
	
	static void imprimirMatriculas() {
		for (int i = 0; i < quantAluno; i++ ) {
			Aluno aluno = turma[i];
			System.out.println("Matricula: " + aluno.matricula);
			System.out.println("Nota 1: " + aluno.nota1);
			System.out.println("Nota 2: " + aluno.nota2);
			System.out.println("Nota 3: " + aluno.nota3);
			System.out.println("Nota 4: " + aluno.nota4);	
			System.out.println("Media final: " + aluno.media());
			System.out.println();
		}		
	}

	static void incluirAluno() {
		Aluno a = new Aluno();
		System.out.printf("Digite o numero de matricula: ");
		a.matricula = sc.next();
		System.out.println("Digite as 4 notas do aluno");
		a.nota1 = sc.nextInt();
		a.nota2 = sc.nextInt();
		a.nota3 = sc.nextInt();
		a.nota4 = sc.nextInt();
		turma[quantAluno] = a;
		quantAluno ++;
	}
}
