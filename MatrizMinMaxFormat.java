package EjerciciosMatriz;

import java.util.Random;

public class MatrizMinMaxFormat {

	public static void main(String[] args) {
		Random rd = new Random();
		final int FILAS = 6, COLUMNAS = 10;
		int numMin = Integer.MAX_VALUE, numMax = Integer.MIN_VALUE, filaMin = 0, colMin = 0, filaMax = 0, colMax = 0;
		// Matriz de 6x10
		int[][] numMatriz = new int[FILAS][COLUMNAS];

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				numMatriz[i][j] = rd.nextInt(1000);
			}
		}
		// Ahora recorro la matriz buscando el menor y el mayor
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (numMatriz[i][j] < numMin) {
					numMin = numMatriz[i][j];
					filaMin = i;
					colMin = j;
				}
				if (numMatriz[i][j] > numMax) {
					numMax = numMatriz[i][j];
					filaMax = i;
					colMax = j;
				}
			}
		}
		// Muestro los resultados
		System.out.print("    ┌");
		for (int i = 0; i < COLUMNAS; i++) {
			System.out.print("─────────");
		}
		System.out.println("┐");
		for (int i = 0; i < FILAS; i++) {
			System.out.print("    │  ");
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.printf("%d\t", numMatriz[i][j]);
			}
			System.out.println("       │"); // Salto de linea
		}
		System.out.print("    └");
		for (int i = 0; i < COLUMNAS; i++) {
			System.out.print("─────────");
		}
		System.out.println("┘");

		System.out.printf("\nEl numero MENOR es el %d y está el la Fila: %d / Columna: %d\n", numMin, filaMin + 1,
				colMin + 1);
		System.out.printf("\nEl numero MAYOR es el %d y está el la Fila: %d / Columna: %d\n", numMax, filaMax + 1,
				colMax + 1);

	}
}
