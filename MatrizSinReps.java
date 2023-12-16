package EjerciciosMatriz;

import java.util.Random;

public class MatrizSinReps {

	public static void main(String[] args) {
		// Objeto de clase Random
		Random rand = new Random();
		int numRandom;
		boolean repetido;
		// Matriz de 4x5
		int[][] numMatriz = new int[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				do {
					numRandom = 1 + rand.nextInt(20);
					repetido = false;
					// Filas anteriores
					for (int ii = 0; ii < i; ii++) {
						for (int jj = 0; jj < 5; jj++) {
							if (numMatriz[ii][jj] == numRandom)
								repetido = true;

						}
					}
					// Fila actual
					if (!repetido) {
					for (int jj = 0; jj < j; jj++) {
							if (numMatriz[i][jj] == numRandom)
								repetido = true;
						}
					}
				} while (repetido);
				numMatriz[i][j] = numRandom;
			}
		}

		// Imprimo matriz
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d\t", numMatriz[i][j]);
			}
			System.out.println("");
		}
	}

}
