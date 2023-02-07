
/* 
  Objetivo: Crie um programa em java que receba 5 nomes e imprima na tela.
  Entrada: 5 nomes.
  Saida: Mensagem, Nome e idade.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class LerNomes {
	public static void main(String[] args) {

		String nome1, nome2, nome3, nome4, nome5;
		String[] nome = new String[5];
		Scanner ler = new Scanner(System.in);
 
		System.out.print("Digite o nome 1:\n");
		nome1 = ler.next();
		System.out.print("Digite o nome 2:\n");
		nome2 = ler.next();
		System.out.print("Digite o nome 3:\n");
		nome3 = ler.next();
		System.out.print("Digite o nome 4:\n");
		nome4 = ler.next();
		System.out.print("Digite o nome 5:\n");
		nome5 = ler.next();

		System.out.print("\nNome 1:\t" + nome1);
		System.out.print("\nNome 2:\t" + nome2);
		System.out.print("\nNome 3:\t" + nome3);
		System.out.print("\nNome 4:\t" + nome4);
		System.out.print("\nNome 5:\t" + nome5);

		if (nome1.equalsIgnoreCase("Rafael")) {
			System.out.print("\n\nNome Inválido:\t" + nome1);
		}
		System.out.print("\n");

		// Usando loop
		for (int i = 0; i < 5; i++) {
			System.out.print("\nDigite o Nome "+(i+1) +": ");
			nome[i] = ler.next();
		}

		for (int i = 0; i < 5; i++) {
			System.out.print("\nNome:\t" + nome[i]);
		}
		ler.close();
	}

}
