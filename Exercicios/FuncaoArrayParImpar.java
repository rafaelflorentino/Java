/* 
  Objetivo: Crie um programa em java que tenha uma função que receba uma array e calcule cada número 
  se ele é impar ou par, e imprima na tela.
  Entrada: Sem entrada.
  Saida: Número e Mensagem de Impar ou Par.
  Autor: Rafael Florentino.
*/
public class FuncaoArrayParImpar {
    public static void main(String[] args) {
        
        int[] numeros={10,5,15,20,100,25,20,14,8,3,98,75,62};
        parImpar(numeros);
    }

    public static void parImpar(int[] num){
        String res;
        for(int n:num){
            if(n % 2 == 0){
                //System.out.printf("%d: %s%n",n,"Par");
                res="Par";
            }else{
                //System.out.printf("%d: %s%n",n,"Impar");
                res="Impar";
            }
            System.out.printf("%d: %s%n",n,res);
        }
    }
    
}
