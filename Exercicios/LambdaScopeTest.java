/* 
  Objetivo: Crie um programa que use expressoes laambda
  Entrada: Sem entrada.
  Saida:  impressão dos dados na tela.
  Autor: Rafael Florentino.
*/
import java.util.function.Consumer;

public class LambdaScopeTest {
    public int x = 0;

    class PrimeiroNivel {
        public int x = 1;

        void metodoNoPrimeiroNivel(int x) {
            int z = 2;
            Consumer<Integer> meuConsumidor = (y) -> {
                // A instrução a seguir faz com que o compilador gere
                // o erro "Variável local z definida em um escopo delimitador
                // deve ser final ou efetivamente final "
                //
                // z = 99;
                System.out.println("x =" + x);
                System.out.println("y =" + y);
                System.out.println("z =" + z);
                System.out.println("this.x =" + this.x);
                System.out.println("LambdaScopeTest.this.x =" + LambdaScopeTest.this.x);
            };
            meuConsumidor.accept(x);
        }
    }

    public static void main(String... args) {
        LambdaScopeTest st = new LambdaScopeTest();
        LambdaScopeTest.PrimeiroNivel fl = st.new PrimeiroNivel();
        fl.metodoNoPrimeiroNivel(23);
    }
}