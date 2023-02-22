/* 
  Objetivo: Crie um programa em java que crie, inicialize e utilize os 8 tipos primitivos do java.
  Entrada: Sem entrada.
  Saida: Valores das Variáveis Primitivas impressos na tela.
  Autor: Rafael Florentino.
*/
public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
         * Variáveis Primitivas: variáveis de classe, atributos, parâmetros, metodos, variáveis locais
         */

        /* Dados Primitivos Inteiros */

        int num = 4; // int Tamanho: 4 bytes (32 bits) Valores: -2.147.483.648 até 2.147.483.647
        short num2 = 2; // short Tamanho: 2 bytes (16 bits) Valores: -32.768 até 32.767
        byte num3 = 1; // short Tamanho: 1 bytes (8 bits) Valores: -128 até 127
        long num4 = 8; // short Tamanho: 8 bytes (64 bits) Valores: -9.223.372.036.854.775.808 até 9.223.373.036.854.775.807
        System.out.println("Int: " + num + " Short: " + num2 + " Byte: " + num3 + " Long: " + num4);

        /* Dados Primitivos De Ponto Flutuante */

        float num5 = 4; // short Tamanho: 4 bytes (32 bits) Valores: +/- 3.40282347E+38F (aproximandamente 7 dígitos significativos)
        // Números do tipo float aparece com um sufixo F no final: 3.04F (se não tiver o F é considerado um double)
        double num6 = 8; // short Tamanho: 8 bytes (64 bits) Valores: +/- 1.79769313486231570E+308 (15 dígitos significativos)                 
        System.out.println("Float: " + num5 + " Double: " + num6);

        /* Dado Primitivo Caractere */
        char letra = 'a'; // Tamanho: 2 bytes (16 bits) Valores: 0 até 65536
        // Caracteres Usam aspas simples ' ' não duplas " ", aspas duplas são para strings
        System.out.println("Char: " + letra);

        /* Dado Primitivo Booleano */
        boolean verdade = true; // Tamanho: 1 bit Valores: true ou false
        System.out.println("Boolean: " + verdade);

        // Declarando as variaveis, e inicializando vairavel2 e atribuindo o valor 2 
        int variavel1, variavel2 = 2;
        // Inicializando a variável1
        variavel1 = 1;
        // Imprimindo o valor da variável
        System.out.println("\nValor da variavel1 é: " + variavel1);
        System.out.println("\nValor da variavel2 é: " + variavel2);
    }
}
