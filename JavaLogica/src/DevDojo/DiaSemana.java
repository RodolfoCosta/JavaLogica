package DevDojo;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {

		System.out.println("PROGRAMA INICIADO");

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro de 1 � 7");
		int numero = teclado.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Hoje � domingo");
			break;
		case 2:
			System.out.println("Hoje � segunda-feira");
			break;
		case 3:
			System.out.println("Hoje � ter�a-feira");
			break;
		case 4:
			System.out.println("Hoje � quarta-feira");
			break;
		case 5:
			System.out.println("Hoje � quinta-feira");
			break;
		case 6:
			System.out.println("Hoje � sexta-feira");
			break;
		case 7:
			System.out.println("Hoje � S�bado");
			break;

		default:
			System.out.println("N�MERO INV�LIDO");
			break;
		}
		System.out.println("PROGRAMA ENCERRADO");
	}

}
