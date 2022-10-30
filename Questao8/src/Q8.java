import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c;
		int l;
		double[][] matriz = new double[2][5];

		for (l = 0; l < 2; l++) {
			for (c = 0; c < 5; c++) {
				System.out.println("Informe os valores da matriz: ");
				matriz[0][c] = scan.nextDouble();
			}
			for (c = 0; c < 5; c++) {
				System.out.println("Informe os valores da matriz: ");
				matriz[1][c] = scan.nextDouble();
			}

			for (l = 0; l < 2; l++) {
				for (c = 0; c < 5; c++) {
					System.out.print("{" + matriz[l][c] + "}");
				}
				System.out.println("\n");
			}
		}
	}
}