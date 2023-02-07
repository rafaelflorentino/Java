/* 
  Objetivo: Crie um programa em java que receba varios nomes de meses sempre seguidos por ; ao final, exp:(janeiro;fevereiro;) 
  e divida essa string contendo os meses e salve cada mês em uma posição de uma array de string chamada meses, depois imprima 
  na tela os elemento dessa array.
  Observação: Precisa mandar os argumentos pelo terminal: java RecebendoArgs "rafael" 29 
  Entrada: Nome dos meses seguido por ponto e virgula ";".
  Saida: Array de meses. 
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class DivideMesesPalavras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String aux;
		String teste = "";
		int posicao = 0;
		int cont = 0;
		
		// Conta quantos ponto e virgula(;) tem na string
		System.out.print("Informe os meses: ");
		aux = entrada.next();
		for (int i = 0; i < aux.length(); i++) {
			if (aux.charAt(i) == ';') {
				cont++;
			}
		}

		// Desmembra os meses em strings, cada mês fica em uma posição da string meses.
		String meses[] = new String[cont];
		for (int i = 0; i < aux.length(); i++) {
			if (aux.charAt(i) == ';') { // Quando acha um ; salva o mês sozinho em uma posição da Array e parte para o proximo mês.
				meses[posicao] = teste;
				posicao++;
				teste = "";
			} else {
				teste += aux.charAt(i); // Fica salvando em teste as letras ate completar o nome do mês.
			}
		}

		// Imprimindo na tela a array de meses.
		System.out.println("Informou: " + cont + " delimitadores ';' ");
		for (int i = 0; i < meses.length; i++) {
			System.out.print("\n"+meses[i]);
		}
		entrada.close();
	}
}