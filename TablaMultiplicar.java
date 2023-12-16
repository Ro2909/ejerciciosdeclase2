import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un n�mero: ");
		int num = sc.nextInt();
		while (num < 1 || num > 10) {
			System.out.println("El n�mero debe estar comprendido entre 1 y 10");
			System.out.print("Introduce otro n�mero: ");
			num = sc.nextInt();
		}
		System.out.println("");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d por %d igual a %d \n", num, i, (num * i));
		}
		sc.close();
	}
}
