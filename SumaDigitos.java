import java.util.Scanner;

public class SumaDigitos {
	public static void main(String[] args) {
		int sumaDigitos = 0;
		System.out.println("Introduce un n�mero: ");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		while (numero > 0) {
			sumaDigitos += (numero % 10);
			numero /= 10;
		}
		System.out.printf("La suma de los d�gitos es %d", sumaDigitos);
		teclado.close();
	}
}
