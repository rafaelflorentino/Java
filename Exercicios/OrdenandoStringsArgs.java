/* 
  Objetivo: Crie um programa em java que receba por args duas strings, ordene a maior e a menor e imprima na tela as duas string. 
  Observação: Precisa mandar os argumentos pelo terminal java OrdenandoStringsArgs "rafael" "rr".
  Entrada: Sem entrada.
  Saida: Maior e Menor String.
  Autor: Rafael Florentino.
*/
public class OrdenandoStringsArgs {

	public static void main(String[] args) {
		String maior = args[0];
		String menor = args[1];

		if (args.length > 0) {
			maior = args[0]; // Recebe a primeira string
			menor = args[1]; // Recebe a segunda string
		} else {
			System.out.print("Informe pelo menos uma String.");
		}
		// Ordenar Maior e Menor string
		for (int i = 0; i < args.length; i++) {
			if (args[i].length() < menor.length()) {
				menor = args[i];
			}
			else if (args[i].length() > maior.length()) {
				maior = args[i];
			}
		}
		System.out.println("A Maior String: " + maior);
		System.out.println("A Menor String: " + menor);
	}
}
