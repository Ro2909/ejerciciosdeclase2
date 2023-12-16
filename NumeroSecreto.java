import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {

	public static void main(String[] args) {
		Random random = new Random();
		int numSecreto = 1 + random.nextInt(10);
		int numIntentos = 5;
		boolean acierto = false;
		Scanner teclado = new Scanner(System.in);
		while ((!acierto) && (numIntentos > 0)) {
			System.out.println("Adivina el número (del 1 al 10): ");
			int numIntento = teclado.nextInt();
			if (numIntento == numSecreto) {
				System.out.printf("FELICIDADES has acertado el número %4d", numSecreto);
				acierto = true;
			} else
				numIntentos--;
		}
		if (!acierto)
			System.out.printf("Lo siento, no has acertado el número %4d", numSecreto);
		teclado.close();
	}
}
