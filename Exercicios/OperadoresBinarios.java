/* 
  Objetivo: Crie um programa em java que realize operações binárias.
  Entrada: Sem entrada.
  Saida: Resultado das operações.
  Autor: Rafael Florentino.
*/
public class OperadoresBinarios {
    public static void main(String[] args) {
        int x=20;
        System.out.println("x: " + Integer.toBinaryString(x));
        System.out.println("~x: " + Integer.toBinaryString(~x)); // Inverte zeros e uns
        System.out.println("x << 2: " + Integer.toBinaryString(x<<2)); // Desloca 2 a direita
        System.out.println("x >> 2: " + Integer.toBinaryString(x>>2));// Desloca 2 a esqueeda
        System.out.println("-x: " + Integer.toBinaryString(-x));// Negação binária
        System.out.println("-x >>> 2: " + Integer.toBinaryString(-x>>>2)); // Desloca e não preserva o sinal
        System.out.println("-x >> 2: " + Integer.toBinaryString(-x>>2)); // Desloca e preserva o sinal
        System.out.println("x & 0b111000: " + Integer.toBinaryString(x&0b111000));// e binário
        System.out.println("x ^ 0b11111: " + Integer.toBinaryString(x^0b11111));// ou exclusivo
        System.out.println("x | 0b00001: " + Integer.toBinaryString(x|0b00001)); // ou binário
                
    }
}
