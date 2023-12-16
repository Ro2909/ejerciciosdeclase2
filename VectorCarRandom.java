package EjerciciosArrays;
import java.util.Random;

public class VectorCarRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		char[] vectorCar = new char[15];

//		char car = (char) numRandom;
		for (int i = 0; i < 15; i++) {
			int numRandom = 32 + rand.nextInt(223);  //Genero un número aleatorio entre 32 y 255
			//Por defecto, el método nextInt me genera un aleatorio entre 0 y 223
			vectorCar[i] = (char) numRandom; //Cargo el entero convirtiendolo a Char -> convierte al código ascii con ese número
		}
		
		for(char elemento:vectorCar) {
			System.out.printf("%c\n", elemento);
		}
	}

}
