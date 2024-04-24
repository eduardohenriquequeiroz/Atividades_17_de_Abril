package estruturaRepeticao;

import java.util.Scanner;

public class SomaParImpar {

	public static void main(String[] args) {
		int num = 0, somaimpar = 0, somapar = 0;

		Scanner ler = new Scanner(System.in);

		for (int i=1; i <=10; i++) {
			System.out.println("Informe um número: ");
			num = ler.nextInt();

			if (num %2 == 0) {
				somapar++; 
			}
			else {
				somaimpar++;
			}
		}
		System.out.println("A quantidade de números pares é: " + somapar);
		System.out.println("A quantidade de números ímpares é: " + somaimpar);
		ler.close();
	}
}



