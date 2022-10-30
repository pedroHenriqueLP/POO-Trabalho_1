import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int par = 0, impar = 0;
        int l;
        int c;
        int[][] M = new int[3][3];

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                System.out.println("Informe os valores da matriz: ");
                M[0][c] = scan.nextInt();
            }
            for (c = 0; c < 3; c++) {
                System.out.println("Informe os valores da matriz: ");
                M[1][c] = scan.nextInt();
            }
            for (c = 0; c < 3; c++) {
                System.out.println("Informe os valores da matriz: ");
                M[2][c] = scan.nextInt();
            }
            for (l = 0; l < 3; l++) {
                for (c = 0; c < 3; c++) {

                    if (M[l][c] % 2 == 0) {
                        par = par + 1;
                    } else {
                        impar = impar + 1;
                    }
                }
            }
            System.out.println("Existem " + par + " numeros pares e " + impar + " numeros impares denro da matriz M");
        }
	}
}