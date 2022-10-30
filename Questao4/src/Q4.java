import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int percentualP = 0, percentualI = 0;
		int[] vetor = new int[10];

		for (int f = 0; f < 10; f++) {
			System.out.print("Insira um valor para a posicao " + (f + 1) + ": ");
			vetor[f] = scan.nextInt();

			if (vetor[f] % 2 == 0) {
				percentualP = percentualP + 10;
			} else {
				percentualI = percentualI + 10;
			}
		}
		System.out.println("\nA quantidade de valores PARES dentro do vetor equivale a: " + percentualP + "%");
		System.out.println("A quantidade de valores ÍMPARES dentro do vetor equivale a :" + percentualI + "%");
	}
}
