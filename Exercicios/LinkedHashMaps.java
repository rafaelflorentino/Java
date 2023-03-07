/* 
  Objetivo: Crie um programa em java que crie um LinkedHashMap e imprima os dados na tela.
  Entrada: Sem entrada.
  Saida:  Impressão dos dados na tela.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
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
        
        Map<String, Integer> m = new LinkedHashMap<>(); // ordem de inserção da primeira ocorrência
        for (String a : array) {
        Integer freq = m.get(a);
        m.put(a, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(m.size() + " letras distintas:");
        System.out.println(m);
    }
}
