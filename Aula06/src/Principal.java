import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static final int TAM = 5;
	static final int TAM_NOTA = 4;
	static Aluno[] turma = new Aluno[TAM];
	static int quantAlunos = 0; 

	public static void main(String[] args) {
		int opcao = 0;
		do {
			System.out.println("Digite 1 para incluir aluno ou 2 para impressão das notas, ou zero para encerrar");
			opcao = sc.nextInt();	
			if (opcao == 1) {
				incluirAluno();
			} else if (opcao == 2) {
				imprimirNotas();
			}
		} while (opcao != 0) ;
			
			
		
		
//		for (int i = 0; i < 2; i ++) {
//			Aluno a = turma[i]; 
//			System.out.println(a.matricula);
//			System.out.println(a.nota1);
//			System.out.println(a.nota2);
//			System.out.println(a.nota3);
//			System.out.println(a.nota4);
//		}
		
		
	}
	
	static void imprimirNotas() {
		for (int i = 0; i < quantAlunos; i++) {
			Aluno aluno = turma[i];
			System.out.println(aluno.matricula);
			for (float nota : aluno.notas) {
				System.out.println(nota);
			}
			System.out.println(calculaMedia(aluno));
		}		
	}

	static float calculaMedia(Aluno aluno) {
		float soma = 0;
		for (float nota : aluno.notas) {
			soma += nota;			
		}		
		return soma /aluno.notas.length;
	}	
	
	static void incluirAluno() {

		System.out.printf("Digite o numero de matricula: ");		
		Aluno a1 = new Aluno();		
		a1.matricula = sc.next();
		System.out.println("Digite as 4 notas do aluno:");
		for (int i = 0; i < TAM_NOTA; i++ ) {
			a1.notas[i] = sc.nextFloat();				
		}
		turma[quantAlunos] = a1;
		quantAlunos ++;
	}
}



//Aluno a2 = new Aluno();		
//a2.matricula = "002";
//a2.notas[0] = 9;
//a2.notas[1] = 5;
//a2.notas[2] = 7;
//a2.notas[3] = 8;
//turma[1] = a2;
