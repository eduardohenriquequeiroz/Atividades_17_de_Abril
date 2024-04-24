package estruturaRepeticao;

import java.util.Scanner;

public class somaMedia {

	public static void main(String[] args) {
		int num, soma = 0, media;

		Scanner ler = new Scanner(System.in);

		for (int i = 1; i <=5; i++) {
			System.out.println("Informe o número: ");
			num = ler.nextInt();

			soma += num;

		}

		media = soma/5;

		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
		ler.close();
	}

}
