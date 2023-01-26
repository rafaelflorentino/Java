/* 
  Objetivo: Crie um programa em java que 
  Entrada: Sem entrada.
  Saida: Número e Mensagem de Impar ou Par.
  Autor: Rafael Florentino.
*/
public class ValorPorReferencia {
    public static void main(String[] args) {
        int[] notas = {10,84,62,45,98,78,88,60,67,82};
        int[] resultado={0,0};
        /*int ap,rp; // variáveis comuns não podem mudar o valor por referência em Java, não aceita ponteiros igual no C
        ap=rp=0;// inicializando com 0 as duas variáveis
        conferirNotas(notas,ap,rp);// essa Função nao consegue mudar o valor de ap e rp, por referência em Java
        System.out.printf("Aprovados: %d%n",ap);
        System.out.printf("Reprovados: %d%n",rp); */

        conferirNotas(notas,resultado);
        System.out.printf("Aprovados: %d%n",resultado[0]);
        System.out.printf("Reprovados: %d%n",resultado[1]);    
    }
    public static void conferirNotas(int[] nt, int[] r){ // os valores: a e r nao serao alterados, pois nao pode passar o valor por referencia, só em arrays
        for(int n:nt){
            if(n>=60){
                r[0]++;
            }else{
                r[1]++;
            }
        }
    } 
    /*public static void conferirNotas(int[] nt, int a, int r){ // os valores: a e r nao serao alterados, pois nao pode passar o valor por referencia, só em arrays
        for(int n:nt){
            if(n>=60){
                a++;
            }else{
                r++;
            }
        }
        //System.out.printf("Aprovados: %d%n",a); // Valor da copia
        //System.out.printf("Reprovados: %d%n",r); // Valor da copia 
    }*/ 
}
