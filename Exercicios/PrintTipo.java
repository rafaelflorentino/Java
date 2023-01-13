/* 
  Objetivo: Crie um programa em java que imprima Textos e os Tipos de variáveis.
  Entrada: Sem entrada.
  Saida: Textos e os Tipos de variáveis.
  Autor: Rafael Florentino.
*/
public class PrintTipo {
    public static void main(String[] args) {
        byte zero = 0;
        int num = 7;
        double numero = 2.5;
        long longo = 12345;
        short curto = 2;
        String nome = "Rafael";
        boolean verdade = true;
        float numero2 = 2;
        char sexo = 'M';

        // Tipos de Print em Java
        System.out.println("\nTipos de Print em Java: \n");
        System.out.print("Primeira Linha: print\n");
        System.out.println("Segunda Linha: println");
        System.out.printf("Terceira: %d %s; printf: %%d %%s \\n \n", 3, "Linha");
        System.out.printf("Quarta linha: %d. %nQuinta Linha: %d. %n", 4, 5);

        /* Tipos de Variáveis em Java */
        System.out.println("\nTipos de Variaveis em Java: \n");
        System.out.println("int: " + num);
        System.out.printf("Double: %2.2f \n", numero);
        System.out.println("Float: " + numero2);
        System.out.println("Long: " + longo);
        System.out.println("Short: " + curto);
        System.out.println("Byte: " + zero);
        System.out.println("Char: " + sexo);
        System.out.printf("String: %s \n", nome);
        System.out.println("Boolean: " + verdade);
    }

}
