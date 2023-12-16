package EjerciciosAmpliacion;
//Importo la clase Random para poder utilizarla en mi programa
import java.util.Random;

public class TresTirosDado {
//M�todo principal: main()
	public static void main(String[] args) throws InterruptedException{
		//
		Random rd; //Creo una variable de tipo Random (de momento apunta a NULL)
		rd = new Random(); //Creo una instancia de la clase Random y la meto en mi variable de tipo Random
		int cont; //Creo una variable ENTERA que utilizar� como contador en los bucles
		int tirada;  //Creo una variable ENTERA que contendr� el resultado de tirar un dado
		int posicionesAvanza=0; //Creo una variable ENTERA que acumular� el resultado de cada tirada de dado Y LA INICIZALIZO CON 0
		//Tengo que generar 3 tiradas de dado: Es decir, crear tres n�mero aleatorios
		//comprendidos entre 1 y 6 (posibles valores de la cara de un dado)
		//Hago solo una vez la generaci�n de un n�mero aleatorio entre 1 y 6. Y lo repito 3 veces gracias a un bucle FOR
		for (cont=1;cont<=3;cont++) {
			tirada = 1+rd.nextInt(6);  //Genera aleaotoriamente un entero entre 0 y 5, y le sumo 1
			posicionesAvanza+=tirada;
			System.out.printf("Resultado tirada %d: %d\n",cont,tirada);
			Thread.sleep(1500);
		}
		System.out.printf("\nDeber�s avanzar %d posiciones\n",posicionesAvanza);
	}
}
