/* 
  Objetivo: Crie um programa em java que use varios metodos da Classe Array e System, e imprima na tela 
  Entrada: Sem entrada.
  Saida: Resultado dos metodos utilizados, preencher, ordenar, duplicar, verificar se contem, buscar posição.
  Autor: Rafael Florentino.
*/
import java.util.Arrays;
public class MetodosArray {
    public static void main(String[] args) {
        int[] num = {9,4,0,7,4,2,6,3,1,8};
        int[] num2 = new int[10];
        int[] num3 = new int[10];

        Arrays.sort(num); // Ordena em ordem crescente
        Arrays.fill(num2,10); // Prenche todo o array com o numero indicado: 10
        System.arraycopy(num, 0, num3, 0, num.length); // Copia uma array em outra
        Boolean resposta = Arrays.equals(num, num3); // Compara se são iguais
        int valor = 100; // verifica se o elemento esta na array >-1
        Arrays.sort(num);
        int pos = Arrays.binarySearch(num, valor); // verifica a posicao precisa esta ordenada a array

        System.out.printf("\nOrdenar Crescente (sort): ");
        for(int n: num){
            System.out.printf("%d - ",n);
        }
        System.out.printf("\nPreencher com valor passado (fill): ");
        for(int n2: num2){
            System.out.printf("%d - ",n2);
        }
        System.out.printf("\nCopiar Array (System.arraycopy): ");
        for(int n3: num3){
            System.out.printf("%d - ",n3);
        }
        System.out.printf("\nVerificar se num e Igual a num3 (equals): %s", resposta ? "Iguais True":"Diferentes False");
        System.out.printf("\nVerificar se num2 e Igual a num3: %s", Arrays.equals(num2, num3) ? "Iguais True":"Diferentes False");
        System.out.printf("\nVerificar se %d esta na array a num: %s - Posicao: %d", valor,pos > -1? "Esta na array":"Nao esta na array",pos);
        System.out.printf("\nVerificar se 6 esta na array a num: %s - Posicao : %d", Arrays.binarySearch(num, 6) > -1? "Esta na array":"Nao esta na array", Arrays.binarySearch(num, 6));
        
    }
}
