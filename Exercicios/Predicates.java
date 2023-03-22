/* 
  Objetivo: Crie um programa em java que use Predicates e verifique cidades que começão com S e imprima na tela
  Entrada: Notas.
  Saida: Cidades que começem com a letra S.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicates {
   public static void main(String[] args) {
    ArrayList<String> cidades = new ArrayList<>();
    cidades.add("Goiânia");
    cidades.add("Brasília");
    cidades.add("São Paulo");
    cidades.add("Curitiba");
    cidades.add("Santos");      

    Predicate<String> nomeIniciaComS = str -> str.startsWith("S");
    cidades.stream().filter(nomeIniciaComS).forEach(System.out::println);    

    Predicate<String> startPredicate = str -> str.startsWith("S");
    Predicate<String> lengthPredicate = str -> str.length() >= 7;
    cidades.stream().filter(startPredicate.and(lengthPredicate)).forEach(System.out::println);    
   } 
}
