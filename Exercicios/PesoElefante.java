
/* 
  Objetivo: Faça um programa que leia três valores numéricos referentes ao peso de elefantes (nunca menores que 5 quilos) 
  e os mostre em ordem crescente.
  Entrada: Três valores.
  Saida: Pesos em ordem crescente.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class PesoElefante {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[] elefante = new int[3];
		int i, aux = 0, j;

	    // Usei o Try apenas para tratar o erro do Scanner.close() para poder fechar lá em baixo sem dar erro.
		try {
			for (i = 0; i < 3; i++) {
				System.out.println("Entre com um peso maior que 5 quilos para elefante n: " + (i + 1));
				elefante[i] = entrada.nextInt();
				while (elefante[i] <= 5) {
					System.out.println("Valor invalido ");
					System.out.println("Entre com o peso do elefante n: " + (i + 1));
					elefante[i] = entrada.nextInt();
				}
			}
			// Ordenação crescente do vetor
			for (j = 0; j < 2; j++) {
				for (i = 0; i < 2; i++) {
					if (elefante[i] > elefante[i + 1]) {
						aux = elefante[i + 1];
						elefante[i + 1] = elefante[i];
						elefante[i] = aux;
					}
				}
			}
			System.out.println("##### Pesos ordenados #####");
			for (i = 0; i < 3; i++) {
				System.out.println("Peso: " + elefante[i]);
			}

		} catch (Exception e) {
			System.out.println("Erro:"+ e);
		}
		entrada.close(); // Usei o try catch para tratar esse erro.
	}
}
