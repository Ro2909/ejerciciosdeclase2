package EjerciciosArrays;

import java.util.Arrays;
import java.util.Random;

public class RotaElementos {

	public static void main(String[] args) {
		Random rd = new Random();
		final int LONGITUD_VECTOR = 10;
		int[] vector = new int[LONGITUD_VECTOR];
		int[] vectorRota = new int[LONGITUD_VECTOR];
		
		for(int i=0;i<10;i++) {
			vector[i] = 1 + rd.nextInt(9);
		}
		for (int elemento:vector) {
			System.out.printf(" %d ",elemento);
		}		
		vectorRota=Arrays.copyOf(vector, LONGITUD_VECTOR);
		int aux = 0, aux1 = 0;
		//Rotar las posiciones del vector una posición: recorro el vector de izq a dcha
		aux = vectorRota[0];
		for (int i=0;i<9;i++) {
			aux1 = vectorRota[i+1];
			vectorRota[i+1] = aux;
			aux = aux1;
		}
		vectorRota[0]=aux;  //Relleno la primera posición con el valor de la última
/*		//Rotar las posiciones del vector una posición: recorro el vector de dcha a izq
 		vectorRota=vector;
		int ultimaPosicion = vectorRota[LONGITUD_VECTOR-1];
		for (int i=9;i>0;i--) {
			vectorRota[i] = vectorRota[i-1];
		}
		vectorRota[0] = ultimaPosicion;
*/		
		//Muestro el vector
		System.out.println("");
		for (int elemento:vectorRota) {
			System.out.printf(" %d ",elemento);
		}

	}

}
