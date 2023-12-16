package EjerciciosArrays;

import java.util.Scanner; //Para poder utilizar la clase Scanner

public class NumerosInverso {
	public static void main(String[] args) {
		// Definimos un array de 10 elementos enteros
		int[] vecNumeros = new int[10];
		int i = 0;
		// Defino la clase que me permitirá leer desde teclado
		Scanner teclado = new Scanner(System.in);
		// Pido 10 números por teclado
		while (i < 10) {
			System.out.printf("Introduce el numero %d, por favor: ", i+1);
			vecNumeros[i] = teclado.nextInt();
			i++;
		}		
		teclado.close();
		//Muestro los números en orden inverso --> recorro mi array al revés
		System.out.println("");
		for (i = 9; i>=0; i--) {
			System.out.printf("%d ",vecNumeros[i]);
		}

	}

}
