import java.util.Scanner;

public class SpiralMatrixClassic {

	public static void main(String[] args) {
		int[][] matrix;

		matrix = getInput();

		fillMatrix(matrix);

		printMatrix(matrix);

	}

	public static int[][] getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("N = ");
		int n = input.nextInt();
		int[][] matrix = new int[n][n];
		input.close();
		return matrix;
	}

	public static void fillMatrix(int[][] matrix) {

		int n = matrix.length;
		int i = 1;
		int c1 = 0;
		int c2 = n - 1;
		int r1 = 0;
		int r2 = n - 1;
		while (i <= n * n) {
			
			for (int row = c1; row <= c2; row++) {
				matrix[r1][row] = i++;
			}

			for (int col = r1 + 1; col <= r2; col++) {
				matrix[col][c2] = i++;
			}

			for (int row = c2 - 1; row >= c1; row--) {
				matrix[r2][row] = i++;
			}

			for (int row = r2 - 1; row >= r1 + 1; row--) {
				matrix[row][c1] = i++;
			}

			c1++;
			c2--;
			r1++;
			r2--;
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
