package EjerciciosArrays;

public class VectorNumeros {

	public static void main(String[] args) {
		//El método main() ha sido generado automáticamente
		int[] vecNum = new int[10];
		
		vecNum[0]=39;
		vecNum[1] = -2;
		vecNum[4] = 0;
		vecNum[6] = 14;
		vecNum[8] = 5;
		vecNum[9] = 120;
		
		System.out.print("Indice    ");
		for (int i=0;i<10;i++) {
			System.out.printf("\t%d ",i);
		} 
		System.out.printf("\nValor    ");
		for (int elemento:vecNum) {
			System.out.printf("\t%d ",elemento);	
		}
	}

}
