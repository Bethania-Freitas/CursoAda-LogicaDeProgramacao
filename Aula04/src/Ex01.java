import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean buscaValor = false;
		int posicao = 0;
		
		System.out.println("Digite um valor inteiro: ");
		int k = sc.nextInt();

		System.out.println("Qual o tamanho do vetor: ");
		int qtde = sc.nextInt();
		
		int[] vetor = new int[qtde];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o valor do %s elemento", i+1);
			vetor[i] = sc.nextInt();
		}
		
		for(int i = 0; i<vetor.length; i++) {
			if (vetor[i] == k) {
				buscaValor = true;
				posicao = vetor[i];				
			}
		}
		
		if (buscaValor == true) {
			System.out.println("Valor encontrado, posição " + posicao);
		} else {
			System.out.println("Valor não encontrado");
		}
		
		sc.close();
	}

}
