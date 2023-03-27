/* 
  Objetivo: Crie um programa que use expressoes laambda
  Entrada: Sem entrada.
  Saida:  impressão dos dados na tela.
  Autor: Rafael Florentino.
*/
public class Lambdas {
    public static void main(String args[]) {
        Lambdas testador = new Lambdas();
        
        // com declaração de tipos
        OperacaoMatematica adicao = (int a, int b) -> a + b;

        // sem declaração de tipos
        OperacaoMatematica subtracao = (a, b) -> a - b;

        // sem instrução de retorno com chaves
        OperacaoMatematica multiplicacao = (int a, int b) -> {
        return a * b;
    };
        // sem instrução de retorno e sem chaves
        OperacaoMatematica divisao = (int a, int b) -> a / b;

        // 10 + 5 = 15
        System.out.println("10 + 5 = " + testador.operar(10, 5, adicao));   
        // 10 - 5 = 5
        System.out.println("10 - 5 = " + testador.operar(10, 5, subtracao));
        // 10 x 5 = 50
        System.out.println("10 x 5 = " + testador.operar(10, 5, multiplicacao));
        // 10 / 5 = 2
        System.out.println("10 / 5 = " + testador.operar(10, 5, divisao));

        // sem parênteses
        ServicoCumprimento servicoCumpr1 =
        message -> System.out.println("Olá " + message);

        // com parênteses
        ServicoCumprimento servicoCumpr2 =
        (message) -> System.out.println("Olá " + message); 

        // Olá Paulo
        servicoCumpr1.dizerMensagem("Paulo");
        // Olá Maria
        servicoCumpr2.dizerMensagem("Maria");
        }
        interface OperacaoMatematica {
            int operacao(int a, int b);
        }
        interface ServicoCumprimento {
            void dizerMensagem(String mensagem);
        }
        private int operar(int a, int b, OperacaoMatematica operacaoMatematica) {
            return operacaoMatematica.operacao(a, b);
        }
    }        

