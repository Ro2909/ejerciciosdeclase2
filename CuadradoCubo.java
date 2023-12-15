package EjerciciosArrays;
import java.util.Random; //Para poder utilizar la clase que me maneja numeros aleatorios
public class CuadradoCubo {
	public static void main(String[] args) {
		//Defino tres arrays de 20 numeros enteros cada uno
		int[] numero, cuadrado, cubo;
		//Dimensiono mis arrays
		numero = new int[20];
		cuadrado = new int[20];
		cubo = new int[20];
		
		//Creo un objeto de la clase Random
		Random numRandom;
		//Creo una instancia de la clase Random para el objeto recien creado
		numRandom = new Random();
		//Cargo el array 'numero' con valores aleatorios entre 0 y 100
		for (int i=0;i<20;i++) {
			numero[i] = 1 + numRandom.nextInt(100);
		}
		//En el array 'cuadrado' cargo los cuadrados de los valores que hay en el array 'numero'
		for (int i=0;i<20;i++) {
			cuadrado[i] = numero[i]*numero[i];
		}
		//En el array 'cubo' cargo los cubos de los valores que hay en el array 'numero'
		for (int i=0;i<20;i++) {
			cubo[i] = cuadrado[i]*numero[i];
		}			
		//Muestros los tres arrays en tres columnas
		System.out.println("NUMEROS\t\tCUADRADOS\tCUBOS");
		System.out.println("-------\t\t----------\t------");
		for (int i=0;i<20;i++) {
			System.out.printf("%d\t\t%d\t\t%d\n",numero[i],cuadrado[i],cubo[i]);
		}			
	}

}
