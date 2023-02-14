/* 
  Objetivo: Escreva um programa que recebe uma letra e uma palavra e mostre: a letra informada, a palavra 
  informada e a primeira posição que a letra informada aparece na palavra, ou a mensagem que a palavra não tem a letra informada.
  Entrada: Letra, Palavra.
  Saida: Letra, Pallavra, posição da letra na palavra.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class LetraPalavra {
	public static void main(String[] args) {
		String palavra;
		char letra;
		int quantidade, i;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma Letra: ");
		letra = entrada.nextLine().charAt(0);

		System.out.println("Digite uma Palavra: ");
		palavra = entrada.nextLine();

		System.out.println("\nLetra: " + letra);
		System.out.println("Palavra: " + palavra);

		quantidade = palavra.length();
		entrada.close();

		for (i = 0; i < quantidade; i++) {
			if (palavra.charAt(i) == letra) {
				System.out.println("\nLetra: " + letra + " Posicao: " + i);
				return;
			}
		}
		System.out.println("\nA palavra não contêm a letra informada. ");
	}
}
