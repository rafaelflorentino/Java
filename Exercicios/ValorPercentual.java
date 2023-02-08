/* 
  Objetivo: Faça um programa que solicite ao usuário um valor percentual a ser calculado sobre o piso salarial da categoria.
  Este piso deverá estar especificado em uma constante com valor de R$1000,00 (mil reais) e será usado para o cálculo
  do percentual informado. O programa deverá calcular este percentual e apresentá-lo de maneira formatada com no mínimo
  uma casa inteira e duas fracionárias..
  Entrada: Valor percentual(1,5).
  Saida: Valor percentual sobre o piso.
  Autor: Rafael Florentino.
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class ValorPercentual {
	public static void main(String[] args) {
		
		final float piso = 1000.00f;
		float calculo, percentual;
		Scanner entrada = new Scanner(System.in);
		
	    System.out.print("\nEntre com um valor percentual: ");  
		percentual = entrada.nextFloat(); 
		
		calculo=(percentual/100)*piso;	
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O percentual de: "+percentual+"% sobre o piso de: R$"+piso+" é igual a: R$" +df.format(calculo));  
			
		entrada.close(); 		   	
	}
}
