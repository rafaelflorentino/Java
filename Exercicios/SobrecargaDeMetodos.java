/* 
  Objetivo: Crie um programa em java que faça a sobrecarga do metodo desenhar de acordo com o tipo passado: int, double, string.
  Entrada: Sem Entrada.
  Saida: Mensagens dos métodos, sobrecarregados.
  Autor: Rafael Florentino.
*/
public class SobrecargaDeMetodos {
    
        public static void desenhar(String s) {
            System.out.println("Desenhando uma String: "+ s );
        }
        public static void desenhar(int i) {
            System.out.println("Desenhando um Inteiro: "+ i );
        }
        public static void desenhar(double d) {
            System.out.println("Desenhando um Double: "+ d );
        }
        public static void desenhar(int i, double d) {
            System.out.println("Desenhando um Inteiro: "+ i + " É Desenhando um Double: "+ d);
        }

        public static void main(String[] args) {
            desenhar("Texto");
            desenhar(999);
            desenhar(1.5);
            desenhar(3,2.5);
        }
}
