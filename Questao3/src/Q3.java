import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		
		int[] A = new int[10];
		int total = 0;

		Scanner scan = new Scanner(System.in);

		for (int f = 0; f < 10; f++) {
			System.out.print("Insira um valor para a posicao " + (f + 1) + ": ");
			A[f] = scan.nextInt();
			total = total + A[f];
		}
		
		System.out.println("\nA soma de todos os valores do vetor e: " + total);
	}
}