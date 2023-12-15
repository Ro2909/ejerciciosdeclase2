import java.util.Scanner;

public class CalculaPotencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cálculo de una potencia");
//Pido al usuario que introduzca la BASE
		System.out.print("Introduzca la base: ");
		int base = teclado.nextInt();
//Pido al usuario que introduzca la POTENCIA
		System.out.print("Introduzca el exponente: ");
		int exponente = teclado.nextInt();
//Declaro la variable que me va a contener el resultado de calcular la potencia
//Además, esta variable la declaro como double ya que podrá tener decimales  	
		double potencia = 1;
// Además, obtengo el valor absoluto del exponente, por si es negativo
		int absExponente = Math.abs(exponente); 		
//Cualquier número elevado a 0 es igual a 1
		if (absExponente == 0) {
			potencia = 1;
		}
		else{  
			/*Si el exponente es mayor a 0: el calculo de la potencia es igual a 
			  multiplicar el número por si mismo el número de veces que indique el 
			  exponente. Es decir: (potencia = potencia * base) repetido las veces que determine el EXPONENTE
			  Ejemplos: 2^1 --> (potencia = potencia * 2) repetido 1 vez 
			  					como potencia vale 1, el resultado será 2
			  			3*4 --> (potencia = potencia * 3) repetido 4 veces. Es decir:
			  					1a Iteración: (potencia = potencia * 3), como potencia tiene inicialmente el valor 1, el resultado es 3
			  					2a Iteración: (potencia = potencia * 3), como potencia tiene el valor 3, el resultado es 9
			  					3a Iteración: (potencia = potencia * 3), como potencia tiene el valor 9, el resultado es 27
			  					4a Iteración: (potencia = potencia * 3), como potencia tiene el valor 27, el resultado es 81
			 */
			for (int i = 1; i <= absExponente; i++) {
				potencia *= base;
			}
		}
// Ya tengo calculada la pontencia.
// Si el exponente es negativo, tengo que dividir 1 entre la potencia
		if (exponente < 0) {
			potencia = 1 / potencia;
		}
// Muestro el resultado
		System.out.printf("\n%d ^ %d = %.4f\n",base,exponente,potencia);
		teclado.close();

	}

}
