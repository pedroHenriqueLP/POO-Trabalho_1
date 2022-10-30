import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] Result = new double[10];

		for (int f = 0; f < nota1.length; f++) {

			System.out.print("Insira o valor da nota 1 para o(a) " + (f + 1) + " aluno(a): ");
			nota1[f] = scan.nextDouble();

			System.out.print("Insira o valor da nota 2 para o(a) " + (f + 1) + " aluno(a): ");
			nota2[f] = scan.nextDouble();

			Result[f] = (nota1[f] + nota2[f]) / 2;

			if (Result[f] >= 7.0) {
				System.out.println("O aluno " + (f + 1) + " foi APROVADO com media: " + Result[f] + "\n");
			} else {
				System.out.println("O aluno " + (f + 1) + " foi REPROVADO com media: " + Result[f] + "\n");
			}
		}
	}
}