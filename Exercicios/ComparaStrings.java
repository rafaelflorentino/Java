/* 
  Objetivo: Escreva um programa Compara strings, onde que receba duas Strings eé diga qual é a maior, qual a menor ou se as duas
  são do mesmo tamamnho.
  Entrada: Duas Strings.
  Saida: Mensagem informando qual e maior ou se são do mesmo tamanho.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;
public class ComparaStrings {

	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira String: ");
		str1 = entrada.nextLine();
		System.out.println("Digite a Segunda String: ");
		str2 = entrada.nextLine();

		if (str1.length() > str2.length()) {
			System.out.println("A primeira String e a maior!");
			System.out.println("Conteudo da String: " + str1);
		}else if (str2.length() > str1.length()) {
			System.out.println("A Segunda String e a maior!");
			System.out.println("Conteudo da String: " + str2);
		}else if (str2.length() == str1.length()) {
			System.out.println("As duas Strings tem o mesmo tamanho.");
			System.out.println("Conteudo da Primeira String: " + str1);
			System.out.println("Conteudo da Segunda String: " + str2);
		}else{
			System.out.println("Erro Fatal."); // inutil
		}
		entrada.close();
	}
}
