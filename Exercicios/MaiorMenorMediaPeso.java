/* 
  Objetivo: Faça um programa que análise o conjunto de dados contendo peso e sexo (masculino, feminino) de 10 pessoas
  (quantidade definida em constante no programa). Este programa deverá mostrar o valor do maior e menor peso 
  informado, a média dos pesos dos homens e o número de mulheres que participaram desta análise.
  Entrada: Sem entrada.
  Saida: Maior preso, menor peso, media do peso dos homens, quantidade de mulheres.
  Autor: Rafael Florentino.
*/
import java.text.DecimalFormat;
public class MaiorMenorMediaPeso {

	public static void main(String[] args) {
		
		int i,contH=0,contM=0;
		float aux=0,media,aux2=0,aux3=0;
		float[] peso=new float[10];
		char[] sexo=new char[10];
		sexo[0]='m';   peso[0]=70;
		sexo[1]='m';   peso[1]=65;
		sexo[2]='f';   peso[2]=50;
		sexo[3]='f';   peso[3]=53;
		sexo[4]='m';   peso[4]=80;
		sexo[5]='f';   peso[5]=64;
		sexo[6]='m';   peso[6]=75;
		sexo[7]='f';   peso[7]=70;
		sexo[8]='m';   peso[8]=100;
		sexo[9]='m';   peso[9]=52;
 
	    // Maior e menor peso		
		for(i=0;i<9;i++){	
			aux2=peso[i];
			if(peso[i] < peso[i+1]){
				aux2=peso[i+1];	
			}
			if(peso[i] > peso[i+1]){
				aux3=peso[i+1];	
			}
		}	
		
    // Contagem das mulheres e soma do peso dos homens	
	for(i=0;i<10;i++){	
		if(sexo[i]=='m'){
			contH=contH+1;
			aux=aux+peso[i];			
		}
		if(sexo[i]=='f'){
			contM=contM+1;
		}
	}		
       media=aux/contH;	//media do peso dos homens
       
       DecimalFormat df = new DecimalFormat("0.00");
	   System.out.println("O maior peso é: "+df.format(aux2));
	   System.out.println("O menor peso é: "+df.format(aux3));
	   System.out.println("A media dos pesos dos homens é: "+df.format(media)); 
	   System.out.println("A Quantidade de mulheres é: "+contM); 
	}

}
