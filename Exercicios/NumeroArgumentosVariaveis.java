/* 
  Objetivo: Crie um programa em java que tenha um metodo que receba um números indefinidos de argumentos e some.
  Entrada: Números.
  Saida: Soma dos números.
  Autor: Rafael Florentino.
*/
public class NumeroArgumentosVariaveis {
    public static void main(String[] args) {
        double[] numeros = { 8, 9, 7, 5, 5 };
        System.out.println(soma(5, 4, 3));
        System.out.println(soma(numeros));
        System.out.println(soma(3.4F,5.2F));
    }

    public static int soma(int... valores) {
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma;
    }

    public static float soma(float... valores) {
        float soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma;
    }

    public static double soma(double... valores) {
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma;
    }


}
