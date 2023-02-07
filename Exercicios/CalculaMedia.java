/* 
  Objetivo: Crie um programa em java que receba três notas e calcule a média, imprima na tela oresultado.
  Entrada: Três Notas.
  Saida: Média das notas.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		
		float nota1,nota2,nota3,media;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota:\n");
		nota1 = ler.nextFloat();
		System.out.print("Digite a segunda nota:\n");
		nota2 = ler.nextFloat();
		System.out.print("Digite a terceira nota:\n");
		nota3 = ler.nextFloat();
		
		media=(nota1+nota2+nota3)/3;
		System.out.print("A média das notas e: "+media);

		ler.close();
		
	}
}
