package estruturaRepeticao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		int resultado =1, numero;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um número: ");
		numero = ler.nextInt();

		for (int i = 1; i <= numero; i++ ) {
			resultado *= i;
		}
		System.out.println("O fatorial do número escolhido é: " + resultado);

	}

}
