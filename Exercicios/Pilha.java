/* 
  Objetivo: Crie um programa em java que crie uma Pilha e imprima o conteúdo da Pillha na tela.
  Entrada: Sem entrada.
  Saida: Conteúdo da Pillha na tela. 
  Autor: Rafael Florentino.
*/
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        
        // Criar uma Pilha: Primeiro a entrar último a sair.
        Stack<String> carros = new Stack<>();

        // Adicionar elementos a Pilha
        carros.push("HRV");
        carros.push("Golf");
        carros.push("Polo");
        carros.push("Camaro");
        carros.push("Ferrari");

        // Imprimir a pilha
        System.out.println(carros);
        System.out.println("\n");

        // Imprimir os dados da Pilha
        for(String c:carros){
            System.out.println(c);
        }
        System.out.println("\n");

        // Motra o elemento do topo da Pilha
        System.out.println("\nTopo da Pilha: "+carros.peek());

        // Mostra e Remove o elemento do topo da Pilha
        System.out.println("\nRetira o elemento do Topo da Pilha: "+carros.pop());

        // Diz se a Pilha esta vazia ou não
        System.out.printf("\nDiz se a pilha esta vazia: %s",carros.empty()?"Pilha Vazia" : "Pilha Preenchida");
        System.out.print("\n");
        System.out.println(carros.empty()?"Pilha Vazia" : "Pilha Preenchida");
    }
}
