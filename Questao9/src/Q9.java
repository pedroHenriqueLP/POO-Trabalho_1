import java.security.SecureRandom;

public class Q9 {
	public static void main(String[] args) {
		
		final int linha = 4;
		final int coluna = 4;

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < linha; i++) {
			for (int d = 0; d < coluna; d++) {
				matriz[i][d] = new SecureRandom().nextInt(9);
			}
		}
		
		for (int i = 0; i < linha; i++) {
			for (int d = 0; d < coluna; d++) {
				System.out.print("|" + matriz[i][d] + "|");
			}
			
			System.out.println("\n");
		}
	}
}