/* 
  Objetivo: Crie um programa em java com array List, adicioone valores na arrayList e remova alguns itens, e imprima os
  valores na tela.
  Entrada: Sem entrada.
  Saida: Elementos da  array.
  Autor: Rafael Florentino.
*/

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>(50);
        
        numeros.add(11);
        numeros.add(22);
        numeros.add(33);

        carros.add("Fusca");
        carros.add("Ferrari");
        carros.add("Camaro");
        carros.add("Porche");
        carros.add(1, "Fusion"); // Fusion entrou na posição do indice [1]
        carros.add("Kombi");

        carros.trimToSize(); // Remove os espaços em branco da array, itens que naão estao sendo usados

        System.out.printf("\nPosição: %d \n", carros.indexOf("Camaro")); // Retorna a posição do index
        carros.remove("Porche"); // Remove elemento da lista
        carros.remove(0); // remove o fusca posição 0

        //carros.clear(); // Limpa todos os elementos da array

        System.out.printf("\n");
        for(int numero:numeros){
          System.out.println(numero);
        }
        System.out.printf("\n");
        for(String carro:carros){
          System.out.println(carro);
        }
        System.out.println("\n"+carros.get(2));

        // Tratamento de erro
        try{
          System.out.println("\n"+carros.get(10)); // Valor não exite da array.
        }catch(IndexOutOfBoundsException e){
          System.out.println("\nERRO 1: "+ e.getMessage());
          System.out.println("Valor fora do indice do array. ");
        }catch(ClassCastException e){
          System.out.println("\nERRO2: "+ e.getMessage());
        }catch(Exception e){
          System.out.println("\nERRO3: "+ e.getMessage());
        }finally{
          System.out.println("Fim do Try"); // No final do try se tiver entrado em algum erro, sai essa mensagem.
        }
        
    }
}
