/* 
  Objetivo: Crie um programa em java mostre na tela os valores numéricos de cada caracter.
  Entrada: Sem entrada.
  Saida: Valor de cada caracter.
  Autor: Rafael Florentino.
*/
public class ValorChar {
	public static void main(String[] args){
		for( int i=32;i < 150 ;i++)
		{
			System.out.println("Valor de i = "+i+"="+(char)i);
		}		
	}
}
