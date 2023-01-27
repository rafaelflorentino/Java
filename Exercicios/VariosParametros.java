/* 
  Objetivo: Crie um programa em java que use 3 funções diferente para somar números, somar 2 numeros, somar arrays de 
  números, receber vaios numeros e somar(quantidade de numeros indefinida).
  Entrada: Sem entrada.
  Saida: Números somados.
  Autor: Rafael Florentino.
*/
public class VariosParametros {
    public static void main(String[] args) {
        int n1=2, n2=6;
        int[] valores ={10,50,2,3};

        System.out.printf("\nSimples - Soma de %d + %d = %d ",n1,n2,soma(n1,n2));
        System.out.printf("\nArray - Resultado da Soma da Array = %d ", somaArray(valores));
        System.out.printf("\nIndefinida - Resultado da Soma = %d ",somaIndefinida(1,2,3,4,5,n1));
        
    }
    public static int soma(int n1, int n2){
        return n1+n2;
    }

    public static int somaArray(int[] n){
        int res=0;
        for(int v:n){
            res+=v;
        }
        return res;
    }

    public static int somaIndefinida(int... n){
        int res=0;
        for(int v:n){
            res+=v;
        }
        return res;
    }
}


