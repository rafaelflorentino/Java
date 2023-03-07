/* 
  Objetivo: Crie um programa em java que crie um TreeSet e imprima os dados na tela, tambem ordene dados de uma lista.
  Entrada: Sem entrada.
  Saida:  Impressão dos dados na tela.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSets{
    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<String>();
        ts.add("Inglaterra");
        ts.add("Austrália");
        ts.add("Brasil");
        ts.add("Japão");
        ts.add("Inglaterra");
        System.out.println(ts); // [Austrália, Brasil, Inglaterra, Japão]
        ts.remove("Austrália");
        System.out.println(ts); // [Brasil, Inglaterra, Japão]
        java.util.Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        List<String> letras = new ArrayList<String>();
        letras.add("W");
        letras.add("X");
        letras.add("G");
        letras.add("B");
        letras.add("A");

        Collections.sort(letras); // ordena a string

        for (String a : letras) {
            System.out.println(a);
        }        
                
    }    
}
