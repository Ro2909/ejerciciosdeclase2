package EjerciciosAmpliacion;

import java.util.Random;

public class DiagonalMatriz {
	public static void main(String[] args) {
		// P.P. llamado DiagonalMatriz, que muestre por pantalla un array de 10 filas
		// por 10 columnas
		// relleno con números aleatorios entre 200 y 300
		Random randomize = new Random();
		final int FILA = 10, COL = 10;
		int[][] matriz = new int[FILA][COL];
		for (int i = 0; i < FILA; i++) {
			for (int j = 0; j < COL; j++) {
				matriz[i][j] = 200 + randomize.nextInt(101); // Aleatorios entre 200 y 300
			}
		}
		// A continuación, el programa debe mostrar los números de la diagonal que va
		// desde
		// la esquina superior izquierda a la esquina inferior derecha,
		// así como el máximo, el mínimo y la media de los números que hay en esa
		// diagonal.
		for (int i = 0; i < FILA; i++) {
			for (int j = 0; j < COL; j++) {
					System.out.printf(" % d ",matriz[i][j]);
				}
			System.out.println("");  //Salto de línea
			}
		int diagonalMin = Integer.MAX_VALUE, diagonalMax = Integer.MIN_VALUE;
		double diagonalSuma = 0;  
		System.out.println("\nNUMEROS DE LA DIAGONAL DE IZQ A DRCHA");
		System.out.println("──────────────────────────────────────");
		for (int i = 0; i < FILA; i++) {
			for (int j = 0; j < COL; j++) {
				if (i==j) { //Estoy en la diagonal
					System.out.printf(" % d ",matriz[i][j]);
					if (matriz[i][j]<diagonalMin) {
						diagonalMin = matriz[i][j];  //Nuevo numero menor encontrado 
					}
					if (matriz[i][j]>diagonalMax) {
						diagonalMax = matriz[i][j];  //Nuevo numero mayor encontrado       
					}
					diagonalSuma += matriz[i][j];
				}
			}	
		}
		System.out.println("");  //Salto de línea
		System.out.printf("El menor es %d, el mayor es %d y la medía es %.2f",diagonalMin,diagonalMax,(diagonalSuma/FILA));
	}

}
