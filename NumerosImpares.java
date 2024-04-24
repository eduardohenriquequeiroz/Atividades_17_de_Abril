package estruturaRepeticao;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		int inicial, fim;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o valor inicial: ");
		inicial = ler.nextInt();

		System.out.println("Informe o valor final: ");
		fim = ler.nextInt();

		for(int i = inicial; i <= fim; i++) {

			if (i %2 == 1 ) {
				System.out.println("Os seguintes números são ímpares: " + i);
			}
			else {
				System.out.println("Os seguintes números são pares: " + i);
			}
			ler.close();
		}

	}

}
