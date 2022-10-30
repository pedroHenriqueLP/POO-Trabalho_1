import java.util.*;

public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] vetor1 = new int[6];
		int[] vetor2 = new int[6];

		System.out.println("Escreva 6 numeros inteiros: ");

		System.out.println("Primeiro valor: ");
		vetor1[0] = in.nextInt();
		System.out.println("Segundo valor: ");
		vetor1[1] = in.nextInt();
		System.out.println("Terceiro valor: ");
		vetor1[2] = in.nextInt();
		System.out.println("Quarto valor: ");
		vetor1[3] = in.nextInt();
		System.out.println("Quinto valor: ");
		vetor1[4] = in.nextInt();
		System.out.println("Sexto valor: ");
		vetor1[5] = in.nextInt();

		for (int i = 0; i < vetor1.length; i++) {
			vetor2[i] = (vetor1[i] % 2 == 0) ? 1 : 0;
		}

		System.out.print(" Vetor A | ");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + " | ");
		}
		System.out.println(" ");

		System.out.print(" Vetor B | ");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + " | ");
		}
	}
}
