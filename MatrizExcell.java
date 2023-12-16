package EjerciciosMatriz;

import java.util.Random;

public class MatrizExcell {

	public static void main(String[] args) throws InterruptedException {
		// Objeto de clase Random
		Random rand = new Random();
		int sumaFila = 0, sumaCol = 0;
		// Matriz de 4x5
		int[][] numMatriz = new int[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				numMatriz[i][j] = 1 + rand.nextInt(10);
			}
		}

		// Muestro los resultados con los sumatorios
		for (int i = 0; i < 4; i++) {
			sumaFila = 0;
			for (int j = 0; j < 5; j++) {
				sumaFila = sumaFila + numMatriz[i][j];
				Thread.sleep(400);
				System.out.printf("%d\t\t", numMatriz[i][j]);
			}
			Thread.sleep(800);
			System.out.printf("SUMA: %d\n", sumaFila);
		}
		// Hago el sumatorio de las columnas
		for (int j = 0; j < 5; j++) {
			sumaCol = 0;
			for (int i = 0; i < 4; i++) {
				sumaCol = sumaCol + numMatriz[i][j];
			}
			Thread.sleep(800);
			System.out.printf("SUMA: %d\t", sumaCol);
		}
	}

}
