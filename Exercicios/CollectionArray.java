/* 
  Objetivo: Crie um programa que use Predicado not.
  Entrada: Sem entrada.
  Saida:  impressão dos dados na tela.
  Autor: Rafael Florentino.
*/

import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
import java.util.Arrays;

public class CollectionArray {
 public static void main(String[] args) {
   /*  List sampleList = Arrays.asList("Java", "Kotlin");
    String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
    assertThat(sampleArray).containsExactly("Java", "Kotlin");    */

    // Predicado not
    List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
      /* List withoutBlanks = sampleList.stream()
    .filter(Predicate.not(String::isBlank))// not inverte a resposta, filtra as strings que não tenham brancos
    .collect(Collectors.toList());
   // assertThat(withoutBlanks).containsExactly("Java", "Kotlin");     */

    System.out.println(sampleList); 
    //System.out.println(withoutBlanks); 
 }   
}
