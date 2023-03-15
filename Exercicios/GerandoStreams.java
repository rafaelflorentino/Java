/* 
  Objetivo: Crie um programa que use map, filter, reduce, parallel, sorted e IntSummaryStatistics
  Entrada: Sem entrada.
  Saida:  Impreção dos dados na tela.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GerandoStreams {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

		array.add("abc");
        array.add("bc");
		array.add("");
		array.add("efg");
        array.add("abcd");
        array.add("");
        array.add("jkl");
        array.add("");
        
        List<String> strings = array;
        List<String> filtrado = strings.stream()
            .filter(string -> !string.isEmpty()) // Filtra item por iten e tiro os que forem vazios
            .collect(Collectors.toList()); // Converto para lista de novo
        System.out.println(filtrado); 
        System.out.println("\n"); 
        
        // Usando randon e forEach
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);

        // Map
        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(7);
        num.add(3);
        num.add(5);
        List<Integer> numeros = num;
        List<Integer> listaQuadrados = numeros.stream()
            .map(i -> i * i) // Eleva o elemento ao quadrado, converte A em B
            .distinct() // Pega só os elementos diferentes, repetidos não
            .collect(Collectors.toList()); // junta na lista de novo
        System.out.println(listaQuadrados);
        System.out.println("\n"); 

        // Filter
        List<String> strings2 = array;
        long count = strings2.stream()
            .filter(string -> string.isEmpty()) // filtra os itens removendo os não vazios
            .count(); // conta os elementos vazios
        System.out.println(count);
        System.out.println("\n"); 

        // Sorted                    
        numeros.stream()
            .sorted() // ordena os números
            .forEach(System.out::println);   
        System.out.println("\n");  

        // Parallel
        num.parallelStream()
        .forEach(System.out::println); // Divide tarefa em treads diferentes   
        System.out.println("\n"); 

        // Collectors
        List<String> filtrada = strings.stream()
            .filter(string -> !string.isEmpty())
            .collect(Collectors.toList()); // volta a ser lista
        System.out.println("Lista filtrada: " + filtrada);
        String mergedString = strings.stream()
            .filter(string -> !string.isEmpty())
            .collect(Collectors.joining(", ")); // joining junta as strings, concatena com ,
        System.out.println("Strings unidas: " + mergedString);
        System.out.println("\n"); 

       // Estatisticas 
       IntSummaryStatistics stats = numeros.stream().mapToInt((x) -> x).summaryStatistics();
       System.out.println("Maior número na lista: " + stats.getMax());
       System.out.println("Menor número na lista: " + stats.getMin());
       System.out.println("Soma de todos os números: " + stats.getSum());
       System.out.println("Média de todos os números: " + stats.getAverage()); 
       System.out.println("\n");      
       
       //Redução
      /*  Integer idadeTotal = pessoas
       .stream()
       .mapToInt(Pessoa::getIdade)
       .sum(); 
       
       // outra forma
        Integer idadeTotal = pessoas
        .stream()
        .map(Pessoa::getIdade) // tranforma uma lista de pessoas em string de idades
        .reduce( //reduz
        0, // começa de zero // identidade // caso vazia lista retorna 0
        (a, b) -> a + b);  // acumulador acumula os valores e soma     
       
       */

    }
    
}
