public class Q1 {

	public static void main(String[] args) {

		int[] A = new int[10];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		A[5] = 6;
		A[6] = 7;
		A[7] = 8;
		A[8] = 9;
		A[9] = 10;

		int[] B = new int[A.length];

		for (int f = 0; f < 10; f++) {
			B[f] = A[f] * f;
		}

		for (int f = 0; f < 10; f++) {
			System.out.println("Vetor A, posicao " + (f + 1) + " --> " + A[f]);
		}

		System.out.println("\n===========================\n");

		for (int f = 0; f < 10; f++) {
			System.out.println("Vetor B, posicao " + (f + 1) + " --> " + B[f]);
		}
	}
}