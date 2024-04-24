package estruturaRepeticao;

import java.util.Scanner;

public class MediaSalarial {

	public static void main(String[] args) {

		int funcionarios, salario, media, soma=0;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a quantidade de funcionários: ");
		funcionarios = ler.nextInt();


		for (int i = 1; i <= funcionarios; i++) {
			System.out.println("Informe o salário dos funcionários: ");
			salario = ler.nextInt();
			
			 soma += salario;
		}
		media = soma/funcionarios;
		System.out.println("A média salarial é: " + media);

	}
}