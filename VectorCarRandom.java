package EjerciciosArrays;
import java.util.Random;

public class VectorCarRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		char[] vectorCar = new char[15];

//		char car = (char) numRandom;
		for (int i = 0; i < 15; i++) {
			int numRandom = 32 + rand.nextInt(223);  //Genero un n�mero aleatorio entre 32 y 255
			//Por defecto, el m�todo nextInt me genera un aleatorio entre 0 y 223
			vectorCar[i] = (char) numRandom; //Cargo el entero convirtiendolo a Char -> convierte al c�digo ascii con ese n�mero
		}
		
		for(char elemento:vectorCar) {
			System.out.printf("%c\n", elemento);
		}
	}

}
