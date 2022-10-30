import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] vetor1 = new int[10];
		
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
		System.out.println("Setimo valor: ");
		vetor1[6] = in.nextInt();
		System.out.println("Oitavo valor: ");
		vetor1[7] = in.nextInt();
		System.out.println("Nono valor: ");
		vetor1[8] = in.nextInt();
		System.out.println("Decimo valor: ");
		vetor1[9] = in.nextInt();

		for (int i = 0; i < vetor1.length - 1; i++) {
			for (int j = 0; j < vetor1.length - 1 - i; j++) {

				if (vetor1[j] > vetor1[j + 1]) {
					int temp = vetor1[j];
					vetor1[j] = vetor1[j + 1];
					vetor1[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + "|");
		}
	}
}
