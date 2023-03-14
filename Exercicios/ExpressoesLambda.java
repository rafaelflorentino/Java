/* 
  Objetivo: Crie um programa em java que crie expressão do tipo lambda, um cosumer
  Entrada: Sem entrada.
  Saida:  Números.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.function.Consumer;
// Funções lambdas podem ser serializadas (caso destino e argumentos forem serializados)
public class ExpressoesLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(9);
        numeros.add(8);
        numeros.add(1);

        // Função foreach
        numeros.forEach((n) -> { // O foreach, Recebe como parametro uma função lambda
            System.out.println(n);
        });
        System.out.println('\n');

        // Consumer
        Consumer<Integer> method = (n) -> { // Método que consome inteiros
            System.out.println(n); // imprimi na tela
        };
        numeros.forEach(method);// Para cada número dentro do forEach chama o método method 
                
    }
}
