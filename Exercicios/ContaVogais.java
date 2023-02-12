
/* 
  Objetivo: Escreva um programa que recebe uma frase e mostra quantas vogais e consoantes tem na frase, no final mostre uma mensagem
  dizendo quantos A, E, I, O e U tem, e quantas consonates tem.
  Entrada: Uma palavra ou frase.
  Saida: Quantidade de Vogais.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class ContaVogais {

	public static void main(String[] args) {
		String frase;
		int quantidade, j, a = 0, e = 0, i = 0, o = 0, u = 0, consoantes;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma frase: ");
		frase = entrada.nextLine();
		quantidade = frase.length();

		try { // Usei o Try apenas para tratar o erro do Scanner.close() para poder fechar lá em baixo sem dar erro.
			consoantes = 0;
			for (j = 0; j < quantidade; j++) {
				if (frase.charAt(j) == 'a') {
					a = a + 1;
				}else if (frase.charAt(j) == 'e') {
					e = e + 1;
				}else if (frase.charAt(j) == 'i') {
					i = i + 1;
				}else if (frase.charAt(j) == 'o') {
					o = o + 1;
				}else if (frase.charAt(j) == 'u') {
					u = u + 1;
				}else{
					consoantes++;
				}
			}
			System.out.println("A: " + a);
			System.out.println("E: " + e);
			System.out.println("I: " + i);
			System.out.println("O: " + o);
			System.out.println("U: " + u);
			System.out.println("Consoantes: " + consoantes);
		} catch (Error erro) {
			System.out.println("Não foi possivel realizar a operação, erro: "+erro);
		}
		entrada.close();
	}
}
