
/* 
  Objetivo: Escreva um programa que recebe uma letra e uma palavra e substitui cada ocorrência da letra informadapor '*' em mostra 
  na saída padrão a palavra modificada.
  Entrada: Letra, Palavra.
  Saida: Palavra modificada.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class TrocaLetras {

	public static void main(String[] args) {
		int quantidade, i;
		char letra;
		String palavra;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma Letra: ");
		letra = entrada.nextLine().charAt(0);

		System.out.println("Digite uma Palavra: ");
		palavra = entrada.nextLine();
		quantidade = palavra.length();
		try {
			for (i = 0; i < quantidade; i++) {
				if (palavra.charAt(i) == letra) {
					palavra = palavra.replace(letra, '*');
				}
			}
			System.out.println("A palavra modificada e: " + palavra);
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		entrada.close();
	}

}
