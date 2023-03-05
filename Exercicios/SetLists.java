/* 
  Objetivo: Crie uma LinkedList, HashSet, TreeSet e uma nova array List
  Entrada: Sem entrada.
  Saida: Nomes e números.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetLists { // Não aceita valores duplicados
    public static void main(String[] args) {

    /* Interface LIST */ // ArrayList, vetor, linkedList(também herda de fila queue)

        // ArrayList = melhor desempenho em acesso aleatório // não precisa percorrer toda lista para acessar o valor desejad
        List<String> a1 = new ArrayList<>(); // list mantém a ordem de inserção, sequência
        a1.add("Zeca"); 
        a1.add("Maria");
        a1.add("Ana");
        System.out.println("Elemento na posição 2: " + a1.get(2));

        // LinkedList = melhor desempenho na inserção de novos elementos // percorre toda a lista 
        List<String> l1 = new LinkedList<>();
        l1.add("Zeca");
        l1.add("Maria");
        l1.add("Ana");
        l1 = l1.subList(1, 2);
        System.out.println("Elementos da LinkedList");
        System.out.print("\t" + l1);
    
     /* Interface SET */  // HasdShet, linkedHasgSet, sortedeSet, navigableSet

        // HashSet, não garante a ordem de entrada pode mudar,remove duplicatas
        int count[] = { 34, 22, 10, 60, 30, 22 };
        Set<Integer> set = new HashSet<Integer>(); // Não aceita o segundo 22 porque esta duplicado
        for (int i = 0; i < 5; i++) {
        set.add(count[i]);
        }
        System.out.println(set);
        
        // TreeSet
        TreeSet<Integer> sortedSet = new TreeSet<>(set); // TreeSet sempre ordena os itens em ordem crescente
        System.out.println("O set ordenado é:");
        System.out.println(sortedSet);
        System.out.println("O primeiro elemento do set é: " + (Integer) sortedSet.first()); // Primeiro elemento
        System.out.println("O último elemento do set é: " + (Integer) sortedSet.last()); // Ultimo elemento
   
        }    
}
