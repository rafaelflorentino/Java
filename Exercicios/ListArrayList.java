
/* 
  Objetivo: Crie um lista que intancie uma nova array List
  Entrada: Sem entrada.
  Saida: Nomes, números.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ListArrayList {
    public static void main(String[] args) {
        // interface List list não pode ser intanciado ( implementa collection)
        
        List<String> a1 = new ArrayList<>();// implementação de list póossivel com ArrayList
        a1.add("Zeca");// add metodo para adiconar numa lista
        a1.add("Maria");
        a1.add("Ana");
        System.out.println("Elementos do ArrayList");
        System.out.print("\t" + a1);

        // interface lista ligada (implementa collection)
        List<String> l1 = new LinkedList<>();
        l1.add("Zeca");
        l1.add("Maria");
        l1.add("Ana");
        System.out.println();
        System.out.println("Elementos da LinkedList");
        System.out.print("\t" + l1);  
        
        //  interface Set (implementa collection) set não garane ordenação
        Set<String> s1 = new HashSet<>();
        s1.add("Zeca");
        s1.add("Maria");
        s1.add("Ana");
        System.out.println();
        System.out.println("Elementos do Set");
        System.out.print("\t" + s1);

        // Map, (não implementa collection)
        Map<String, String> m1 = new HashMap<>();
        m1.put("Zeca", "8");// Utiliza put para adicionar
        m1.put("Maria", "31");
        m1.put("Ana", "12");
        m1.put("Diana", "14");
        System.out.println();
        System.out.println("Elementos do Map");
        System.out.print("\t" + m1);       
        
        
        }    
}
