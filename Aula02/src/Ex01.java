import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 2 valores para localizar no quadrante:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		boolean A = x < 0 && y > 0;
		boolean B = x > 0 && y > 0;
		boolean C = x < 0 && y < 0;
		boolean D = x > 0 && y < 0;
		String eixo;
		
//		if (A) {
//			eixo = "A";
//		} else if (B) {
//			eixo = "B";
//		} else if (C) {
//			eixo = "C";
//		} else if (D) {
//			eixo = "D";
//		} else {
//			eixo = "zero";
//		}
		
		eixo = A ? "A" : B ? "B" : C ? "C" : D ? "D" : "zero";
		
		System.out.println(" Eixo = " + eixo);
		
		sc.close();

	}

}
