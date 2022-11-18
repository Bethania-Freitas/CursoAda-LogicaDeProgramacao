
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos deseja cadastrar? ");
		int qtde = sc.nextInt();
		
		String[] nomeProduto = new String[qtde];
		double[] precoProduto = new double[qtde];
		
		for(int i = 0; i < nomeProduto.length; i++) {
			System.out.printf("Produto: ");
			nomeProduto[i] = sc.next();
			System.out.printf("Preço: ");
			precoProduto[i] = sc.nextDouble();
		}
		
		String produtoCaro = null;
		String produtoBarato = null;
		double precoCaro = 0;
		double precoBarato = 0;
		
		for (int i = 0; i < nomeProduto.length; i++) {
			if (precoProduto[i] > precoCaro) {
				precoCaro = precoProduto[i];
				produtoCaro = nomeProduto[i];
			}
		}
		
		for (int i = 0; i < nomeProduto.length; i++) {
			if (precoProduto[i] < precoCaro) {
				precoBarato = precoProduto[i];
				produtoBarato = nomeProduto[i];
			}
		}
	
		System.out.println(" ");
		System.out.println("OPERAÇÃO FINALIZADA");
		System.out.printf("Produto mais caro é o %s no valor de R$ %.2f%n", produtoCaro, precoCaro);
		System.out.printf("Produto mais barato é o %s no valor de R$ %.2f%n", produtoBarato, precoBarato);
		
	}

}
