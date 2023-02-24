/* 
  Objetivo: Crie um programa em java que através de metodos some 2 numeros inteiros, usando sobrecarga crie outro método que 
  some dois números tipo double, crie um terceiro método que receba vários números e some eles.
  Entrada: Sem entrada.
  Saida: Soma inteiros, soma double, soma vários números.
  Autor: Rafael Florentino.
*/
public class Metodos {
    public static void main(String[] args) {
        int soma;
        int[] varios ={2,3,4,5};

        mensagem("Rafael é Programador",4);

        soma = soma(2,4);
        System.out.printf("\n\nVariavel Soma = %d", soma);
        System.out.printf("\nMetodo Soma = %d", soma(5,4));
        System.out.printf("\nMetodo Soma Varios = %d", somaVarios(10,15,20,1));
        System.out.printf("\nMetodo Soma Varios Array = %d", somaVarios(varios));
    }

    public static int soma(int num1, int num2){
        int soma= num1+ num2;
        return soma;
    }
    // Sobrecarga de classe, Método com mesmo nome: Soma, mas com Tipos de entrada diferentes Double
    public static double soma(double num1, double num2){
        double soma= num1+ num2;
        return soma;
    }

    // Passar lista de valores, array
    public static int somaVarios(int... numeros){
        int resultado = 0;
        for(int n:numeros){
            resultado+=n;
        }
        return resultado;
    }

    public static void mensagem(String mensagem, int repeticoes){
        for(int i = 0; i<repeticoes;i++){
            System.out.printf("\n%d | Texto Dentro do Metodo, Veio de fora do metodo: %s  %d",i+1,mensagem,repeticoes);
        }
    }

     /* Assinatura do método: */ 
    // calcularResposta(int, double, double) // CamelCase
}
