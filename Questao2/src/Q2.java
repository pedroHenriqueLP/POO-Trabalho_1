import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[10];	
		
		//Pede os valores para o vetor A
		for (int f = 0; f < A.length; f++) {
			System.out.print("Insira o valor para a posicao " + (f + 1) + " do vetor A >");
			A[f] = scan.nextInt();
		}

		System.out.print("\n\n");

		//Pede os valore para o vetor B
		for (int f = 0; f < B.length; f++) {
			System.out.print("Insira o valor para a posicao " + (f + 1) + " do vetor B >");
			B[f] = scan.nextInt();
		}


		//Calcula os valores do vetor C
		for (int f = 0; f < C.length; f++) {
			C[f] = (A[f] + B[f]);
		}


		//Imprime todos os valores na tela
		System.out.print("\n\nValores do Vetor A: | ");	
		for (int f = 0; f < A.length; f++) {
			System.out.print(A[f] + " | ");
		}
		System.out.print("\n\nValores do Vetor B: | ");
		for (int f = 0; f < B.length; f++) {
			System.out.print(B[f] + " | ");
		}
		System.out.print("\n\nValores do Vetor C: | ");
		for (int f = 0; f < C.length; f++) {
			System.out.print(C[f] + " | ");
		}
	}
}