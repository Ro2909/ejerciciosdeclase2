package EjerciciosAmpliacion;
import java.util.Random;
import java.util.Scanner;
public class RotaNumeroUsr {

	public static void main(String[] args) {
		//P.P. llamado RotaNumeroUsr, que muestre por pantalla un array de 10 n�meros enteros 
		//generados al azar entre 0 y 100
		int[] vector = new int[10];
		Random rand = new Random();
		Scanner teclado = new Scanner(System.in);
		int numUsr = 0;
		boolean salirBucle = false;
		
		for (int i=0;i<10;i++) {
			vector[i] = rand.nextInt(101);
			System.out.printf(" %d ",vector[i]);
		}
		System.out.println("");  //Salto de l�nea
		System.out.println("");  //Salto de l�nea
		//A continuaci�n, el programa debe pedir un n�mero al usuario. 
		//Se debe comprobar que el n�mero introducido por teclado se encuentra dentro del array 
		//y, en caso contrario se mostrar� un mensaje por pantalla (�El n�mero X no est� en el Array�), 
		//y se volver� a pedir un n�mero; as� hasta que el usuario introduzca un n�mero que se encuentre en el array. 		
		do {
			System.out.print("Introduce un n�mero (entre 0 y 100): ");
			numUsr = teclado.nextInt();
			for (int i=0;i<10;i++) {
				if (vector[i]==numUsr) salirBucle = true;
			}
		}while (!salirBucle);
		//A continuaci�n, el programa rotar� el array hacia la derecha las veces que haga falta 
		//hasta que el n�mero introducido quede situado en la posici�n 0 del array.
		int aux=0, aux1=0;
		while (!(vector[0]==numUsr)){
			//Roto una posici�n a la derecha
			aux1 = vector[0];
			for (int i=0;i<9;i++) {
				aux = vector[i+1];
				vector[i+1]=aux1;
				aux1 = aux;
			}
			vector[0]=aux;
		}
		//Por �ltimo, se mostrar� el array rotado por pantalla.
		for (int i=0;i<10;i++) {
			System.out.printf(" %d ",vector[i]);
		}
		teclado.close();
	}
}
