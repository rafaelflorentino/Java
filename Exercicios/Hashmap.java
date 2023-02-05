/* 
  Objetivo: Crie um programa em java que crie uma coleção, adicione e remova valores dessa coleção e imprima os dados na tela.
  Entrada: Sem entrada.
  Saida:  Impressão dos dados na tela.
  Autor: Rafael Florentino.
*/
import java.util.HashMap;

public class Hashmap{
    public static void main(String[] args) {

       // Criando um HashMap / Coleção
        HashMap<Integer,String> carros = new HashMap<Integer,String>();
        
        // Adicionar elementos a coleção
        carros.put(1,"HRV");
        carros.put(2,"Golf");
        carros.put(3,"Polo");
        carros.put(4,"Camaro");
        carros.put(5,"Ferrari");
        carros.put(6,"Cruze");

        // Imprimi todo a coleção.
        System.out.println(carros);
        System.out.println("\n");

        // Traz o valor da chave 1 = HRV.
        System.out.println(carros.get(1));
        System.out.println("\n");
        
        // Imprime todos os elementos da coleção.
        for(int i=1; i<carros.size()+1;i++){
          System.out.println(carros.get(i));
        }
        System.out.println("\n");

        // Remove um elemento da coleção pelo indice
        carros.remove(5);
        carros.remove(6);

        // Remove todos os elementos da coleção
        carros.clear();

        // Imprime todos os elementos da coleção com for it.
        for(String c:carros.values()){
          System.out.println(c);
        }
        System.out.println("\n");
        
    }
}
