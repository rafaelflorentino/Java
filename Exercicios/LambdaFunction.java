/* 
  Objetivo: Crie um programa que use expressoes laambda e altere os valores do map
  Entrada: Sem entrada.
  Saida:  Impreção dos dados na tela.
  Autor: Rafael Florentino.
*/
import java.util.HashMap;
import java.util.Map;

public class LambdaFunction {
    public static void main(String[] args) {
        Map<String, Integer> salarios = new HashMap<>();
        salarios.put("José", 40000);
        salarios.put("Francisco", 30000);
        salarios.put("Santos", 50000);

        salarios.replaceAll((name, oldValue) ->
        name.equals("Francisco") ? oldValue : oldValue + 10000);
        System.out.println(salarios);        
    }
}
