/* 
  Objetivo: Crie um programa em java que use iterator para percorrer e imprimir os valores da lista.
  Entrada: Sem entrada.
  Saida:  Impressão dos dados da lista.
  Autor: Rafael Florentino.
*/ 
import java.util.ArrayList;
import java.util.Iterator;

public class UsandoIterator {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();

        // Adicionar Elementos
        carros.add("HRV");
        carros.add("Golf");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Ferrari");
        carros.add("Fusion");
        carros.add("Fusca");

        // Imprimi todo a coleção.
        System.out.println(carros);
        System.out.println("\n");  
        
        // Imprimir elementos da coleção um por um usando next
        Iterator<String> it = carros.iterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("\n");  

        // Imprimir elementos com while usando hasNext
        Iterator<String> it2 = carros.iterator();
        while(it2.hasNext()){ // hasNext Enquanto tiver proximo elemento faça
            String c= it2.next();
            if(c == "Golf"){
                it2.remove();
            }    
        }
        System.out.println(carros);
        System.out.println("\n"); 
        
    }
    
}
