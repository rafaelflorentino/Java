/* 
  Objetivo: Crie um programa em java que salve dados em uma array depois leia e imprima os dados da arrya.
  Entrada: Notas.
  Saida: Mensagem de Texto, lista de notas.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int tam = 5;
        int[] num = new int[5];
        int[] resposta = new int[tam];
        int[] numeros = { 10, 20, 30, 40, 50 };
        int[] num2 = {99,67,87,16,3};
        int[] num3 = new int[tam];
        //int p=3;
        //int pos;

        //java.util.Arrays.sort(num3);// ordenar
        //java.util.Arrays.fill(num3, 10);// preenche tudo com 10
        //System.arraycopy(numeros, 0, num2, 0, 5);// copiar array(origem, posição origem, destino, posição destino, quantidade)
        //System.out.printf("Array sao iguais: %s",java.util.Arrays.equals(num2, numeros) ? "Sim" : "Nao");//verifica se são iguais

        /*java.util.Arrays.sort(num2);
        pos = java.util.Arrays.binarySearch(num2,p);// verifica se elemento esta na array retorna: 0 e 1(nao e sim)
        System.out.printf("\nO elemento %d esta no array? %s",p,pos > 0 ? "Sim" : "Nao");
        System.out.printf("\n");*/

        num[0] = 10;
        num[1] = 5;
        num[2] = 15;
        num[3] = 0;
        num[4] = 8;

        for (int i = 0; i < num.length; i++) {
            System.out.printf("\n%d", num[i]);
        }
        System.out.printf("\n");

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("\n%d", numeros[i]);
        }
        System.out.printf("\n");

        // FOR Simplificado
        for (int n : num2) {
            System.out.printf("\n%d", n);
        }
        System.out.printf("\n");

        for (int i = 0; i < num3.length; i++) {
            System.out.printf("\n%d", num3[i]);
        }
        System.out.printf("\n");

        for (int i = 0; i < num.length; i++) {
            System.out.printf("\nDigite a nota: ");
            resposta[i] = scan.nextInt();
        }
        System.out.printf("\n");

        for (int i = 0; i < resposta.length; i++) {
            System.out.printf("\nNota: %d ", resposta[i]);
        }

        System.out.printf("\n\nFim do programa.\n\n");
        scan.close();
    }
}
