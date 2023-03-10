/* 
  Objetivo: Crie um programa em java que receba três notas atraves de um for, e calcule a média, imprima na tela o resultado.
  Entrada: Três Notas.
  Saida: Média das notas.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class CalculaMedia2 {
	public static void main(String[] args) {
		int i;
		float media=0, soma=0;
		float[] nota = new float[3];
		Scanner ler = new Scanner(System.in);

		// Usei o Try apenas para tratar o erro do Scanner.close() para poder fechar lá em baixo sem dar erro.
		try {
			for (i = 0; i < 3; i++) {
				System.out.print("Digite a nota:\n");
				nota[i] = ler.nextFloat();
				soma = soma + nota[i];	
			}
		} catch (Exception e) {
			System.out.print("Erro:"+e);
		}
		
		ler.close();
		media = soma/3;
		System.out.print("\nMédia: " + media);
	}
}
