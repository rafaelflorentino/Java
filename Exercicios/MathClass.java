/* 
  Objetivo: Crie um programa em java que utilize métodos da classe math.
  Entrada: Sem entrada.
  Saida: Resultados das operações.
  Autor: Rafael Florentino.
*/
public class MathClass {
    public static void main(String[] args) {
        double x = 11.635;
        double y = 2.76;
        System.out.printf("O valor de 'e' é %.4f%n", Math.E);
        System.out.printf("exp(%.3f) é %.3f%n", x, Math.exp(x));
        System.out.printf("log(%.3f) é %.3f%n", x, Math.log(x));
        System.out.printf("pow(%.3f, %.3f) é %.3f%n", x, y, Math.pow(x, y));
        System.out.printf("sqrt(%.3f) é %.3f%n", x, Math.sqrt(x));

        // Gerar números Aleatórios
        int numero = (int)(Math.random() * 10);
        System.out.println("Número aleatório: " + numero);
        System.out.println(" ");

        // String são objetos
        char[] olaArray = { 'o', 'l', 'á', '.'};
        String olaString = new String(olaArray);
        System.out.println(olaString);
        // o processo de autoboxing converte automaticamente tipos primitivos para suas classes correspondentes.

    }

}
