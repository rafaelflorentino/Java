/* 
  Objetivo: Crie um programa em java que crie um TreeMap.
  Entrada: Sem entrada.
  Saida:  Impressão dos elementos do TreeMap.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("b");
        array.add("u");
        array.add("c");
        array.add("a");
        array.add("e");
        array.add("x");
        array.add("a");
        array.add("u");        
        
        Map<String, Integer> m = new TreeMap<>(); // TreeMap ordena lista, ordem alfabética
        for (String a : array) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(m.size() + " letras distintas:");
        System.out.println(m);
    }
}
