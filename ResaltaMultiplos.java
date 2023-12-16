package EjerciciosAmpliacion;

import java.util.Random;
import java.util.Scanner;

public class ResaltaMultiplos {
	public static void main(String[] args) {
		// P.P. llamado ResaltaMultiplos, que rellene un array de 20 elementos
		// con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos).
		// Declaro objetos y variables del programa
		Scanner sc = new Scanner(System.in);
		int multiploResaltar;
		Random rd = new Random();
		// Declaro y dimensiono el array
		int[] matrizNum = new int[20];
		// Rellenos el array con numero Random
		for (int i = 0; i < 20; i++) {
			matrizNum[i] = rd.nextInt(401); // Entre 0 y 400
		}
		// A continuación el programa mostrará el array y preguntará si el usuario
		// quiere resaltar los múltiplos de 5 o los múltiplos de 7.
		for (int i = 0; i < 20; i++) {
			System.out.printf(" %d ", matrizNum[i]);
		}
		// Estoy pidiendo al usuario numeros hasta que introduzca un 5 o un 7
		System.out.println("");  // Salto de línea
		System.out.println("");  // Salto de línea
		do {
			System.out.print("¿Quiere resaltar múltiplos de 5 o de 7? ");
			multiploResaltar = sc.nextInt();
		} while ((multiploResaltar != 5) && (multiploResaltar != 7));
		// Seguidamente se volverá a mostrar el array escribiendo los números que se
		// quieren resaltar entre corchetes.
		System.out.println("");  // Salto de línea
		for (int i = 0; i < 20; i++) {
			if (matrizNum[i] % multiploResaltar == 0) {  // Es múltiplo 
				System.out.printf(" [ %d ] ",matrizNum[i]);
			}else {
				System.out.printf(" %d ", matrizNum[i]);	
			}
		}
		sc.close();
	}
}
