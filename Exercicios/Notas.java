/* 
  Objetivo: Escreva um programa que armazene as 5 notas dos alunos de uma turma (as notas podem ser preenchidas manualmente 
  ou automaticamente), mostre a maior, a menor, a soma e a média das notas dessa turma.
  Entrada: Notas dos alunos.
  Saida: A maior nota, menor nota soma das notas, mdia das notas.
  Autor: Rafael Florentino.
*/

import java.util.Scanner;
import java.util.Random;
public class Notas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float[] notas = new float[5];
		float menor = 0, maior = 0, soma = 0, media = 0;
		int i;
		
		try {
			for (i = 0; i < 5; i++) {
				System.out.print("Digite a nota do " + (i + 1) + ". Aluno: ");
				notas[i] = entrada.nextFloat();
				soma = soma + notas[i];
			}
			media = soma / 5;
			
			menor = notas[0];
			maior = notas[0];
			System.out.print("\nA quantidade de notas: "+notas.length);
			for (i = 0; i < 5; i++) {
				if (notas[i] < menor) {
					menor = notas[i];
				}
				if (notas[i] > maior) {
					maior = notas[i];
				}
			}
			System.out.println("\nA maior nota e: " + maior);
			System.out.println("A menor nota e: " + menor);
			System.out.println("A soma ds notas e: " + soma);
			System.out.println("A media das notas e: " + media);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		entrada.close();


		// Gerando notas com numeros Aleatórios

		Random gerador = new Random();
		float[] notas2 = new float[5];
		float menor2 = 0, maior2 = 0, soma2 = 0, media2 = 0;

		menor2 = 999;
		maior2 = -1;
		System.out.println("\nGerando números Aleatórios ");
		for (i = 0; i < 5; i++) {
			notas2[i] = (gerador.nextInt(11));
			soma2 = soma2 + notas2[i];

			if (notas2[i] < menor2) {
				menor2 = notas2[i];
			}
			if (notas2[i] > maior2) {
				maior2 = notas2[i];
			}			
		}
		for (i = 0; i < 5; i++) {
			System.out.println("Nota nr." + (i + 1) + ": " + notas2[i]);
		}
		media2 = soma2 / 5;
		System.out.print("\nA quantidade de notas: "+notas2.length);
		System.out.println("\nA maior nota e: " + maior2);
		System.out.println("A menor nota e: " + menor2);
		System.out.println("A soma ds notas e: " + soma2);
		System.out.println("A media das notas e: " + media2);			
	}
}

