/* 
  Objetivo: Crie um programa em java que crie uma array e utilize
  Entrada: Sem entrada.
  Saida: Valores das Variáveis Primitivas.
  Autor: Rafael Florentino.
*/
public class ArraysOuMatrizes {
    public static void main(String[] args) {
        /*
         * É um objeto conteiner homogêneo(aceita valores de um único tipo):
         * Tamanho: quando criada é estabelecido, e o
         * seu comprimento quando estabelecido é fixo
         */

        int[] anArray; // Declara um array de inteiros
        anArray = new int[5]; // Aloca a memória para 5 inteiros

        anArray[0] = 100; // Inicializa o primeiro elemento
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;

        System.out.println("Elemento no index 0: " + anArray[0]);
        System.out.println("Elemento no index 1: " + anArray[1]);
        System.out.println("Elemento no index 2: " + anArray[2]);
        System.out.println("Elemento no index 3: " + anArray[3]);
        System.out.println("Elemento no index 4: " + anArray[4]);

        // Ver o tamanho da string
        System.out.println("Tamanho da array: " + anArray.length); // (anArray.length) é uma propriedade não metodo

        /* Outra forma de declar uma array */
        int[] Array = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };
        System.out.println("\nElemento no index 0: " + Array[0]);
        System.out.println("Elemento no index 1: " + Array[1]);
        System.out.println("Elemento no index 2: " + Array[2]);
        System.out.println("Elemento no index 3: " + Array[3]);
        System.out.println("Elemento no index 4: " + Array[4]);
        System.out.println("Elemento no index 5: " + Array[5]);
        System.out.println("Elemento no index 6: " + Array[6]);
        System.out.println("Elemento no index 7: " + Array[7]);
        System.out.println("Elemento no index 8: " + Array[8]);
        System.out.println("Elemento no index 9: " + Array[9]);
        System.out.println(" ");

        /* Array Multidemensional ou Matriz(Array de Arrays) */
        // Array de 2 dimensões, (linhas e colunas)
        String[][] names = {
                { "Mr. ", "Mrs. ", "Ms. " },
                { "Smith", "Jones" }
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
        System.out.println(" ");

        /* Copiar uma Array para outra  com arraycopy*/
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7); // começa a copiar daposição [2]=c de copyFrom
        // e cola a array em copyTo, apartir da poiscao [0], só 7 itens serão copiados: c, a, f, f, e, i , n
        System.out.println(new String(copyTo));
        System.out.println(" ");
              
        
         /* Copiar uma Array com copyOfRange*/
         char[] copyFrom2 = {'d', 'e', 'c', 'a', 'f', 'f', 'e','i', 'n', 'a', 't', 'e', 'd'}; // apartir posicão [2] = c
         char[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom2, 2, 9); // recebe 9 caracteres 
         System.out.println(new String(copyTo2));         

         // binararySearch ( Busca um valor especifico na array, array precisa esta ordenada antes)

         // equals ( Compara 2 arrays se e maior > menor < ou igial ==)

         // fill ( Preenche uma array com valor especifico para cada indice) 

         // parallelSort ( Classificar em ordem crescente )



    }
}
