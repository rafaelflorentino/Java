/* 
  Objetivo: Crie um programa que use lines, filter par termover linhas em branco, map:: strip para apagar espaços em brancco e collect.
  Entrada: Sem entrada.
  Saida:  impressão dos dados na tela.
  Autor: Rafael Florentino.
*/
import java.util.List;
import java.util.stream.Collectors;

public class MultilineStrings {
    public static void main(String[] args) {
        String multilineString = "Olá \n \n aluno \n explore o Java.";
        List<String> lines = multilineString
        .lines() // divide em linhas, lista de strings
        .filter(line -> !line.isBlank()) // filtra as linhas que não estão em branco
        .map(String::strip) // remove espaços em branco
        .collect(Collectors.toList());  // tranforma em uma lista
        
        System.out.println(lines);
    }
}
