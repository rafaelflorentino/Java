/* 
  Objetivo: Crie um programa em java que crie uma Lista e imprima o conteúdo da Lista na tela.
  Entrada: Sem entrada.
  Saida: Conteúdo da Pillha na tela. 
  Autor: Rafael Florentino.
*/
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
     
        // Cria uma Fila: Primeiro a entrar Primeiro a sair.      
        Queue<String> carros = new LinkedList<>();

        // Adicionar Elementos
        carros.add("HRV");
        carros.add("Golf");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Ferrari");

        // Motra o elemento do topo da Fila
        System.out.println("\nTopo da Fila: "+carros.peek());

        // Motra e Remove o elemento do topo da Fila
        System.out.println("\nRetira o elemento do Topo da Pilha: "+carros.poll());

        // Diz se a pilha esta vazia ou não
        System.out.printf("\nEstado da Fila: %s",carros.isEmpty()?"Fila Vazia" : "Fila Preenchida");



    }
    
}
