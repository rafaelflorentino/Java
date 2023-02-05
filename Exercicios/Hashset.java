/* 
  Objetivo: Crie um programa em java que crie uma coleção única, adicione e remova valores dessa coleção e imprima os dados na tela.
  Entrada: Sem entrada.
  Saida:  Impressão dos dados coleção única na tela.
  Autor: Rafael Florentino.
*/   
import java.util.HashSet;

public class Hashset{ 
    public static void main(String[] args) {

        // Criando uma HashSet / Coleção Única
        HashSet<String> carros = new HashSet<String>();

        // Adicionar Elementos na coleção
        // Hashset só armazena na coleção valores únicos, valore srepetidos não entra
        carros.add("HRV");
        carros.add("Golf");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Ferrari");
        carros.add("Fusion");
        carros.add("Polo"); // não sera adicionado pois o valor e repetido.

        // Imprimi todo a coleção.
        System.out.println(carros);
        System.out.println("\n");

        // Verifica se item foi adicionado ou não, caso calor repedito nãoo adiciona.
        System.out.println(carros.add("Polo")?"SIM":"NÃO"); // add retorna true ou false
        System.out.println("\n");

        // Verifica se item já foi adicionado
        System.out.println(carros.contains("Polo")?"SIM":"NÃO");
        System.out.println(carros.contains("Fusca")?"SIM":"NÃO");// não tem, mas não adiciona na lista

        // Remover um elemento da lista
        carros.remove("Polo");
        System.out.println(carros);
        System.out.println("\n");

        // Remover todos elementos da lista
        carros.clear();
        System.out.println(carros);
        System.out.println("\n");
        
    }

}