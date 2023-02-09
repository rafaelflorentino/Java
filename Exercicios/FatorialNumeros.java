/* 
  Objetivo: Solicite ao usuário a quantidade de números inteiros que ele gostaria de informar para o cálculo do fatorial
  e após validar este número solicite cada um deles e mostre o seu valor fatorial.
  Entrada: Quantidade e inteiros, números inteiros.
  Saida: Fatorial dos números.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;
public class FatorialNumeros {

	public static void main(String[] args) {
		int quantidade,fat=1,i=0,j;		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de numeros inteiros: ");  
	    quantidade = entrada.nextInt(); 
		System.out.println("\n");
	    
	    int[] numero=new int[quantidade];	    
	    
	    for( i=0;i<quantidade;i++){
	    System.out.println("Informe um numero inteiro: ");  
	    numero[i] = entrada.nextInt(); 
	    while(numero[i]<0){
	    	System.out.println("Numero invalido ");    
	  	    System.out.println("Informe um numero inteiro: ");  
	  	    numero[i]= entrada.nextInt(); 
	      }
	    	// Calculo do fatorial
		        for( j = 2; j <= numero[i]; j++ ) {    
			         fat *= j;  
			    }  
			      
			    System.out.println("\nO fatorial de " + numero[i] + " é igual a " + fat );  
			    fat=1;
	        }  
	         
	    }
}
