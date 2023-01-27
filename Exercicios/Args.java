/* 
  Objetivo: Crie um programa em java que receba numeros como parametro de fora do programa pela String args e realize
  a soma desses numeros e imprima na tela.
  Entrada: Números.
  Saida: Soma dos números.
  Autor: Rafael Florentino.
*/
public class Args {
    public static void main(String[] args) {

        int soma = 0;
        if(args.length <=0){
            System.out.printf("\nSem valores para somar");
            return;
        }
        for(String n:args){ // parametros passados de fora do programa estão vindo como string
            int v=Integer.valueOf(n); // tranforma valores da string em inteiros
            soma+=v;
        }
        System.out.printf("\nSoma dos valores: %d",soma);  
    }
}
