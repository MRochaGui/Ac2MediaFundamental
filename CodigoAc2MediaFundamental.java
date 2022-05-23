package application;

import java.util.Scanner;

public class Ac2MediaFundamental {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float n1, n2, n3, media; // notas e médias
		int ra; // R.A precisa ser inteiro nesse caso.

		System.out.println("Por favor insira o seu R.A: ");
		ra = ler.nextInt();

		if (ra == 0) {   // Se o R.A for 0 então printa na tela que o R.A é inválido e acaba o código.
			System.out.println("R.A Inválido.");
		}

		else { // se o R.A não for falso, o aluno irá inserir suas notas.

			System.out.println("Insira a sua primeira nota: ");
			n1 = ler.nextFloat();

			System.out.println("Insira a sua segunda nota: ");
			n2 = ler.nextFloat();

			System.out.println("Insira a sua terceira e ultima nota: ");
			n3 = ler.nextFloat();
			ler.close(); // fechar leitor para economizar mémoria.

			media = (n1 + n2 + n3) / 3; // soma das 3 notas do aluno divida por 3 pra obter a média

			if (media >= 8 && media <= 10) { // se for maior ou igual a 8 e menor ou igual a 10.
				System.out.printf("Sua média é %f, parabens você foi aprovado!", media);
			} else if (media >= 6 && media < 8) { // se for maior ou igual a 6 e menor que 8.
				System.out.printf("Sua média é %f, você está de recuperação!", media);
			} else if (media < 0 || media > 10) { // se o aluno errar na digitação e o resultado das notas for uma media
													// maior que 10 ou menor que 0.
				System.out.println("Sua média é inválida, por favor verifique os dados digitados.");
			} else {
				System.out.printf("Sua média é %f, você foi reprovado!", media);// se a média for menor que 6.
			}
		}
	}

}
