package DevDojo;
//   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 Chave token
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro");
		int numero = teclado.nextInt();

		if ((numero % 2) == 0) {
			System.out.println("Esse n�mero � par!");
		} else {
			System.out.println("Esse n�mero � �mpar!");
		}

	}

}